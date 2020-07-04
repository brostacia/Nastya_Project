import java.util.*;
import java.io.*;

public final class Segmentation

{
    private final String[] abbrevs = new String[0];

    private void paragraph(String text, List<String> res)
    {
	if (text.isEmpty())
	    return;
	String[] lines;
	/*
	if (annotation != null && noPreprocess(annotation))
	{
	    final String[] l = text.split(System.lineSeparator(), -1);
	    lines = Arrays.copyOf(l, l.length - 1);
	} else 
	*/
	    lines = paragraph(text.replaceAll(System.lineSeparator(), " "));
	    //if (annotation != null)
	{
	    if (lines.length > 0)
	    {
	    } //else
		//		lines = new String[]{"%" + annotation.toString()};
	}
	for(String s: lines)
	    res.add(s);
	res.add("");
    }

    private String[] paragraph(String text)
    {
	final Token[] tokens = Tokenizer.tokenize(text);
	for(int i = 0;i < tokens.length;i++)
	    if (isSentSep(tokens, i))
		tokens[i].sentSep = true;
	final List<String> res = new LinkedList();
	StringBuilder b = new StringBuilder();
	for(Token t: tokens)
	    if (t.sentSep)
	    {
		if (b.length() == 0)
		    continue;
		res.add(new String(b));
		b = new StringBuilder();
	    } else
		b.append(t.text);
	if (b.length() > 0)
	    res.add(new String(b));
	return res.toArray(new String[res.size()]);
    }

    private boolean isSentSep(Token[] tokens, int pos)
    {
	if (pos < 0 || pos >= tokens.length)
	    throw new IllegalArgumentException("pos (" + String.valueOf(pos) + " must be non-negative and less than " + String.valueOf(tokens.length));
	final Token t1 = tokens[pos];
	//It must be a space
	if (t1.type != Token.Type.SPACE)
	    return false;
	final Token t0 = pos > 0?tokens[pos - 1]:null;
	//The Predecessor character must mark the end of the sentence
	if (t0 == null || t0.type != Token.Type.PUNC ||
	    (t0.text.charAt(0) != '.' && t0.text.charAt(0) != '!' && t0.text.charAt(0) != '?'))
	    return false;
	final Token pt = pos > 1?tokens[pos - 2]:null;
	//Checking if we have a dot and a single cyrillic letter before it, it could be a name like В. Высоцкий
	if (t0.text.charAt(0) == '.' && pt != null)
	    if (pt.type == Token.Type.CYRIL && isAbbrevWithDot(pt.text))
		return false;
	final Token t2 = pos + 1 < tokens.length?tokens[pos + 1]:null;
	if (t2 == null)
	    return false;
	//If the next token starts with the lower case letter, it is not a sentence end
	if ((t2.type == Token.Type.CYRIL || t2.type == Token.Type.LATIN) && Character.isLowerCase(t2.text.charAt(0)))
	    return false;
	/*
	if (t2.type == Token.Type.NUM)
	    return false;
	*/
	return true;
    }

    private boolean isAbbrevWithDot(String s)
    {
	if (s.length() == 1 && Character.isUpperCase(s.charAt(0)))
	    return true;
	for(String i: abbrevs)
	    if (i.equals(s.toUpperCase()))
		return true;
	return false;
	    }

}
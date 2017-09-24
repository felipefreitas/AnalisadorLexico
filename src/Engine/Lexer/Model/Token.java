package Engine.Lexer.Model;

public class Token 
{

    public TokenType Type;
    public String Content;

    public Token(TokenType tokenType, String content) 
    {
        Type = tokenType;
        Content = content;
    }
}
package edu.ufl.cise.plc;


public class Lexer
    implements ILexer {
    @Override
    public IToken next() throws LexicalException {
        return null;
    }

    @Override
    public IToken peek() throws LexicalException {
        return null;
    }

    public Lexer(String foo) {
        System.out.println("lexer constructor");
    }
    public static void main(String[] args){
        System.out.println("Connor and Micaiah's awesome project");
    }
}

package com.learn.coursera.elementaryImplementations;

/**
 * @author ranjeet
 */
public class Application {

    public static void main(String[] args) {
        SymbolTable<String, String> symbolTable = new SymbolTableLinkedListImpl<String, String>();

        symbolTable.put("test", "test");
    }
}

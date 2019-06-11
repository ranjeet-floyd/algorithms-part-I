package com.learn.coursera.elementaryImplementations;

/**
 * @see  "https://www.coursera.org/learn/algorithms-part1/lecture/7WFvG/symbol-table-api"
 */
public interface SymbolTable<Key, Value> {

    void put(Key key, Value value);

    Value get(Key key);

    void delete(Key key);

    boolean contains(Key key);

    boolean isEmpty();

    int size();

    Iterable<Key> keys();

}

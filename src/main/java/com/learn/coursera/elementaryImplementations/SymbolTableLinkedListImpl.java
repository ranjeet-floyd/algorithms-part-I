package com.learn.coursera.elementaryImplementations;

/**
 * We could do is maintain a linked list. We could keep it in order or keep it unordered.
 * This version keeps it unordered. So we're going to have nodes in the linked list that have key value pairs.
 * They have every key in the symbol table and a value associated with that key. For search,
 * we have to, since it's unordered, scan through the whole list to find a match, a key that's there.
 * For insert, I would also have to scan through all keys to find the place to update a value,
 * if it's a value that's already there. And if there's no match, we could add it to the front.
 * So here's our simple client for traces, so if we associate S with zero, we just had it.
 * That's our one node linked list that's got that information.
 *
 * @author ranjeet
 * @see "https://www.coursera.org/learn/algorithms-part1/lecture/zkDUT/elementary-implementations"
 */
public class SymbolTableLinkedListImpl<Key, Value> implements SymbolTable<Key, Value> {


    private LinkedList<Key, Value> head;
    private LinkedList<Key, Value> current;
    private int currSize;

    public SymbolTableLinkedListImpl() {
        this.head = null;
        this.current = null;
        this.currSize = 0;
    }

    public void put(Key key, Value value) {
        current = new LinkedList<Key, Value>(key, value);
        if (head == null) {
            head = current;
        }

    }

    public Value get(Key key) {
        LinkedList<Key, Value> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return temp.getValue();
            }
            temp = temp.getNext();
        }
        return null;
    }

    public void delete(Key key) {
        LinkedList<Key, Value> temp = head;
        LinkedList<Key, Value> prevTemp = temp;
        while (temp != null) {
            if (temp.getKey().equals(key)) {

            }
            prevTemp = temp;
            temp = temp.getNext();

        }

    }

    public boolean contains(Key key) {
        LinkedList<Key, Value> temp = head;
        while (temp != null) {
            if (temp.getKey().equals(key)) {
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return currSize > 0;
    }

    public int size() {
        return currSize;
    }

    public Iterable<Key> keys() {
        return null;
    }


    /**
     * Linked List
     */
    class LinkedList<K, V> {
        K key;
        V value;
        LinkedList<K, V> next;

        public LinkedList(K key, V value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public LinkedList<K, V> getNext() {
            return next;
        }
    }
}

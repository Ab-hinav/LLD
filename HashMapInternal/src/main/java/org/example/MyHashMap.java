package org.example;

import java.util.HashMap;

public class MyHashMap<K,V> {

    private final int INITIAL_SIZE = 1<<4;
    private final int MAX_CAPACITY = 1<<30;
    public Entry[] hashTable;

    public MyHashMap(){
        hashTable = new Entry[INITIAL_SIZE];
    }


    class Entry<K,V>{

        public K key;
        public V value;
        public Entry next;

        Entry(K k,V v){
            key = k;
            value = v;
            next = null;
        }

    }

    public void put(K key,V val){

        int hashCode = key.hashCode()% hashTable.length;
        Entry node = hashTable[hashCode];

        if (node==null){
            hashTable[hashCode] = node;
        }else {

            Entry prevNode = node;

            while(node!= null){

                if(node.key == key){
                    node.value = val;
                    return;
                }
                prevNode = node;
                node = node.next;
            }

            Entry<K,V> newEntry = new Entry<>(key,val);
            prevNode.next = newEntry;
        }

    }

    public V get(K key){

        int hashCode = key.hashCode()% hashTable.length;
        Entry node = hashTable[hashCode];

        if (node==null){
            return null;
        }

        while (node!=null){
            if(node.key.equals((key))){
                return (V)node.value;
            }
            node = node.next;
        }

        return null;

    }





}

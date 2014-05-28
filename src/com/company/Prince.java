package com.company;

public class Prince {
    King father;
    String name;

    public Prince(King k, String s) {
        father = k;
        name = s;

    }

    public King getFather() {
        return father;
    }

    public String getName() {
        return name;
    }
}
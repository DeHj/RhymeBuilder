package net.plumbumtroll;

import java.util.ArrayList;

public class Block {
    public ArrayList<String> storage;

    public Block(String firstString) {
        storage = new ArrayList<>();
        storage.add(firstString);
    }
}

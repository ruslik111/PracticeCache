package org.example;

import org.example.cache.Cache;
import org.example.cache.storage.Storage;

public class App {
    public static void main(String[] args) {
        Cache<Integer, String> cache = new Cache<>(Storage.Disk, 2);

    }
}


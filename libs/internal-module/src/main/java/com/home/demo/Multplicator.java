package com.home.demo;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Multplicator {

    private int multiplicator;

    public int multiply(int number) {
        return number * multiplicator;
    }
}

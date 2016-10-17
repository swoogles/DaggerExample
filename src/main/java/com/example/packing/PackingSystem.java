package com.example.packing;

public abstract class PackingSystem {
    // Calculate total time spent transferring items between methods of transportation
    protected double shrinkageFactor;

    public double packItems(int numItems) {
      return (numItems * shrinkageFactor);
    }
}


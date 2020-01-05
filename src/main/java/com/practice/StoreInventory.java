package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class StoreInventory {
    Set<String> superCycleSet = new TreeSet<>();
    List<String> myStoreList = new ArrayList<>();

    public StoreInventory() {
        myStoreList.add("Bicycle");
        myStoreList.add("Tricycle");
        myStoreList.add("Scooter");
    }

    public void printStoreInventory() {
        myStoreList.forEach(item-> System.out.println("My Store item: " +item));
    }

    public void collectCycleItems() {
        myStoreList.forEach(item-> {
            if (item.contains("cycle")){
                superCycleSet.add(item);
            }
        });
        System.out.println(superCycleSet);
    }

    public static void main(String[] args) {
        StoreInventory storeInventory = new StoreInventory();
        //storeInventory.printStoreInventory();
        storeInventory.collectCycleItems();
    }
}
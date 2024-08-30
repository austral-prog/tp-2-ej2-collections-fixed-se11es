package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Maps {


    public Map<String, Integer> createInventory(List<String> items) {
        if (items == null) {
            throw new IllegalArgumentException("La lista de artículos no puede ser nula.");
        }
        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    
    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        if (inventory == null || items == null) {
            throw new IllegalArgumentException("El inventario y la lista de artículos no pueden ser nulos.");
        }
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    
    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        if (inventory == null || items == null) {
            throw new IllegalArgumentException("El inventario y la lista de artículos no pueden ser nulos.");
        }
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentCount = inventory.get(item);
                inventory.put(item, Math.max(currentCount - 1, 0)); // No permitir que baje de 0
            }
        }
        return inventory;
    }

   
    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        if (inventory == null || item == null) {
            throw new IllegalArgumentException("El inventario y el artículo no pueden ser nulos.");
        }
        inventory.remove(item);
        return inventory;
    }


    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        if (inventory == null) {
            throw new IllegalArgumentException("El inventario no puede ser nulo.");
        }
        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry);
            }
        }
        return result;
    }
}

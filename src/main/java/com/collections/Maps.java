package com.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Maps {

    // 2.3.1. Crear un inventario basado en una lista
    public Map<String, Integer> createInventory(List<String> items) {
        Map<String, Integer> inventory = new HashMap<>();
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    // 2.3.2. Añadir artículos a partir de una lista a un diccionario existente
    public Map<String, Integer> addItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            inventory.put(item, inventory.getOrDefault(item, 0) + 1);
        }
        return inventory;
    }

    // 2.3.3. Decrementar artículos del inventario
    public Map<String, Integer> decrementItems(Map<String, Integer> inventory, List<String> items) {
        for (String item : items) {
            if (inventory.containsKey(item)) {
                int currentCount = inventory.get(item);
                inventory.put(item, Math.max(currentCount - 1, 0)); // No permitir que baje de 0
            }
        }
        return inventory;
    }

    // 2.3.4. Eliminar por completo un artículo del inventario
    public Map<String, Integer> removeItem(Map<String, Integer> inventory, String item) {
        inventory.remove(item);
        return inventory;
    }

    // 2.3.5. Devolver el contenido del inventario
    public List<Map.Entry<String, Integer>> listInventory(Map<String, Integer> inventory) {
        List<Map.Entry<String, Integer>> result = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
            if (entry.getValue() > 0) {
                result.add(entry);
            }
        }
        return result;
    }
}

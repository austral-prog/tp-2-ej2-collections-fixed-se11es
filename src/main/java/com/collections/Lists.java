package com.collections;

import java.util.List;
import java.util.ArrayList;

public class Lists {

    // Función index_of
    public static int indexOf(String target, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Función index_of_by_index
    public static int indexOfByIndex(String target, List<String> list, int startIndex) {
        if (startIndex < 0 || startIndex >= list.size()) {
            return -1;
        }
        for (int i = startIndex; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }
        return -1;
    }

    // Función index_of_empty
    public static int indexOfEmpty(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("")) {
                return i;
            }
        }
        return -1;
    }

    // Función put
    public static int put(String target, List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("")) {
                list.set(i, target);
                return i;
            }
        }
        return -1;
    }

    // Función remove
    public static int remove(String target, List<String> list) {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                list.set(i, "");
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> colors1 = List.of("Red", "Green", "White", "Black", "Pink", "Yellow", "Black");
        List<String> colors2 = new ArrayList<>(List.of("Red", "Green", "", "", "Pink", "", "Black"));
        List<String> colors3 = new ArrayList<>(List.of("Red", "Green", "White", "Black", "Pink", "Yellow", "Black"));
    }
}

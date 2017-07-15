package br.com.edsilfer.algorithms.exercises;

import java.util.*;

/**
 * Created by ferna on 5/20/2017.
 */
public class Exercise017 {

    private static Map<Integer, List<Integer>> flavors = new HashMap<>();

    private static void printFlavorsIds(int dollars) {
        for (Map.Entry<Integer, List<Integer>> entry : flavors.entrySet()) {
            int complement = dollars - entry.getKey();

            if ((complement > 0) && flavors.containsKey(complement)) {
                int id1, id2;

                if (entry.getValue().size() > 1) {
                    id1 = entry.getValue().get(0) + 1;
                    id2 = entry.getValue().get(1) + 1;
                } else {
                    id1 = entry.getValue().get(0) + 1;
                    id2 = flavors.get(complement).get(0) + 1;
                }

                System.out.println(Math.min(id1, id2) + " " + Math.max(id1, id2));
                return;
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int dollars = in.nextInt();
            int size = in.nextInt();

            for (int a_i = 0; a_i < size; a_i++) {
                int cost = in.nextInt();

                if (flavors.containsKey(cost)) {
                    flavors.get(cost).add(a_i);
                } else {
                    List<Integer> ids = new ArrayList<>();
                    ids.add(a_i);
                    flavors.put(cost, ids);
                }
            }

            printFlavorsIds(dollars);
            flavors.clear();
        }
    }
}

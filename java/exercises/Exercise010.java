package br.com.edsilfer.algorithms.exercises;

import java.util.Comparator;

/**
 * Created by ferna on 5/18/2017.
 */
public class Exercise010 {

    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }

    class Checker implements Comparator<Player> {
        @Override
        public int compare(Player p1, Player p2) {
            int res = p2.score - p1.score;
            return (res == 0) ? p1.name.compareTo(p2.name) : res;
        }
    }

    public static void main(String args[]) {

    }

}

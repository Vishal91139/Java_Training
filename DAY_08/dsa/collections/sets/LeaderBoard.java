package DAY_08.dsa.collections.sets;

import java.util.*;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(450);
        scores.add(200);
        scores.add(125);
        scores.add(320);
        scores.add(197);
        scores.add(275);
        System.out.println(scores);
    }   
}

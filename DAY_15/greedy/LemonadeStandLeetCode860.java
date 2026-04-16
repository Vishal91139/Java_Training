package DAY_15.greedy;

import java.util.List;

public class LemonadeStandLeetCode860 {
    public static boolean lemonadeChange(List<Integer> bills){
        int five = 0, ten = 0;
        for(int bill : bills){
            if(bill == 5){
                five++;
            } else if(bill == 10){
                if(five == 0) return false;
                five--;
                ten++;
            }
        }
    }
}

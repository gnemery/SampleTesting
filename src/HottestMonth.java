
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriel
 * @version 1.0
 */
public class HottestMonth {

    /**
     *
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double highestValue;
        System.out.println("Enter twelve temperature values:");
        highestValue = in.nextDouble();
        int highestMonth = 1;
        for (int currentMonth = 2; currentMonth <= 12; currentMonth++) {
            double nextValue = in.nextDouble();
            if (nextValue > highestValue) {
                highestValue = nextValue;
                highestMonth = currentMonth;
            }
        }
        System.out.println(highestMonth);
    }
}

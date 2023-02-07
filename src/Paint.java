import java.util.Scanner;

/**
 * @class: Paint
 * @author: Nazmun Nahar
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 7, 2023
 * description: this program will calculate the number of gallons
 */

public class Paint {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int l, w, h, window, doors, gallon;
        double vol, quarts;

        window = 21 * 21;

        l = input.nextInt();
        w = input.nextInt();
        h = input.nextInt();

        vol = l * w * h;

    }
}

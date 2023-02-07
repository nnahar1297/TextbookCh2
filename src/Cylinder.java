/**
 * @class: Cylinder
 * @author: Nazmun Nahar
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 7, 2023
 * description: this program will calculate the base area and volume of
 * a cylinder
 */

import java.util.Scanner;
public class Cylinder {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int h, r;
        double pi = 3.1416, barea, vol;

        System.out.println("Enter the height: ");
        h = input.nextInt();
        System.out.println("Enter the radius: ");
        r = input.nextInt();

        barea = pi * r * r;
        vol = pi * r * r * h;

        System.out.println("The base area is: " + barea);
        System.out.println("The volume is: " + vol);
    }
}

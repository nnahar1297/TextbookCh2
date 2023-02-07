import java.util.Scanner;

/**
 * @class: Seconds
 * @author: Nazmun Nahar
 * @course: ITEC2140 - 05, Spring 2023
 * @version: 1.0
 * @date: February 7, 2023
 * description: this program will convert seconds into hours and minutes
 */
public class Seconds {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int prompt, second, minute, hour;

        System.out.print("Enter seconds: ");
        prompt = input.nextInt();

        if(prompt >= 3600){
            hour = prompt/3600;
            prompt = prompt - (hour * 3600);
        }
        else {
            hour = 0;
        }
        if(prompt >= 60){
            minute = prompt/60;
            prompt = prompt - (minute * 60);
        }
        else {
            minute = 0;
        }
        second = prompt;

        System.out.println(hour + " hours " + minute + " minutes " + second + " seconds");
    }
}

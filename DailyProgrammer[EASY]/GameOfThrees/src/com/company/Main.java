package com.company;
import java.util.Scanner;

public class Main {
    //Creates input number and step count
    static int number = 0;
    static int steps = 0;

    public static void main(String[] args) {
        //Creates Scanner for User Input
        Scanner userInput  = new Scanner(System.in);
        System.out.println("Welcome to the Game of Threes!\n Input a number, and see the steps to get it to 1 through two methods:");
        System.out.println("If the number is divisible by 3, divide it by 3. If not, then add or subtract 1 to make it divisible by 3");
        System.out.println("Input your number:");
        number = userInput.nextInt();
        Threes(number);

    }

    public static int Threes(int number){
        if (number == 1) {
        System.out.println("The number is now 1. It took "+steps+" steps");
        } else if (number%3 == 0){
            System.out.println(number + "/3" + "=" + number/3);
            number = number/3;
            steps = steps + 1;
            Threes(number);
        } else {
            if (number%3 == 1){
                steps = steps + 1;
                System.out.println(number + "-1" + "=" + (number-1));
                number = number - 1;
                Threes(number);
            } else if (number%3 == 2){
                System.out.println(number + "+1"+"="+(number+1));
                number = number + 1;
                steps = steps + 1;
                Threes(number);
            }

        }
        return number;


    }


}

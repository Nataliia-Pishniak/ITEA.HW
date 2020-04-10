package hw3;


import java.util.Arrays;
import java.util.Scanner;

public class task1 {

    public static int Swap (){


        return 0;
    }


    public static void main(String[] args) {

        double[] nums = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;

        for (double d : nums) {
            result += d;
        }
        System.out.println("Среднее арифметическое " + result / nums.length);

        int [] middle ={5,7,8,9,16};
        double result1 =0;

        for (int i: middle){
            result1 +=i;
        }
        System.out.println("Average " + result1/middle.length);

        String[] cars = {"ford", "lada", "bmw", "volkswagen"};
        System.out.println(cars[0]);

        int a =8;
        int b = 5;
        int temp = a;
        a = b;
        b=temp;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = a + b; // a = 8, b = 5
        b = a - b; // a = 8, b = 3
        a = a - b; // a = 5, b = 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}


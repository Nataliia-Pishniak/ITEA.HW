package hw1;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {

//Дописати в код введення логіну та паролю, повторення паролю і перевірку на правильність повторення.

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);

        String a1;
        int a2;
        int a3;

        System.out.println("Login");
        a1 = s1.nextLine();

        System.out.println("Password");
        a2 = s2.nextInt();

        System.out.println("Repeat Password");
        a3 = s3.nextInt();

        if (a2 == a3) {
            System.out.println("Correct Login");
        } else {
            System.out.println("Incorrect Login, bye");
        }
    }
}

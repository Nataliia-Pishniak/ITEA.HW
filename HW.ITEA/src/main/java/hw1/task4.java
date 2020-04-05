package hw1;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) throws java.lang.Exception {

        //Напишіть код програми “Повторювач", який виводить те саме число, що і було введене. Спробуйте це для цілих і дійсних чисел
        //Додати в   код програми  “Повторювач" питання
        //- “Повторити ще раз?”
        //В разі відповіді “yes”, дати ще одну спробу, інакше вивести “Дякую. Розмову завершено”

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        /*
        int decision = 1;
        while (decision == 1) {
            System.out.println("Enter an integer");
            int a1;
            a1 = s1.nextInt();
            float b = a1;
            System.out.println(a1);
            System.out.println(b);

            System.out.println("Repeat again? Yes - 1; No - 0;");
            decision = s2.nextInt();
        }
         */
        //System.out.println("Thank you, bye");

    int decision;

    do {
        System.out.println("Enter an integer");
        int a1;
        a1 = s1.nextInt();
        float b = a1;
        System.out.println(a1);
        System.out.println(b);

        System.out.println("Repeat again? Yes - 1; No - 0;");
        decision = s2.nextInt();

    }  while (decision == 1);

    System.out.println("Thank you, bye");


    }
}

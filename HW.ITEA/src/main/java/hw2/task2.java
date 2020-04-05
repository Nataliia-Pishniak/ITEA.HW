package hw2;

public class task2 {

 //Напишіть програму, яка виводить квадрати та квадратні корені чисел від 1 до 100 трьома різними циклами

//First

   public static void main(String[] args) {

        int skolkoraz = 0;
        double a = 2.0;
        double b = 0.5;
        while (skolkoraz<100) {
            skolkoraz++;
            System.out.println("chislo: " + skolkoraz +  " ego kavadrat = " + ((int)Math.pow((double)skolkoraz,a)) + " a koren = " + Math.pow((double)skolkoraz, b));
        }
/*
//Second
        do {
            skolkoraz++;
            System.out.println("chislo: " + skolkoraz +  " ego kavadrat = " + ((int)Math.pow((double)skolkoraz,a)) + " a koren = " + Math.pow((double)skolkoraz, b));
        }
        while (skolkoraz <100);
*/
// Third

        for (skolkoraz=0; skolkoraz<100; skolkoraz++) {

            System.out.println("chislo: " + skolkoraz + " ego kavadrat = " + ((int) Math.pow((double) skolkoraz, a)) + " a koren = " + Math.pow((double) skolkoraz, b));
        }
        }
    }


package hw3;

public class task2 {


    public static void main(String[] args) {


        //Заповніть масив випадковими числами та знайдіть:

        int [] array2;
        array2 = new int [20];

        for (int i =0; i<array2.length; i++){
            array2[i] = (int)(Math.random() * array2.length);
            System.out.println(array2[i]);
        }

        //- суму всіх елементів
        int sum =0;

        for (int i=0; i<array2.length; i++){
            sum = sum + array2[i];
        }
        System.out.println("Sum is:"  +sum);

        //- кількість елементів, більших 1
        int a =1;
        int b =0;

        for (int i:array2 ){
            if (i>a){
                b++;
            }
        }
        System.out.println("кількість елементів, більших  a - " + b);

    }
}

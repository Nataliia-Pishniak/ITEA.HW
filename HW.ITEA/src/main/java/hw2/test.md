# hello
```java
public class task1 {

    public static void main(String[] args) throws java.lang.Exception {

    //Напишіть програму розрахунку суми двох чисел з виведенням результату та виведенням у вигляді прикладу
        int x = 10;
        int y = 5;
        int z = x + y;
        System.out.println(z);
        System.out.println("printing " + x + " + " + y + " = " +z);

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter an integer");
        int a;
        a =s1.nextInt();
        System.out.println(a);

      //Напишіть код програми “Повторювач", який виводить те саме число, що і було введене. Спробуйте це для цілих і дійсних чисел
        Scanner s2 = new Scanner (System.in);
        System.out.println("Enter an integer");
        int a1;
        a1 = s2.nextInt();
        float b = a1;
        System.out.println(a);
        System.out.println(b);
    }
}
```
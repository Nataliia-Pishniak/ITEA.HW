package hw2;

public class task1 {

    private static String znakmethod(int number) {

        String ret="";

        if (number == 0) {
            ret = "zero";
            return ret;
        }

        if (number < 0) {
            ret= "-";
        }

        if (number > 0) {
        ret= "+";
        }

        return ret;
    }

    private static void print_this_shit(String shit) {

        System.out.println(shit);

    }



    public static void main(String[] args) {
//Напишіть код порозрядного ділення трьохзначного числа (сотні, десятки , одиниці)
        int a = 785;
        int result1 = (((a / 100) % 100) * 100) / 100;
        int result2 = (((a / 10) % 10) * 10) / 10;
        int result3 = (a % 10);

        System.out.println(result1 + "+" + result2 + "+" + result3);

        //Напишіть код програми, в якій вводиться число і виводиться  його знак (+, -) або “zero”

        int our_number=4;
        String our_reply = znakmethod(our_number);

        print_this_shit(our_reply);

    }

}


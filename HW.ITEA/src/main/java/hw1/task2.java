package hw1;

public class task2 {

    public static void main (String[] args) throws java.lang.Exception
    {
    // Додайте в коди   3   задач, які ви записали раніше різні умови:
        //- короткі
        //- повні
        //- складені

        int x = 25;
        int y = 6;

        if (x > y) {
            System.out.println("x is greater than y");
        }

        int greeting = 17;
        if (greeting < 18) {
            System.out.println("Good Day");
        } else {
            System.out.println("Good evening");
        }


        int time = 5;
        if (time  < 12) {
            System.out.println("Good morning");
        }else if (time > 12){
            System.out.println("Good day");
        } else {
            System.out.println("Hello");
        }

        int weekday = 3;
        switch (weekday){
            case 6 :
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("work day");
        }
    }
}



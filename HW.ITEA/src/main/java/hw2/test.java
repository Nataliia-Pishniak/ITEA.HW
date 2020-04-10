package hw2;

public class test {




    public static void main(String[] args)
    {

        nested_class nc = new nested_class();
        System.out.println(nc.hi());
        System.out.println(nested_class.hi());

        nc.a = 5;
        nc.add_one();
        System.out.println(nc.a);

    }
}

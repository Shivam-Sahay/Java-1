public class Main10 {
    public int a;
    public int b;

    public void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public void add(double a, double b)
    {
        System.out.println(a+b);
    }

    public void multiply(int a, int b)
    {
        System.out.println(a*b);
    }

    public void multiply(double a, double b)
    {
        System.out.println(a*b);
    }

    public void concat(String a, String b)
    {
        System.out.println(a+b);
    }
    public void concat(String a, String b, String c)
    {
        System.out.println(a+b+c);
    }
    public static void main(String [] args)
    {
        Main10 obj= new Main10();
        obj.add(22,33);
        obj.add(22.33,44.55);
        obj.multiply(33,44);
        obj.multiply(4.4, 5.6);
        obj.concat("heyy"," good morning");
        obj.concat("heyy"," good morning", " have a nice day");


    }

};

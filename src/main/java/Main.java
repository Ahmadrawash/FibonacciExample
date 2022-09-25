public class Main {
    public static void main(String args[])
    {
        for(int i = 0 ; i < 5;  i++)
            System.out.println("fibonacci of " + i + " is " + fibonacci(i) );
    }

    static public int fibonacci(int n)
    {
        if (n < 2)
            return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }
}

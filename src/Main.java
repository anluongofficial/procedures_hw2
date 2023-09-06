public class Main {
    public static void main(String[] args) {
        System.out.println(sumUpTo(20));

    }
    static int sumUpTo (int n)
    {
        n = (n*(n+1))/2;
        return n;
    }
}
public class Program1{
    public static void main(String[] args) {
        // hello bro clone
        int a=2;
        int b=8;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+","+b);
    }
}
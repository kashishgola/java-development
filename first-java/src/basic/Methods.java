package basic;

public class Methods {
    public static void main(String[] args) {
        msg("kkkkk");
        msg("Rohit");
        System.out .println("Sum "+add(10, 20));

    }
    private static void msg(String name){
        System.out.println("Hello " +name);

    }
    private static int add(int a, int b){
        return a + b;
    }
}

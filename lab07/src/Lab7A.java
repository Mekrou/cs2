public class Lab7A {
    public static int recursive_multiply(int a, int b) {
        if (b == 1) {
            return a;
        } else if (a == 0 || b == 0) {
            return 0;
        }

        return a + recursive_multiply(a, b - 1);
    }
    
    public static void main(String[] args) {
        System.out.println(recursive_multiply(3,4));
    }
}

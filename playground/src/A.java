public class A {

  public static String question(String x) {
    if (x.length() == 0) {
      return x;
    } else {
      return "X" + question(x.substring(0, x.length() - 1));
    }
  }

  public static void main(String[] args) {
    String y = question("ABCDE");
    System.out.println(y);
  }
}
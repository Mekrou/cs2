public class A {
    private int x;
    private int y;
  
    public A(int a, int b) {
      x=a;
      y=b;
    }
  
    @Override
    public String toString() {
      return x+" "+y;
    }
  }
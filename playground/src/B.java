
class B extends A {
    private int z;
  
    public B(int a, int b, int c) {
      super(a,b);
      z=c;
    }
   
    @Override
    public String toString() {
      return super + " " + z;
    }
  }
  
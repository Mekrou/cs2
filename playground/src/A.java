public class A {

  

  
public static void check_age(int age) throws Exception {
  if(age<0) {
    throw new Exception("Age cannot be below 0");
  }
  else if(age>140) {
    throw new Exception("That seems too high.");
  }
}

public static void main(String[] args) {
  
try {
  check_age(144);
}
catch(Exception e) {
  System.out.println(e.getMessage());
}

}


}
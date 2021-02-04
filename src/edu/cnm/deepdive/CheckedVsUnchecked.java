package edu.cnm.deepdive;

public class CheckedVsUnchecked {


  public static void main(String[] args) {
//      myMethod(); this doesn't compile because we throw a checked exception that needs to be handled
//      in the code.

        anotherMethod();//compiles because a RuntimeException is an unchecked exception.
  }

  public static void myMethod() throws Exception {//throws meaning that there is a possibility that
    //this method will throw an exception.
    throw new Exception("Failed to load");//creating a new instance of exception and then throwing it.
    //this is a checked exception meaning that we assume that something might go wrong.
  }

  public static void anotherMethod() {
    throw new RuntimeException("wrong parameter");//RuntimeException is an unchecked exception.
  }
}

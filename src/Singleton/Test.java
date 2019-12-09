package Singleton;

public class Test {

  public static void main(String[] args) {
    President president = new President().getInstance();;

    President president1 = new President().getInstance();;

    System.out.println(president == president1);
  }
}

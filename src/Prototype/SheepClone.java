package Prototype;

public class SheepClone {

  public static void main(String[] args) throws CloneNotSupportedException {
    Sheep original = new Sheep("Jolly", "Mountain Sheep");
    original.getName();
    original.getCategory();

    Sheep clone = original.clone();
    clone.setName("Yea Fool");
    System.out.println(original.getName() + " " + original.getCategory());
  }
}

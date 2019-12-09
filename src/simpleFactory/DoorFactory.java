package simpleFactory;

public class DoorFactory {

  public static Door makeDoor(float width, float height){
    return new WoodenDoor(width, height);
  }

  public static void main(String[] args) {
    Door door = new WoodenDoor(100, 200);
    door.getWidth();
    door.getHeight();

  }
}

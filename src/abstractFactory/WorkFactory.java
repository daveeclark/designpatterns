package abstractFactory;

public class WorkFactory {

  public static void main(String[] args) {

    Door door;

    WoodenDoorFactory woodenFactory = new WoodenDoorFactory();
    woodenFactory.makeDoor().getDescription();
    woodenFactory.makeFittingExpert().getDescription();

    IronDoorFactory ironFactory = new IronDoorFactory();
    ironFactory.makeDoor().getDescription();
    ironFactory.makeFittingExpert().getDescription();
  }


}

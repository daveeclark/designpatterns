package Builder;

public class CreateBurger {

  public static void main(String[] args) {
    BurgerBuilder burger = new BurgerBuilder();
    burger.burgerSize(12);
    burger.addCheese();
    burger.addLettuce();
    burger.addTomato();
    burger.build();

  }
}

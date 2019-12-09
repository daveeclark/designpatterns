package Builder;

public class Burger {

  protected int size;
  protected boolean cheese;
  protected boolean pepperoni;
  protected boolean lettuce;
  protected boolean tomato;

  public Burger(){}

  public Burger(int size, boolean cheese, boolean pepperoni, boolean lettuce, boolean tomato) {
    this.size = size;
    this.cheese = cheese;
    this.pepperoni = pepperoni;
    this.lettuce = lettuce;
    this.tomato = tomato;
  }
}

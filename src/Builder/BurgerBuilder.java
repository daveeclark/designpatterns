package Builder;

public class BurgerBuilder {
    protected int size;
    protected boolean cheese;
    protected boolean pepperoni;
    protected boolean lettuce;
    protected boolean tomato;

    public int burgerSize(int size){
      return this.size = size;
    }

    public boolean addCheese(){
      return this.cheese = true;
    }

    public boolean addPepperoni(){
      return this.pepperoni = true;
    }

    public boolean addLettuce(){
      return this.lettuce = true;
    }

    public boolean addTomato(){
      return this.tomato = true;
    }

    public Burger build(){
      return new Burger();
    }

}

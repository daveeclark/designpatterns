package Prototype;

public class Sheep implements Cloneable {
  protected String name;
  protected String category;

  public Sheep(String name, String category){
    setName(name);
    setCategory(category);
  }

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public String getCategory(){
    return category;
  }

  public void setCategory(String category){
    this.category = category;
  }

  public Sheep clone() throws CloneNotSupportedException {
    return (Sheep) super.clone();
  }

}

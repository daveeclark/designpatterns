package factoryMethod;

public class ConductInterviews {

  public static void main(String[] args) {

    DevelopmentManager developmentManager = new DevelopmentManager();
    developmentManager.takeInterview();


    MarketingManager marketingManager = new MarketingManager();
    marketingManager.takeInterview();

  }
}

package factoryMethod;

public abstract class HiringManager {

  private Interviewer interviewer;

  abstract protected Interviewer makeInterviewer();

  public Interviewer getInterviewer() {
    return interviewer;
  }

  public void setInterviewer(Interviewer interviewer) {
    this.interviewer = interviewer;
  }

  public void takeInterview(){
    this.interviewer = makeInterviewer();
    interviewer.askQuestions();
  }
}

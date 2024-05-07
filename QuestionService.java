import java.util.Scanner;

public class QuestionService {
  Question[] questions = new Question[5];
  String selection[] = new String[5];

  public QuestionService(){
    questions[0] = new Question(1,"Who invented Java Programming?","Guido van Rossum","James Gosling","Dennis Ritchie","Bjarne Stroustrup", "James Gosling");
    questions[1] = new Question(1,"Which component is used to compile, debug and execute the java programs?","JRE","JIT","JDK","JVM", "JDK");
    questions[2] = new Question(1,"Which one of the following is not a Java feature?","Object-oriented","Use of pointers","Portable","Dynamic and Extensible", "Use of pointers");
    questions[3] = new Question(1,"Which of these cannot be used for a variable name in Java?","identifier & keyword","identifier","keyword","none of the mentioned", "keyword");
    questions[4] = new Question(1," What is the extension of java code files?",".js",".txt",".class",".java", ".java");
  }

  public void playQuiz(){
    int i=0;
    for(Question q : questions){
      System.out.println("Question No. : " + q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i] = sc.nextLine();
      i++;
    }
    for(String s : selection){
      System.out.println(s);
    }
  }

  public void printScore(){
    int score = 0;

    for(int i=0; i<questions.length; i++){
      Question que = questions[i];
      String actualAnswer = que.getAnswer();
      String userAnswer = selection[i];

      if(actualAnswer.equals(userAnswer)){
        score++;
      }
    }
    System.out.println("Your score is : " + score);
  }
}

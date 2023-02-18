package project2;

import java.util.SortedMap;

public abstract class Marks {
    //We have to calculate the average of marks
    //obtained in three subjects by student A and by
    //student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning
    //the average percentage of marks. Provide
    //implementation of abstract method in classes
    //'A' and 'B'. The constructor of student A takes the
    //marks in three subjects as its parameters and
    //the marks in four subjects as its parameters for
    //student B. Test your code


        abstract void getPercentage();


}
class A extends Marks{

    int mark1;
    int mark2;
    int mark3;


  public   A( int mark1, int mark2, int mark3) {

      this.mark1=mark1;
      this.mark2=mark2;
      this.mark3=mark3;
    }

    @Override
   void getPercentage() {
        double maxMark=100;
        System.out.println("The overage percentage of Student A marks is "+(((mark1+mark2+mark3)/(maxMark*3))*100)+"%");
    }
}
class B extends A{
    double maxMark=100;

    int mark4;
   public B(int mark1, int mark2,int mark3,int mark4){
        super(mark1,mark2,mark3);

        this.mark4=mark4;

    }
    @Override
   void getPercentage() {
        System.out.println("The overage percentage of Student B marks is "+(((mark1+mark2+mark3+mark4)/(maxMark*4))*100)+"%");
    }
}
class MarksTester{
    public static void main(String[] args) {
        Marks []percentage={new A(98,85,90),new B(80,96,75,85)};
        for (Marks p:percentage){
       p.getPercentage();
        }
    }
}

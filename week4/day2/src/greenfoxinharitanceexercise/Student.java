package greenfoxinharitanceexercise;

public class Student extends Person {
    String previousOrganization;
    int skippedDays;

    public Student(){
        super();
        previousOrganization ="The School of Life";
        skippedDays = 0;
    }

    public Student(String name, int age, String gender, String previous){
        super(name,age,gender);
        skippedDays = 0;
        this.previousOrganization = previous;
    }

    @Override
    public void getGoal(){
        System.out.println("My goal is: Be a junior software developer.");
    }
    @Override
    public void introduce(){
        System.out.println("Hi, I'm " + name +", a " + age + " year old " + gender + " from " +
                previousOrganization + " who skipped " + skippedDays + " days from the course already.");
    }

    public void skipDays(int numbersOfTheDay){
        this.skippedDays += numbersOfTheDay;
    }

}

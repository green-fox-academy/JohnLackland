public class Tree {
    String type;
    String sex;
    int age ;
    String leafColor;

    public Tree(){

    }

    public  void typeAndColor(){
        System.out.println("The " + type + "'s leaf color is " + leafColor);
    }

    public  void age(){
        System.out.println("It is " + age + " years old!");
    }

    public  void sex(){
        System.out.println("She/He is a" + sex + "tree");
    }
}

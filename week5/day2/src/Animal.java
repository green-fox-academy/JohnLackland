public class Animal {
    String name;
    boolean isHealthy;
    int healCost;

    public Animal() {
        this.name = getClass().getSimpleName();
    }
    public Animal(String name){
        this.name = name;
    }

    public void heal(){
        this.isHealthy = true;
    }

    public boolean isAdoptable(){
        if (isHealthy){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public String toString(){
        if (isAdoptable()){
            return  this.name + " is healthy, and adoptable";
        } else {
            return this.name + " is not healthy (" + healCost +"€), and not adoptable";
        }
    }
}

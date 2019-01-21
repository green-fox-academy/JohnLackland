public class Compare {
    public static void main(String[] args) {

        int[] p1 ={1,2,3};
        int[] p2 = {4,5};

        if (p2.length > p1.length)
        {
            System.out.println("p2 has more elements");
        }
        else if (p2.length == p1.length)
        {
            System.out.println("p1 and p2 have got hte smae omount of elements!");
        }
        else
        {
            System.out.println("p1 has more elements");
        }
    }
}

public class SecondsInADay {
    public static void main(String[] args) {

        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int passedSeconds =14 * 60 * 60 + 34 * 60 + 42;
        int allSeconds = 24*60*60;

        System.out.println(allSeconds-passedSeconds  );
    }
}

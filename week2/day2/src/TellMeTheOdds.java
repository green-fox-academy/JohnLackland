public class TellMeTheOdds {
    public static void main(String[] args) {
        String theURL = "https//www.reddit.com/r/nevertellmethebots";


        theURL = theURL.replace("bots","odds");
        theURL = theURL.replace("s", ":");

        System.out.println(theURL);



    }
}

public class Anagramm {
    public static void main(String[] args) {
        System.out.println(anagramm("soross", "soros"));
    }

    public static boolean anagramm(String first, String second) {
            String longerWord;
            String shorterWord;
            if (first.length() >= second.length()){
                longerWord = first;
                shorterWord = second;
            }else{
                longerWord = second;
                shorterWord = first;
            }
            for (int i = 0; i < shorterWord.length(); i++) {
                char character = shorterWord.charAt(i);
                if (!longerWord.contains(Character.toString(character))) {
                    return false;
                }
            }
        return true;
    }
        }


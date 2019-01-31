public class String1 {
    public static void main(String[] args) {

        String valami = "gyyyxxxxxgxdxxxXXxxrgegxeXXewfrge";
        int length = valami.length();
        System.out.println(capitalLetter(valami, length));
    }
    public static String capitalLetter (String valamii, int length){

        if (length >= 0){
          valamii = capitalLetter(valamii,length - 1);
            valamii = valamii.replaceFirst("x","y");

        }
        return valamii;
    }
}

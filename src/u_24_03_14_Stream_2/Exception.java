package u_24_03_14_Stream_2;

public class Exception {
    public static void main(String[] args) {
        boolean answer;
        answer = isInt("85697");
        System.out.println(answer);
        answer = isInt("98651321654654");
        System.out.println(answer);
        answer = isInt("maskara");
        System.out.println(answer);
        /*
        answer = isIntFinally("85697");
        System.out.println(answer);
        answer = isIntFinally("98651321654654");
        System.out.println(answer);
        answer = isIntFinally("maskara");
        System.out.println(answer);

         */

    }

    public static boolean isInt(String str) {
        System.out.println("Checking if the string "+str+" is an Integer...");
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Lies! That's no integer!");
            return false;
        }
        System.out.println("That's an integer!");
        return true;
    }

    /*
    public static boolean isIntFinally(String str) {
        System.out.println("Checking if the string "+str+" is an Integer...");
        try {
            Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Lies! That's no integer!");
            return false;
        } finally {
            System.out.println("That's an integer!");
            return true;
        }
    }

     */
}

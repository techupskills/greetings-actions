/*  Echo Message Java Program */
/* 8-31-21 */
public class echoMsg  {
    public static void main(String[] args) {
	System.out.println("Greetings!");
        if (args.length > 0) {
           System.out.println("Here are the arguments you passed in.");
           for (String s: args) {
               System.out.println(s);
           }
        }
        else {
           System.out.println("No arguments were passed in.");
        }
    }
}

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String Name=input.nextLine();
//        ---------------------------------CHAR AT ( is used to fetch character by index )-----------------------------------------------
        for (int i = 0; i < Name.length(); i++) {
            System.out.println(Name.charAt(i));
        }

        /*----------------------------COMPARE_TO------------------------------------------------
        * compareTo will return
        * str1==str2 ==> return 0
        * str1>str2 ==> return +ve
        * str1<str2 ==> return -ve

        if(Name.compareTo("Sam")==0){
            System.out.println("You are not a valid user");
        }else if(Name.compareTo("Neeraj")==0){
            System.out.println("You are a Valid user");
        }
        -------------------------------------------------------------------------------* */
        /*----------------------------------new object of String class---------------------------------------------
        if(new String("Neeraj").compareTo("Sam")==0){
            System.out.println("You are not a valid user");
        }else if(new String("Neeraj").compareTo("Neeraj")==0){
            System.out.println("You are a Valid user");
        }
         -------------------------------------------------------------------------------*/
/*-------------------------------------SUB STRING ------------------------------------
        String Name="Neeraj Prasad";
        System.out.println(Name.substring(0,7));

 */
    }
}

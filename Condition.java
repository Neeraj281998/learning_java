import java.util.Scanner;


public class Condition {
    public static void main(String[] args){
         Scanner input =new Scanner(System.in);
//         int age=input.nextInt();

//         IF ELSE
//
//         if(age>18){
//             System.out.println("Adult");
//         }else{
//             System.out.println("Not Adult");
//         }

//         ---------------------------------------------------------
//         CASE CONDITION
        int button=input.nextInt();

        switch (button){
            case 1:
                System.out.println("You pressed the button 1");
                break;
            case 2:
                System.out.println("You pressed the button 2");
                break;
            case 3:
                System.out.println("You pressed the button 3");
                break;
            default:
                System.out.println("You have pressed the invalid button");
        }
    }

}

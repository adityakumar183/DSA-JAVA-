package practice_question;
import java.util.Scanner;
public class king {
    public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.print("enter a number: ");
            int x=sc.nextInt();
            if (x==18){
                System.out.println("you entered: THE KING KOHLI");
            }
            else if (x==45){
                System.out.println("you entered : RO-HIT MAN SHARMA");
            }
            else
                System.out.println("you entered : " +x);
            System.out.print("thank you......");
        }
    }


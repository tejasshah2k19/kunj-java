import java.util.Scanner;
class BasicCalc{
 
    public static void main(String[] args) {
 
            // Scanner -> nextInt() 
            Scanner scr = new Scanner(System.in);//System.in -> keyboard 
                                    //DataString , file ,

            int a,b,c; 
            System.out.println("Enter two numbers");
            a = scr.nextInt();
            b = scr.nextInt(); 
            c=a+b; 
            System.out.println("addition = "+c);
    }
}
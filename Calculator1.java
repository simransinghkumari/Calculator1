
import java.util.Scanner;

public class Calculator1 {

    public static void main(String args[]){
        Scanner t = new Scanner(System.in);
        double fn= 0;
        double sn = 0;
        double result=0;
        System.out.println("Enter first number: ");
        fn = t.nextDouble() ;
        System.out.println("Enter operator: ");
        String ope = t.next();
            if (ope == "sin" || ope == "cos"){
            switch(ope){
        case "sin":
            result = Math.toRadians(Math.sin(fn));
            System.out.println(result);

            break;
        case "cos":
            result = Math.toRadians(Math.cos(fn));
            System.out.println(result);

            break;
       

        default : 
            break;



            }
            System.out.println(Math.toRadians(result));
            }
            else

                System.out.println("Enter second number: ");
                sn = t.nextDouble();  
            switch (ope){
        case "+":
            result = fn + sn;
            System.out.println(result);

            break;
        case "-":
            result = fn - sn;
            System.out.println(result);

            break;
        case "*":
            result = fn * sn;
           System.out.println(result);

            break;
        case "/":
            result = fn / sn;
            System.out.println(result);

            break;

        default:
            System.out.println("invalid input");
        }

           

    }
}
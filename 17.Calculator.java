import java.util.*;
public class Calculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

       
       
        System.out.print("Enter A : ");
        int a = sc.nextInt();

        System.out.print("Enter B : ");
        int b = sc.nextInt();

        System.out.print("Calculation: ");
        String Calculate = sc.next();
       
        switch (Calculate) {
                case "add": System.out.println("Addition is : "+ (a+b));
                    break;
                case "sub": System.out.println("Substraction is : "+ (a-b));
                    break;
                case "mult": System.out.println("Multiplication is : "+ (a*b));
                    break;
                case "div": System.out.println("Division is : "+ (a/b));
                    break;
                default: System.out.println("Enter Valid Data");
                    break;
        }


        sc.close();



    }
}

import java.util.*;

public class conditionalstatements {
    public static void main(String arg[]){
        int age = 14;
        if(age >= 18){
            System.out.println("adult : drive , vote");
        }
        if(age > 13 && age < 18){
            System.out.println("Teenager");
        }
        else{
            System.out.println("not adult");
        }


        int a=1;
        int b=3;
        if (a>b) {
            System.out.println("a is greater");
        }else{
            System.out.println("b is greater");
        }

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x%2==0) {
            System.out.println("even");
            
        } else {
            System.out.println("odd");
        }

        sc.close();
    }
}

import java.util.*;
public class ITC {
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income : ");
        int income = sc.nextInt();
        int tax = 0 ;

        if (income<500000) {
                tax = 0;           
        } else if (income > 500000 && income < 1000000){
             tax = (int)(income *0.2);
        } else if(income>1000000){
           tax = (int)(income*0.3);
        }
        System.out.println("Total Tax: "+ tax);
        
        sc.close();
    }
}

import java.util.*;
public class greatestofthree {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();

        if((a>b)&&(a>c)){
            System.out.println("a is greater : " + a);
          
        }
        else if (b>c) {
            System.out.println("b is greater : "+b);
        }
        else{
            System.out.println("c is greater : "+c);
        }
sc.close();

    }
    
}

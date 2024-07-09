import java.util.*;


@SuppressWarnings("unused")
public class typeconversion {
    public static void main(String args[]){
        //type conversion
        // int a = 25;
        // long b = a;
        // // long a =25;
        // // int b = a ;
        // System.out.println(b);

        // //type casting
        // int marks = (int)(99.99f);
        // System.out.println(marks);

        // char ch = 'a';
        // int num = ch;

        //Type Promotion In expression --> 1.java automatically byte,short,char ki size badha kr unko integer ki tarah trat krta hai.(when evaluting an expression)
                                    // --> 2.if one oprand is long,float or double the whole expression is promoted to long-->same for float & double.
        char m = 'a';
        char n = 'b';
        System.out.println(m); 
        System.out.println((int)(m)); 
        System.out.println((int)(n));
        System.out.println(n-m); 
 



    }
}

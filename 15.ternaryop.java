public class ternaryop {
    public static void main(String args[]){
    
        int num = 5;
        //Ternary Operator
        String type = (num%2==0)?"even":"odd";
        System.out.println(type);

       int a =15;
       int b =6;
       int large = (a>b)?a:b;
       System.out.println(large);

       int marks = 35;
       String status = (marks>33)?"PASS":"FAIL";
       System.out.println(status);
}
}
public class arithematicoperators {
    public static void main(String args[]){
   
        //Operators
        //1.Arithrmatic Operators (unary,binary-->two oprands)

        //binary
        int a = 5;
        int b = 10;

        //1.(+ operator) Addition
        int sum = b + a ;
        System.out.println(sum);

        //2.(- operator) Substraction
         int sub = b - a;
        System.out.println(sub);

        //3.(* operator) Multiplication
        int mult = b * a;
        System.out.println(mult);

        //4.(/ operator) Division
        int div = b / a;
        System.out.println(div);

        //5.(% operator)
        int mod = b % a;
        System.out.println(mod);

        //Unary Operators
        //1.Increment(pre/post)

        // // pre increment
        int c = 5;
        int d = ++c;
        System.out.println(d); 

        //post increment
        int g = 5;
         int e = g++;
        System.out.println(e);

         //2.Decrement(pre/post)
         //pre
         int i = 5;
         int f = --i;
         System.out.println(f);
         //post
         int x = 5;
         int y = x--;
         System.out.println(y);
    }
}

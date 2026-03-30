public class Main{
    public static void main (String args []){

        int a = 2 + 3;
        String s = " Tech " + " Corp "; 
        boolean result = true && false ;

        System.out.println(a);
        System.out.println(s);
        System.out.println(result);

        int sum = 7 + 5;
        double total = 2.5 + 1.5;
        System.out.println(sum);
        System.out.println(total);

        int difference = 10 - 4;
        double balance = 100.0 - 35.5;
        System.out.println(difference);
        System.out.println(balance);

        int product = 3 * 4;
        double scaled = 2.5 * 3;
        System.out.println(product);
        System.out.println(scaled);

        int result1 = 7 / 2; // 3
        double result2 = 7.0 / 2; 
        System.out.println(result1);
        System.out.println(result2);

        int remainder = 7 % 2;
        System.out.println(remainder);

        int x = +5;
        int y = -5;
        System.out.println(x);
        System.out.println(y);


        boolean valid = false ;
        boolean resultt = ! valid ; 
        System.out.println(valid);
        System.out.println(resultt);

        int z = ~ x ;
        System.out.println(z);

        x++;
        System.out.println(x);
        ++x;
        System.out.println(x);


        int b = ++ a ; // a = 6 , b = 6
        int c = 5;
        int d = c ++; 
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        x--; 
        System.out.println(x);
        boolean result15 = ( a == 5) ;
        boolean result26 = ( a != 3) ;
        boolean result3 = (10 > 3) ;
        boolean result4 = (2 < 9) ;
        System.out.println(result15);
        System.out.println(result26);
        System.out.println(result3);
        System.out.println(result4);

        int score = 54; 
        boolean result5 = ( score >= 50) ;
        System.out.println(score);
        System.out.println(result5);

        int age = 3; 
        boolean result6 = ( age <= 18) ;
        System.out.println(result6);

        int cash = 35; 
        int employees = 4; 

        boolean result7 = ( cash > 1000) && ( employees > 0) ;
        System.out.println(result7);

        boolean finished = true;
        int progress = 7;
        int requiredWork = 56; 

        boolean result88 = ( finished ) || ( progress >= requiredWork ) ;
        System.out.println(result88);



        boolean result444 = !finished ;
        System.out.println(result444);


        boolean dd= true & false ;
        boolean bb= true | false ;
        boolean cc= true ^ false ;

        System.out.println(dd);
        System.out.println(bb);
        System.out.println(cc);

        int j = 6 & 3;
        System.out.println(j);

        j= 6 | 3;
        System.out.println(j);

        j = 6 ^ 3;
        System.out.println(j);

        x = 3 << 1;
         System.out.println(x);
        x = 8 >> 1;
         System.out.println(x);
        x = 8 >>> 1;
        System.out.println(x);

        x += 5;
         System.out.println(x);
        x -= 2;
         System.out.println(x);
        x *= 3;
         System.out.println(x);
        x /= 2;
         System.out.println(x);
        x %= 2;
         System.out.println(x);
        x &= 1;
         System.out.println(x);
        x |= 1;
         System.out.println(x);
        x ^= 1;
         System.out.println(x);
        x <<= 1;
         System.out.println(x);
        x >>= 1;
         System.out.println(x);
        x >>>= 1;
         System.out.println(x);

        int pierwsza = 7;
        int druga = 15;
        int max = ( pierwsza > druga ) ? pierwsza : druga ;
         System.out.println(max);

        double p = 9.7;
        int h = (int) x ; 


        Employee employee = new Employee("Natalia", 97, 123.90);

        if(!(employee instanceof Developer)){
            System.out.println("This employee is not a developer."); 
        }

         if(employee instanceof Developer){
            System.out.println("This employee is a developer."); 
        }

        double xxx = 9.7;
        int yyyy = (int) xxx ; 

        System.out.println(yyyy);

        Employee e = new Employee (" Anna ", 8 , 7000) ;
        e.getName () ;

        int [] numbers = {1 , 2 , 3};
        int firstNumber = numbers [0];

        System.out.println(" Hello ");
        int xxxxx = (2 + 3) * 4;

        System.out.println(xxxxx);

        System.out.println(divide(5,6));

        try {
                int resulttt = 10 / 0;
                } catch ( ArithmeticException except ) {
                    System.out.println (" Division by zero is not allowed .") ;
                    }

        try {
            Employee em = new Employee("", 5, 3000);
            } catch (IllegalArgumentException iae) {
        System.out.println("Invalid employee data: " + iae.getMessage());
            }    

                try {
         System.out.println (" Trying ...") ;
         } catch ( Exception exx ) {
         System.out.println(" Caught exception .") ;
         } finally {
         System.out.println(" This always runs .") ;
         }


}
/*
    public static int divide ( int a , int b ) {
        return a / b ;
     }
     */
    public static int divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Divisor must not be zero.");
    }

    return a / b;
}

    // public static void readFile () throws IOException {
   // }
     
}
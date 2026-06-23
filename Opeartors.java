public class Opeartors {
    public static void main(String[] args){
        int num1 = 27;
        int num2 = 7;
        /*Arithmetic
        eg +, -, /, %, ++, -- */
        int result = (num1 + num2);
        System.out.println(result);
        //or
        System.out.println(num1 + num2); //additon
        System.out.println(num1 - num2); // subtraction
        System.out.println(num1 / num2);// division
        System.out.println((double) num1 / (double) num2); //division into decimals
        System.out.println(num1 & num2); //modulo
        num1++; //increament
        System.out.println(num1++);
        num2--; //decreament
        System.out.println(num2--);

        /* Assignment
       =, +=, -=, *=, /=, %=  */
        num1 += 10;
        System.out.println(num1);
        num1 %= 10;
        System.out.println(num1);

        /*Comparison
        ==, !=,<, >, <=, >=,
         */
        System.out.println(num1 != num2); //not the same

        /*Logical
        AND => &&, OR >= ||, NOT => !
         */

    }
}

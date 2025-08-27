import java.util.Scanner;

public class oops_Assignment {
//Ans 1: Sum of Natural Numbers
    public static int sum_natural_no(int n){
        int sum=(n*(n+1))/2;
        return sum;
    }

// ans 2: multiplication table
    public static void table(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
// ans 3: factorial
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact*=i;
        }
        return fact;
    }

//ans 3: count digit
    public static int count_Digit(int n){
        int count=0;
        while(n != 0){
            n/=10;
            count++;
        }
        return count;           

    }

//ans 5: sum digit
    public static int sum_Digit(int n){
        int sum=0;
        while(n != 0){
            int last=n%10;
            sum+=last;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// ques 1: Sum of Natural Numbers
        // System.out.print("enter the no: ");
        // int n=sc.nextInt();
        // System.out.println("hence the sum of first "+n+" natural no is: "+sum_natural_no(n));

// ques 2: Multiplication Table
        // System.out.print("enter the table no: ");
        // int n=sc.nextInt();
        // table(n);

// ques 3:  Factorial of a Number
        // System.out.print("enter factorial no: ");
        // int n=sc.nextInt();
        // System.out.println("hece the factorial of no "+n+" is: "+factorial(n));

// ques 4:  Count Digits in a Number
        // System.out.print("enter no: ");
        // int n=sc.nextInt();
        // System.out.println("total no of digit: "+count_Digit(n));

//ques 5: sum of digit
        System.out.print("enter no: ");
        int n=sc.nextInt();
        System.out.println("sum no of digit: "+sum_Digit(n));


    }        
}
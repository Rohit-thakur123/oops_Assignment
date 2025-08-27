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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
// ques 1: Sum of Natural Numbers
        // System.out.print("enter the no: ");
        // int n=sc.nextInt();
        // System.out.println("hence the sum of first "+n+" natural no is: "+sum_natural_no(n));

// ques 2: Multiplication Table
        System.out.print("enter the table no: ");
        int n=sc.nextInt();
        table(n);

    }

}
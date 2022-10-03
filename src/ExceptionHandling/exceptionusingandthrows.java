package ExceptionHandling;

import java.util.Scanner;

public class exceptionusingandthrows {

    public static void a() throws ArithmeticException
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        if(b==0)
        {
            // it is throwing the exception object to caller function and now it is their responsibility to handle that exception
            throw new ArithmeticException();
        }
        else
        {
            c=a/b;
        }
        System.out.println(" exit method()");
    }

    public static void main(String[] args) {

        try{
            a();
            System.out.println("exception occurs");
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception caught");
        }
        finally
        {
            System.out.println("exception handled smartly");
        }
    }

}

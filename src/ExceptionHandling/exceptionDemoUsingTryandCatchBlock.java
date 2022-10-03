package ExceptionHandling;

public class exceptionDemoUsingTryandCatchBlock {
    // here we can see that the exceptions happened at two levels
    public static void methodA()
    {
        System.out.println("enter method a");
        int a=5,b=0;
        int c=a/b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        try{
            methodA();
            System.out.println("exit main()");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("arithmetic exception caught");
            ex.printStackTrace();
        }
        finally
        {
            System.out.println("exception handled already");
        }
    }
}
package classes;

import java.util.Arrays;

public class commandlineargument {
    public static void main(String[] args) {
         if(args.length>0)
         {
             System.out.println("arguments are ");
             for(String x:args)
             {
                 System.out.print(x+" ");
             }


         }
         else
         {
             System.out.println("no arguments");
         }
    }
}

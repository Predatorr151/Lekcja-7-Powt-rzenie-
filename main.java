import java.util.Scanner;
import java.util.Arrays;
public class main
{
    public static void main()
    {
        Scanner sialala=new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int a=sialala.nextInt();

        if(a%2==0)
        {
            System.out.println("Liczba jest parzysta");
            System.out.println(a);
        }
        else
            System.out.println("Liczba jest nieparzysta");

        System.out.println("++++++++++++++++++++++++++++++++++");
        System.out.println("Podaj drugą liczbe");
        for(int i=20;i<=200;i++)
        {
            System.out.println(""+i);

        }
        System.out.println("++++++++++++++++++++++++++++++++++");
        
        
        
        double[]tab={3.5,4.80,5.25,1.25,-3.33};
        System.out.println(""+Arrays.toString(tab));
        
        for(int i=0;i<tab.length;i++)
        {
        System.out.println(""+tab[i]);
        }
    }
}


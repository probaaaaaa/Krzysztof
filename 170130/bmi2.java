import java.util.Scanner;
public class bmi2{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        
        double waga;
        double wzrost;
        
        System.out.println("Podaj wage");
        waga=in.nextDouble();
            
        System.out.println("Podaj wzrost");
        wzrost=in.nextDouble();
        
        double bmi=waga/(wzrost*wzrost);
        
        
        System.out.format("%.2f",bmi);
        
        if(bmi<18.5)
        System.out.println("Niedowaga");
        else
        if(bmi >18.5 && bmi<24.99)
        System.out.println("Waga prawidlowa");
        else
        if(bmi>24.99)
        System.out.println("Nadwaga");
        
       // System.out .println(bmi);
    }
}
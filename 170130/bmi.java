public class bmi{
    public static void main(String[] args){
        
        double waga=Double.parseDouble(args[0]);
        double wzrost=Double.parseDouble(args[1]);
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
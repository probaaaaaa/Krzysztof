public class iloczyn{
    public static void main(String[] args){
       double iloczyn=1;
       for(int i=0; i<args.length;i++)
       {double a=Double.parseDouble(args[i]);
       iloczyn=iloczyn*a;}
       
        System.out.println(iloczyn);
    }
}
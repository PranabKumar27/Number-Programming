public class factorial2
{
    int factorial(int a)
    {
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
}
 class Testing1
{
    public static void main(String[] args) {
        factorial2 obj=new factorial2();
       int b= obj.factorial(5);
        System.out.println(b);

    }
}
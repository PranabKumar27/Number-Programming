public class abcd
{
    public static void main(String[] args) {
        int i=1;
        int n=12223;
        int temp=n;

        while(n>0)
        {
            n=n/10;
            i=i*10;
            System.out.println("i :"+i);
        }
        while(temp!=0)
        {
            i=i/10;
            int d=temp/i;
            temp=temp%i;
            System.out.println("digit :"+d);


            {

            }
        }

    }
}

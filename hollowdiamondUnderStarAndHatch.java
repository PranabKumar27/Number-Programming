public class hollowdiamondUnderStarAndHatch {
    public static void main(String[] args) {
        int num = 19;
        int star = 1;
        int space = num / 2;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                if (j == 1 || j == star)
                    System.out.print("* ");
                else
                {
                    if(i<=num/2+1)
                    {
                        System.out.print("$ ");
                    }
                    else System.out.print("@ ");
                }
            }
            if (i <= num / 2) {
                star += 2;
                space--;
            } else {
                star -= 2;
                space++;
            }
            System.out.println();
        }
    }
}

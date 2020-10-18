public class Approximating {
    public static void start(){
        double p=0.0;
        double j=1;
        int firstPi=0;
        for  (int i = 0; i <= 200000; i++)
        {
            p += 4* ((double)(Math.pow(-1,i) ) / j);
            j+=2;
            System.out.printf("PI= %.25f pi\n",p);
            if (p==3.14159){
                firstPi=i;
            }
        }
        System.out.printf("The first Pi= " + firstPi);

    }
}

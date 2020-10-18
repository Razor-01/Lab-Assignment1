public class SalesComissionCalculator {

    private double item1;
    private double item2;
    private double item3;
    private double item4;

    public SalesComissionCalculator(double item1,double item2,double item3,double item4) {
        setItem1(item1);
        setItem2(item2);
        setItem3(item3);
        setItem4(item4);

    }
    public void setItem1(double item1){
       if (item1<0){
           item1=0.0;
       }
        this.item1=item1;
    }
    public double getItem1(){
        return this.item1;
    }
    public void setItem2(double item2){
        if (item2<0){
            item2=0.0;
        }
        this.item2=item2;
    }
    public double getItem2(){
        return this.item2;
    }
    public void setItem3(double item3){
        if (item3<0){
            item3=0.0;
        }
        this.item3=item3;
    }
    public double getItem3(){
        return this.item3=item3;
    }
    public void setItem4(double item4){
        if (item4<0){
            item4=0.0;
        }
        this.item4=item4;
    }
    public double getItem4(){
        return this.item4;
    }
    public void calculator(){
        double result = (this.getItem1() * ((239.99/100)*9)) +(this.getItem2() * ((139.75/100)*9))+
        (this.getItem3() * ((35.49/100)*9)) + (this.getItem4() * ((350.89/100)*9))  + 200;
        System.out.printf("Earnings of this week : %.5f\n", result);
    }

    public static void start()
    {
        double item1price=239.99;
        double item2price=139.75;
        double item3price=35.49;
        double item4price=350.89;
        System.out.print("\n1 item price:" + item1price +
                "\n"+"2 item price:" + item2price+
                "\n"+"3 item price:" + item3price+
                "\n"+"4 item price:" + item4price);

        System.out.println("\nEntered an amount of each Item sold: \n");
        SalesComissionCalculator Me = new SalesComissionCalculator(12,5,8,1);
            Me.calculator();
        SalesComissionCalculator Someone = new SalesComissionCalculator(1,3,4,0);
            Someone.calculator();


    }
    private static void printItems(double Item1,double Item2, double Item3, double Item4){
        System.out.printf("Item1: %.3f, Item2: %.3f,Item3: %.3f,Item4: %.3f\n",Item1,Item2,Item3,Item4);
    }
}

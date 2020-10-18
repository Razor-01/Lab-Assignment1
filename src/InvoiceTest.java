public class InvoiceTest
{

    public static void start(){

        Invoice bag = new Invoice("001", "A bag", 4, 50.0);


        Invoice phone = new Invoice("002","phone", -5,-25);

        /*System.out.printf(bag.getTypeNumber(),bag.getTypeDescription(),bag.getItemPurchased(),bag.getItemPrice()
                ,bag.getinvoice());
        System.out.printf(phone.getTypeNumber(),phone.getTypeDescription(),phone.getItemPurchased(),phone.getItemPrice()
                ,phone.getinvoice());*/
        printInvoice(bag.getTypeNumber(),bag.getTypeDescription(),bag.getItemPurchased(),bag.getItemPrice()
                ,bag.getinvoice());
        printInvoice(phone.getTypeNumber(),phone.getTypeDescription(),phone.getItemPurchased(),phone.getItemPrice()
                ,phone.getinvoice());

    }
    private static void printInvoice(String num, String name, int amount, double price, double total)
    {
        System.out.printf(
                "Number:%s; Description:%s; Purchased:%d; Price:%.4f; Total Invoice: %.4f;\n", num,name,amount,price,total);
    }
}

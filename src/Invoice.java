public class Invoice {

    private String typeNumber;
    private String typeDescription;
    private int itemPurchased;
    private double itemPrice;


    public Invoice(String typeNumber,String typeDescription, int itemPurchased,double itemPrice)
    {
        setTypeNumber(typeNumber);
        setTypeDescription(typeDescription);
        setItemPurchased(itemPurchased);
        setItemPrice(itemPrice);
    }

    public void setItemPrice(double price){
        if (price<0.0){
            price=0.0;
        }
        this.itemPrice = price;
    }

    public double getItemPrice(){
        return this.itemPrice;
    }

    public void setItemPurchased(int purchase){
        if (purchase<0){
            purchase=0;
        }
        this.itemPurchased = purchase;
    }

    public int getItemPurchased(){
       return this.itemPurchased;
    }

    public void setTypeDescription(String description){
        this.typeDescription = description;
    }

    public String getTypeDescription(){
        return this.typeDescription;
    }

    public void setTypeNumber(String number){
        this.typeNumber = number;
    }

    public String getTypeNumber(){
        return this.typeNumber;
    }

    public double getinvoice(){
        return getItemPurchased() * getItemPrice();
    }




}

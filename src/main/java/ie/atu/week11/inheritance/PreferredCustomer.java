package ie.atu.week11.inheritance;

public class PreferredCustomer extends Customer {
    private int priceAmount;
    private int discountLevel;

    public PreferredCustomer(int priceAmount) {
        this.priceAmount=priceAmount;
    }

    public PreferredCustomer(String name, String address, String telephoneNumber, String customerNumber, boolean mailingList, int priceAmount, int discountLevel) {
        super(name, address, telephoneNumber, customerNumber, mailingList);
        this.priceAmount = priceAmount;
        this.discountLevel = discountLevel;
    }

    public int getPriceAmount() {
        return priceAmount;
    }

    public void setPriceAmount(int priceAmount) {
        this.priceAmount = priceAmount;
    }

    public int getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(int discountLevel) {
        this.discountLevel = discountLevel;
    }

    public void customerDiscount(int priceAmount){
        if((priceAmount>=500)&&(priceAmount>1000)){
            discountLevel=5;
        }
        else if((priceAmount>=1000)&&(priceAmount>1500)){
            discountLevel=6;
        }
        else if((priceAmount>=1500)&&(priceAmount>2000)){
            discountLevel=7;
        }
        else if(priceAmount>2000){
            discountLevel=10;
        }
    }

    @Override
    public String toString() {
        return "PRICE AMOUNT: " + "€" + priceAmount + "\n" + "DISCOUNT: " + discountLevel + "%";
    }
}

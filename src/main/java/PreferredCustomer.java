public class PreferredCustomer extends Customer {

    private int loyaltyPoints;
    private int Discount;

    PreferredCustomer(){
        this.loyaltyPoints = 0;
        this.Discount = 0;
    }
    PreferredCustomer(String name, String address, String telephone, String customerID, boolean mailingList,int loyaltyPoints, int Discount){
        super(name,address,telephone,customerID,mailingList);
        this.Discount = Discount;
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
    }

    public int getDiscount() {
        return Discount;
    }

    public void setDiscount(int discount) {
        Discount = discount;
    }

    @Override
    public String toString() {
        return super.toString()+
                "loyaltyPoints=" + loyaltyPoints +
                ", Discount=" + Discount ;
    }
}

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

    public void setLoyaltyPoints(int Points) {
        this.loyaltyPoints += Points;
        if (loyaltyPoints >= 2000) {
            setDiscount(10);
        } else if (loyaltyPoints < 2000 && loyaltyPoints >= 1500) {
            setDiscount(7);
        } else if (loyaltyPoints < 1500 && loyaltyPoints >= 1000) {
            setDiscount(6);
        } else if (loyaltyPoints<1000 && loyaltyPoints >= 500) {
            setDiscount(5);
        }
        else{
            setDiscount(0);
            }
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

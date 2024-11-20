public class Customer extends Person{

    private String customerID;
    private boolean mailingList;

    public Customer(){
        this.customerID = "";
        this.mailingList = false;
    }


    public Customer(String name, String address, String telephone, String customerID, boolean mailingList){
        super(name,address,telephone);
        this.customerID = customerID;
        this.mailingList = mailingList;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    @Override
    public String toString() {
        return super.toString()+ " customerID=" + customerID +
                ", mailingList=" + mailingList +
                '}';
    }
}


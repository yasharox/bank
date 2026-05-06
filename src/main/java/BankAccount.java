public class BankAccount {
    private double balance;
    private String ownerName;

    // constructor
    public BankAccount( String ownerName, double initialBalance) {

        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }

    // setter for balance
    public void setBalance(double balance) {

        if ( balance >0){
            this.balance = balance;
        }else{
            System.out.println("Balance cannot be empty");
        }

    }

    // getter for owner
    public String getOwnerName() {
        return ownerName;
    }


    // setter for owner
    public void setOwnerName(String ownerName) {

        if(ownerName != null && !ownerName.isEmpty()){
            this.ownerName = ownerName;
        } else{
            System.out.println("owner Name cannot be empty");
        }
    }
}





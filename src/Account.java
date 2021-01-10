public class Account {
    private String accountNumber;
    private String accountholder;
    private String openDate;
    private double balance;
    
    public Account(String accountNumber,String accountholder,String openDate,double balance){
        this.accountNumber=accountNumber;
        this.accountholder=accountholder;
        this.openDate=openDate;
        this.balance=balance;
    }
    public void withdraw(double amount){
        this.balance-=amount;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }
    public void transfer(Account other,double amount){
        this.withdraw(amount);
        other.deposit(amount);
    }
}

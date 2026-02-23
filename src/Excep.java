public class Excep extends Exception{
    private String balance;
    public Excep(String balance){
        this.balance=balance;
    }
    public String getBalance(){
        return balance;
    }
}






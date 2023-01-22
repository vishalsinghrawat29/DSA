public class AccessModeifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "Vishal Singh";
        myAcc.setPassword("abcdef");
    }
}

class BankAccount{
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}

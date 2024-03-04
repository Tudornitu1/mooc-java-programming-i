public class YourFirstAccount {
    

    public static void main(String[] args) {
        Account TudorsAccount = new Account("tudor's account", 100.0);
        TudorsAccount.deposit(20.0);
        System.out.println(TudorsAccount.toString());
    }
}


public class Main {

    public static void main(String[] args) {

        Account bobsAccount = new Account("2345", 0.00, "Jo Schmoo", "js@gmail.com", "(312)765-4321");
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(100.0);
        bobsAccount.withdrawal(50.0);
    }

}

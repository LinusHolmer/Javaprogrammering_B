package Lektion1.ovning1;

public class AccountManager {

    public void createAccount(String username){
        createAccount(username, "defaultPassword", null);
    }

    public void createAccount(String username, String password){
        createAccount(username, password, null);
    }

    public void createAccount(String username, String password, String email){
        System.out.println("Skapar konto:");
        System.out.println("Användarnamn: " +username);
        System.out.println("Lösenord " + password);
        if (email != null) {
            System.out.println("E-post: " + email);
        }
    }
}

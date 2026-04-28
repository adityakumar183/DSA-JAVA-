package OOPSinJAVA;
// Access Modifier:-

class Account {
    public String name;
    protected String email;
    private String password;

    // getters & setters
    public String getPassword() {
        setPassword("adi");
        return this.password;
    }

    private void setPassword(String pass) {
        this.password = pass;
    }
}

public class OOPSWithSD_05 {
    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Aditya";
        account1.email = "adityakumar@gmail.com";
//        account1.setPassword("adi");
        System.out.println(account1.getPassword());
    }
}

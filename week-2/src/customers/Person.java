package customers;

public class Person extends Customer{
    private String tckn;

    public Person(int id, String name, String email, String password, String tckn) {
        super(id, name, email, password);
        this.tckn = tckn;
    }

    public String getTckn() {
        return tckn;
    }

    public void setTckn(String tckn) {
        this.tckn = tckn;
    }
}

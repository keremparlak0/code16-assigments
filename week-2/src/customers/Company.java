package customers;

public class Company extends Customer{
    private String taxNumber;

    public Company(int id, String name, String email, String password, String taxNumber) {
        super(id, name, email, password);
        this.taxNumber = taxNumber;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}

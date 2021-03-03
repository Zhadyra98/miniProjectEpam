package model;
import model.enums.City;

public class Customer {
    private int id ;
    private String lastName;
    private String firstName;
    private String familyName;
    private String address;
    private long creditCardNumber;
    private String bankAccount;
    private final City city;

    public Customer(String lastName, String firstName, String familyName, City city){
        this.lastName=lastName;
        this.firstName=firstName;
        this.familyName=familyName;
        this.city = city;
    }

    public Customer(String lastName, String firstName, String familyName, String address, City city){
        this.lastName=lastName;
        this.firstName=firstName;
        this.familyName=familyName;
        this.address = address;
        this.city = city;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getFamilyName(){
        return familyName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity(){
        return city.getValue();
    }
    @Override
    public String toString(){
        return "this is a customer, who's name is "+lastName+ " "+ firstName+" "+familyName+"" +
                " address is "+address+ " and credit card number is "+ creditCardNumber;
    }
}

package model;

public class Customer {
    private int id ;
    private String lastName;
    private String firstName;
    private String familyName;
    private String address;
    private long creditCardNumber;
    private String bankAccount;

    public Customer (String lastName, String firstName, String familyName){
        this.lastName=lastName;
        this.firstName=firstName;
        this.familyName=familyName;
    }

    public Customer (String lastName, String firstName, String familyName, String address){
        this.lastName=lastName;
        this.firstName=firstName;
        this.familyName=familyName;
        this.address = address;
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
    @Override
    public String toString(){
        return "this is a customer, who's name is "+lastName+ " "+ firstName+" "+familyName+"" +
                " address is "+address+ " and credit card number is "+ creditCardNumber;
    }
}

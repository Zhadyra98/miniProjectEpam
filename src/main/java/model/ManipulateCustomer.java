package model;

import model.enums.City;

import java.util.Scanner;

public  class ManipulateCustomer {
    static Customer customer1 = new Customer("Omarov", "Arman", "Serikovich", City.ALMATY);
    static Customer customer2 = new Customer("Aknurova", "Aliya", "Almasovna", City.BERLIN);
    static Customer customer3 = new Customer("Alemov","Serik","Maratovich", City.KARAGANDA);
    static Customer customer4 = new Customer("Omarov","Serik","Zhambylovich", City.NOVOSIBIRSK);
    static Customer customer5 = new Customer("Aknurova", "Zhaniya","Berikovna", City.MOSCOW);

    final static Customer[] allCustomers = {customer1, customer2, customer3, customer4, customer5};

    public static void searchByFirstName(String name){
        boolean isFound = false;
        for(Customer c1: allCustomers){
            if(c1.getFirstName().equals(name)){
                isFound = true;
                System.out.println(c1.toString());
            }
        }
        if(!isFound){
            System.out.println("There are no customers with this FirstName");
        }
    }
    public static void searchByLastName(String lname){
        boolean isFound = false;
        for(Customer c1: allCustomers){
            if(c1.getLastName().equals(lname)){
                isFound = true;
                System.out.println(c1.toString());
            }
        }
        if(!isFound){
            System.out.println("There are no customers with this LastName");
        }
    }
    public static void searchByCity(String city){
        boolean isFound = false;
        for(Customer c1: allCustomers){
            if(c1.getCity().equals(city)){
                isFound = true;
                System.out.println(c1.toString());
            }
        }
        if(!isFound){
            System.out.println("There are no customers with thi City");
        }
    }
    public static void selectorFunction(int selector, String val){
        switch (selector){
            case 1:
                searchByFirstName(val);
            case 2:
                searchByLastName(val);
            case 3:
                searchByCity(val);
            case 0:
                System.out.println("BYE");
                break;
        }
    }
    public static void main(String[] args) {
        ManipulateCustomer mcs = new ManipulateCustomer();
        System.out.println("---------------Searching functionality(please select)------------");
        System.out.println("'1' :search by name");
        System.out.println("'2' :search by Last name");
        System.out.println("'3' :search by City(Almaty, Astana, Berlin, Moscow)");
        System.out.println("'0' : for Quit" );
        Scanner sc = new Scanner(System.in);
        int selector = sc.nextInt();
        String val = sc.nextLine();
        selectorFunction(selector, val);
    }
}

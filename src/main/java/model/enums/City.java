package model.enums;

public enum City {
    ALMATY("Almaty","Kazakhstan"),
    KARAGANDA("Karaganda","Kazakhstan"),
    BERLIN("Berlin","Germany"),
    HAMBURG("Hamburg","Germany"),
    MOSCOW("Moscow","Russia"),
    NOVOSIBIRSK("Novosibirsk", "Russia");

    private String value;

    private String country;

    City(String value, String country){
        this.value=value;
        this.country=country;
    }

    public String getValue(){
        return value;
    }

    public String getCountry(){
        return country;
    }
}

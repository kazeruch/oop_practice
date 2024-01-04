package src;

public class Address {
    private String name;
    private String address;
    private String mail;
    private String number;

    public Address(String name, String address, String mail, String number) {
        this.name = name;
        this.address = address;
        this.mail = mail;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }

    public String getNumber() {
        return number;
    }
}


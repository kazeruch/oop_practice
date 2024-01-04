package src;

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address("太郎", "東京都", "example@gmail.com", "080-7777-7777");

        System.out.println(address.getName());
        System.out.println(address.getAddress());
        System.out.println(address.getMail());
        System.out.println(address.getNumber());
    }
}

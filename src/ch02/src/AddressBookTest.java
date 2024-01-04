package src;

public class AddressBookTest {
    public static void main(String[] args) {
        AddressBook book = new AddressBook("太郎", "東京都", "example1@gmail.com", "000-0000-0000", "花子", "埼玉県", "example2@gmail.com", "111-1111-1111", "次郎", "千葉県", "example3@gmail.com", "222-222-2222");

        System.out.println(book);
    }
}

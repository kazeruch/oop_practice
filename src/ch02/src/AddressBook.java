package src;

public class AddressBook {
    private Address[] address = new Address[3];
    
    public AddressBook(String name1, String address1, String mail1, String number1, String name2, String address2, String mail2, String number2,String name3, String address3, String mail3, String number3) {
        address[0] = new Address(name1, address1, mail1, number1);
        address[1] = new Address(name2, address2, mail2, number2);
        address[2] = new Address(name3, address3, mail3, number3);
    }

    public String toString() {
        String result = "一つ目のアドレス帳の氏名は ";
        for(int i=0; i<3; i++) {
            result += (address[i].getName() + "、住所は " + address[i].getAddress() + "、メールアドレスは " + address[i].getMail() + "、電話番号は " + address[i].getNumber() + " です。");
            if(i != 2) {
                result += "\n二つ目のアドレス帳の氏名は ";
            }
        }
        return result;
    }
}

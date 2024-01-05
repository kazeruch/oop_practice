package src.ch04;

public class Student {
    private String studentNumber;
    private String name;
    private String address;
    private String tel;

    public Student(String studentNumber, String name, String address, String tel) {
        this.studentNumber = studentNumber;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }
    public String getStudentNumber() {
        return studentNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String toString() { // 文字列表現を得るメソッド
        return "Student(" + studentNumber + ", " + name + ", " + address + ", " + tel + ")";
        // メソッド内ではフィールドを直接指定してアクセスできる
    }
    public static void main(String[] args) {
        Student taro = new Student("12FI999", "電大太郎", "東京都足立区千住旭町５番", "03-5xxx-yyyy");
        System.out.println(taro.toString());
        taro.studentNumber = "12FI888"; // 学籍番号が変えられてしまった！
        System.out.println(taro.toString());
        System.out.println(taro.studentNumber); // 学籍番号にアクセスできる！
    }
}

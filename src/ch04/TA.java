package src.ch04;

public class TA extends Student {
    private String subject; // 担当科目
    private String extension; // 内線番号

    public TA(String studentNumber, String name, String address, String tel, String subject, String extension) {
        super(studentNumber, name, address, tel);
        // スーバークラスのコンストラクタ呼び出し
        this.subject = subject;
        this.extension = extension;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getExtension() {
        return extension;
    }
    public void setExtension(String extension) {
        this.extension = extension;
    }
    public String toString() { // 文字列表現
        return "TA(" + getStudentNumber() + ", " + getName() + ", " + getAddress() + ", " + getTel() + ", " + getSubject() + ", " + getExtension() + ")";
    }
    public static void main(String[] args) {
        TA hanako = new TA("12FMI99", "電大花子", "千葉県印西市武西学園台 2---1200", "0476-46-zzzz", "オブジェクト指向プログラミング", "2843");
        System.out.println(hanako);
    }
}

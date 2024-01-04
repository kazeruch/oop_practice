public class Q1 {
    public static void main(String[] args) {
        String str[] = new String[4];
        str[0] = new String("Hello World");
        str[1] = new String("Hello java");
        str[2] = new String("Hello World");
        str[3] = str[0];

        for (int i=0; i<3; i++) {
            if(str[0] == str[i+1]) {
                System.out.println("文字列1 と " + "文字列" + (i+2) + " は等しい");
            } else {
                System.out.println("文字列1 と " + "文字列" + (i+2) + " は等しくない");
            }
        }        
    }
}
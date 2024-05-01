package Overload;

public class Instance {

    /**
     * 標準出力する
     */
    public void sameName() {
        System.out.println("引数を持たないsameNameメソッドです");
    }

    /**
     * 引数を標準出力する
     * @param num 引数1(数値)
     */
    public void sameName(int num) {
        System.out.println("int型の引数を１つもつsameNameメソッドです。 引数：" + num);
    }

    /**
     * 引数を標準出力する
     * @param num1 引数1(数値)
     * @param num2 引数2(数値)
     */
    public void sameName(int num1, int num2) {
        System.out.println("int型の引数を２つもつsameNameメソッドです。 引数：" + num1 + "," + num2);
    }

    /**
     * 引数を標準出力する
     * @param str 引数1(文字列)
     */
    public void sameName(String str) {
        System.out.println("String型の引数を１つもつsameNameメソッドです。引数：" + str);
    }

    /**
     * 引数を標準出力する
     * @param str1 引数1(文字列)
     * @param str2 引数2(文字列)
     */
    public void sameName(String str1, String str2) {
        System.out.println("String型の引数を１つもつsameNameメソッドです。引数：" + str1 + "," + str2);
    }
    
}

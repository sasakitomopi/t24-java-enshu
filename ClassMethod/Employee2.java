package ClassMethod;

/**
 * 社員情報を管理するクラス
 */
public class Employee2 {
    // 社員名
    private String name;

    // 社員数
    private int num;

    /*
     * デフォルトコンストラクタ
     */
    Employee2() {
        this.name = "匿名希望";
    }

    /**
     * 引数ありコンストラクタ
     * @param name 社員名
     */
    Employee2(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if(name.length() > 10) {
            this.name = sb.substring(0, 10);
        } else {
            this.name = name;
        }
    }

    /**
     * 引数ありコンストラクタ
     * @param num 社員合計数
     */
    Employee2(int num) {
        this.num = num;
    }

    /**
     * 社員名を標準出力する
     */
    public void getName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }

    /**
     * 社員数を標準出力する
     */
    public void getNum() {
        System.out.println("社員は全部で" + this.num + "人です。");
    }

}

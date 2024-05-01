package Constructor;

/**
 * 社員情報を管理するクラス
 */
public class Employee {
    // 社員名
    private String name;

    /*
     * デフォルトコンストラクタ
     */
    Employee() {
        this.name = "匿名希望";
    }

    /**
     * 引数ありコンストラクタ
     * @param name 社員名
     */
    Employee(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if(name.length() > 10) {
            this.name = sb.substring(0, 10);
        } else {
            this.name = name;
        }

    }

    /**
     * 社員名を返却する
     */
    public void getName() {
        System.out.println("私はシアトルコンサルティングの社員です。名前は" + this.name + "です。");
    }
}

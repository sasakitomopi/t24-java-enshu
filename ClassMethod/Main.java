package ClassMethod;

public class Main {
    public static void main(String[] args) {
        // 匿名希望を標準出力する
        Employee2 emp1 = new Employee2();
        emp1.getName();
    
        // 引数の名前を標準出力する
        Employee2 emp2 = new Employee2("Pepper");
        emp2.getName();
    
        // 社員の合計人数を出力する
        Employee2 emp3 = new Employee2(2);
        emp3.getNum();
    }
}

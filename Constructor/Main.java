package Constructor;

public class Main {
    public static void main(String[] args) {
        // 匿名希望を標準出力する
        Employee emp1 = new Employee();
        emp1.getName();
    
        // 引数の名前を標準出力する
        Employee emp2 = new Employee("Pepper");
        emp2.getName();
    }
}

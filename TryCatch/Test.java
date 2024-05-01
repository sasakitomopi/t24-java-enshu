package TryCatch;

import java.util.Scanner;

public class Test {
    public static void main(String args[]) {
        // INFO: Scannerは引数2個受け取るまで実行されないので、引数チェックは不要。
        Scanner scanner = new Scanner(System.in);
        try {
    
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            if (j == 0) {
                throw new IllegalArgumentException();
            }

            System.out.println(i / j);
            System.out.println("正常");
        } catch (java.util.InputMismatchException e) {
            System.out.println("数字を入力してください");
        } catch (IllegalArgumentException e) {
            System.out.println("予期しない例外が発生しました");
        } catch (Exception e) {
            System.out.println("予期しない例外が発生しました");
        } finally {
            scanner.close();
            System.out.println("終了");
        }
    }
}



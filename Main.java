public class Main {
  public static void main(String[]args){
    while(true){
      System.out.println("1~100の整数を入力してください");
      int num = new java.util.Scanner(System.in).nextInt();
      if(num % 7 == 0){
        break;
      }
    }
    System.out.println("処理を終了しました");
  }
}
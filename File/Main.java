package File;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String inputFilePath = "/Users/user/src/github.com/sasakitomopi/t24-java-enshu/File/Test.csv";
        String outputFilePath = "/Users/user/src/github.com/sasakitomopi/t24-java-enshu/File/TestOutput.txt";

        try {
            // 入力ファイルを読み込む
            File inputFile = new File(inputFilePath);
            if (!inputFile.exists()) {
                System.out.println("入力ファイルが見つかりません。");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line = reader.readLine();

            // 出力ファイルを作成
            File outputFile = new File(outputFilePath);
            if (!outputFile.exists()) {
                outputFile.createNewFile();
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            // 四則演算の結果を出力ファイルに書き込む
            if (line != null) {
                String[] values = line.split(",");

                int plusResult = Integer.parseInt(values[0]) + Integer.parseInt(values[1]) + Integer.parseInt(values[2]) + Integer.parseInt(values[3]);
                int minusResult = Integer.parseInt(values[0]) - Integer.parseInt(values[1]) - Integer.parseInt(values[2]) - Integer.parseInt(values[3]);
                int multiplicationResult = Integer.parseInt(values[0]) * Integer.parseInt(values[1]) * Integer.parseInt(values[2]) * Integer.parseInt(values[3]);
                int divisionResult = Integer.parseInt(values[0]) / Integer.parseInt(values[1]) / Integer.parseInt(values[2]) / Integer.parseInt(values[3]);

                List<Integer> resultList = new ArrayList<>();
                resultList.add(plusResult);
                resultList.add(minusResult);
                resultList.add(multiplicationResult);
                resultList.add(divisionResult);

                for(Integer result: resultList){
                    writer.write(String.valueOf(result));
                    writer.newLine();
                }
            }

            // ファイルを閉じる
            reader.close();
            writer.close();

            System.out.println("ファイルが正常に処理されました。");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


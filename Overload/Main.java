package Overload;

public class Main {
    public static void main(String[] args) {
        Instance instance = new Instance();
        instance.sameName();
        instance.sameName(0);
        instance.sameName(0, 1);
        instance.sameName("str1");
        instance.sameName("str1", "str2");
    }
}

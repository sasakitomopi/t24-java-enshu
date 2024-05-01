package NewClass.Inheritance.seattle;

public class Main {
    public static void main(String[] args) {
        SeattleSSEmployee seattleSSEmployee = new SeattleSSEmployee();
        seattleSSEmployee.setEmpName("森本真由");
        System.out.println("社員氏名：" + seattleSSEmployee.getEmpName());
        System.out.println("所属部署：" + seattleSSEmployee.getDept());
    
        SeattleEmployee seattleEmployee = new SeattleEmployee();
        seattleEmployee.setEmpName("Pepper");
        System.out.println("社員氏名：" + seattleEmployee.getEmpName());
        System.out.println("所属部署：" + seattleEmployee.getDept());

    }

}

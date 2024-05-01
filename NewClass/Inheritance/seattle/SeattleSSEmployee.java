package NewClass.Inheritance.seattle;

public class SeattleSSEmployee extends SeattleEmployee {
    /**
    * 所属部署を取得する
    */
    @Override
    public String getDept(){
        return "SI事業部";
    }
}
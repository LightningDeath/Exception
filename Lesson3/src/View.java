import View.EnterData;
import View.Info;
public class View {
    private static final EnterData ed = new EnterData();
    private static final Info info = new Info();
    public String ED(){
        return ed.ed();
    }
    public void Info(String message){
        info.info(message);
    }
}

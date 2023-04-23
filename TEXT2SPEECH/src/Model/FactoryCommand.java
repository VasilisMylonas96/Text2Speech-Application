package Model;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class FactoryCommand {
	@FXML private javafx.scene.control.Button  Exit;
	private int number=1;
	private String []ArrayForSave=new String[6];
    public void MenuNew(ControllerOfExecute controller)  {
    	controller.executecommand(null,null,null,null,null,null);
    }
    public void MenuLoad(ControllerOfExecute controller) {
    	controller.executecommand(null,null,null,null,null,null);
    }
    public void MenuSave(ControllerOfExecute controller,Stage stage,String textf1,String textf2,String textf3,String textf4,String textf5,String textA) {
    	stage.close();
    	ArrayForSave[0]=textf1;
    	ArrayForSave[1]=textf2;
    	ArrayForSave[2]=textf3;
    	ArrayForSave[3]=textf4;
    	ArrayForSave[4]=textf5;
    	ArrayForSave[5]=textA;
    	controller.executecommand(ArrayForSave,null,null,null,null,null);
		number=number+1;
    }
    public void Edit(ControllerOfExecute controller,TextField textf1,TextField textf2,TextField textf3,TextArea textA) {
    	controller.executecommand(null,null,textf1,textf2,textf3,textA);
    }
    public void closeStage(ControllerOfExecute controller,Stage stage) {
    	controller.executecommand(null,stage,null,null,null,null);
    }
}

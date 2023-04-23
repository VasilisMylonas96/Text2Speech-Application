
package Model;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public interface AllFileButtons {
	public void Mnew();
	public void MLoad();
	public void MSave(String [] array);
	public void Exit(Stage stage);
	public void Edit(TextField textf1,TextField textf2,TextField textf3,TextArea textA) ;
}	
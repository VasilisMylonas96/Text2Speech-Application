package Model;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ControllerOfExecute {
	private commandsExecute command;
	public ControllerOfExecute(commandsExecute newcommand) {
		command=newcommand;
	}
	public void executecommand(String[] array,Stage stage,TextField textf1,TextField textf2,TextField textf3,TextArea textA) {
		command.execute(array,stage,textf1,textf2,textf3,textA);
	}
}

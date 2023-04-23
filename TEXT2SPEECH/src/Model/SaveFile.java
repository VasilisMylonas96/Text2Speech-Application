package Model;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SaveFile implements commandsExecute{

	private Filebuttons file;
	public SaveFile(Filebuttons newfile) {
		file=newfile;
	}
	@Override
	public void execute(String[] array,Stage stage,TextField textf1,TextField textf2,TextField textf3,TextArea textA) {
		file.MSave(array);
	}
}

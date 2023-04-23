
package Model;



import View.View;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class Filebuttons implements AllFileButtons{
	
	private int savetag;
	private String[] loadarray=new String[5];
	private SaveModel savefile = new SaveModel();
	private LoadModel loadfile=new LoadModel();
	public View view= new View();
	final FileChooser chosefile= new FileChooser();
	public void Mnew() {

		view.ViewWindow(null);

    }
	public void MLoad() {
		
		
		
		loadarray=loadfile.LoadFile(chosefile.showOpenDialog(null).getPath());
		if(loadarray==null) {
			System.out.print("Load unsuccessful");
		}
		else {
		    System.out.print("Load successful");
		    view.ViewWindow(loadarray);	
		}
		
    }
	public void MSave(String[] array) {
		savetag=savefile.savefile(array);

		if (savetag==1) {
	    	System.out.print("Save successful");
		}
		else {
	    	System.out.print("Save unsuccessful");
		}
    	
    }
	public void Edit(TextField textf1,TextField textf2,TextField textf3,TextArea textA) {
    	if (textf1!=null) {
    		textf1.setEditable(true);
    	}
		if (textf2!=null) {
		    textf2.setEditable(true);
		}
		if (textf3!=null) {
			textf3.setEditable(true);
		}
		if (textA!=null) {
		    textA.setEditable(true);
		}
	}
	public void Exit(Stage stage) {
		stage.close();
	}

}

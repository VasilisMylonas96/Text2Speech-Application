package Commands;
import Model.Atbash;
import Model.ControllerOfExecute;
import Model.CreateNewFile;
import Model.EditFile;
import Model.Encode;
import Model.Exit;
import Model.FactoryCommand;
import Model.Filebuttons;
import Model.LoadFile;
import Model.ReplayManager;
import Model.Rot_13;
import Model.SaveFile;
import Model.SpeechAdapter;
import Model.Utf8;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Factory {
	private Filebuttons file=new Filebuttons();
	private CreateNewFile CreateNewFile=new CreateNewFile(file);
	private LoadFile load=new LoadFile(file);
	private SaveFile Save=new SaveFile(file);
	private Exit exit=new Exit(file);
	private EditFile edit=new EditFile(file);
	private ControllerOfExecute controller;
	private FactoryCommand FactoryCommands= new FactoryCommand();
	private SpeechAdapter voicetext=new SpeechAdapter();
	private Encode typeencode;
	private ReplayManager replayer;
	private Boolean Active=false;
	public void Factorybuttonsaction(String typeofbutton,Stage stage,String textf1,String textf2,String textf3,String textf4,String textf5,String textA,int line,ActionEvent event,TextField txt1,TextField txt2,TextField txt3,TextArea txtA) {
		if (typeofbutton.equals("MenuNew")) {
	    	controller=new ControllerOfExecute(CreateNewFile);
	    	FactoryCommands.MenuNew(controller);
		}
		else if (typeofbutton.equals("MenuLoad")) {
			controller=new ControllerOfExecute(load);
	    	FactoryCommands.MenuLoad(controller);
		}
		else if (typeofbutton.equals("closeStage")) {
			controller=new ControllerOfExecute(exit);
	    	FactoryCommands.closeStage(controller,stage);
		}
		else if (typeofbutton.equals("MenuSave")) {
	    	controller=new ControllerOfExecute(Save);
	    	FactoryCommands.MenuSave(controller,stage,textf1,textf2,textf3,textf4,textf5,textA);
		}
		else if(typeofbutton.equals("Edit")){
	    	controller=new ControllerOfExecute(edit);
			FactoryCommands.Edit(controller,txt1, txt2, txt3, txtA);
			
		}
		else if(typeofbutton.equals("ReverseSpeechButton")) {
			 voicetext.ReverseSpeech(textA,line);			
		}
		else if(typeofbutton.equals("speechButton")) {
			voicetext.speech(textA,line);
		}
		else if(typeofbutton.equals("True")) {
			Active=true;
			replayer=new ReplayManager();
		}
		else if(typeofbutton.equals("False")) {
			Active=false;
		}
	}	
	public String Factorybuttonsaction(String typeofbutton,String textA,int line,ActionEvent event) {
		if (typeofbutton.equals("Atbash")) {
			typeencode=new Atbash();
			return typeencode.MakeMainEncode(textA,line);
		}
		else if (typeofbutton.equals("Rot13")) {
			typeencode=new Rot_13();
			return typeencode.MakeMainEncode(textA,line);
		}else {
			typeencode=new Utf8();
			return typeencode.MakeMainEncode(textA,line);
		}
		
	}

	public void Factorybuttonsaction(float volume,float wordpersech,float hrz) {
		voicetext.SetParametersofVoice(volume,wordpersech,hrz);
	
	}
	public void callReplayManager(String typeofB,Stage stage,String textf1,String textf2,String textf3,String textf4,String textf5,String textA,int line,float volume,float wordpersech,float hrz,ActionEvent event,TextField txt1,TextField txt2,TextField txt3,TextArea txtA) {
		if (Active) {
			replayer.SaveActions(typeofB, stage, textf1, textf2, textf3, textf4, textf5, textA, line, volume, wordpersech, hrz, event,txt1,txt2,txt3,txtA);
		}

	}
	public void PlayTheRecord(ActionEvent event) {
		replayer.replay();
	}
}

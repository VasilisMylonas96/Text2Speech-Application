package Model;
import java.util.ArrayList;
import Commands.Factory;
import View.View;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
public class ReplayManager {
	private ArrayList<String> typeofbutton = new ArrayList<String>();
	private ArrayList<String[] > TextList = new ArrayList<String[] >();
	private ArrayList<TextArea > TxtAREAList = new ArrayList<TextArea >();
	private ArrayList<TextField[] > TxtList = new ArrayList<TextField[] >();
	private ArrayList<String > TextAList = new ArrayList<String >();
	private ArrayList<Integer > lineList = new ArrayList<Integer >();
	private ArrayList<float[]> setVOICE = new ArrayList<float[] >();
	private ArrayList<ActionEvent> events = new ArrayList<ActionEvent >();
	private float[] Sets=new float[3];
	private ArrayList<Stage > stageList = new ArrayList<Stage >();
	private String[] Text=new String[5];
	private TextField[] Txt=new TextField[3];
	private Factory record;
	private String[] array=new String[6];
	private View view=new View();
	private int k;
	public void SaveActions(String typeofB,Stage stage,String textf1,String textf2,String textf3,String textf4,String textf5,String textA,int line,float volume,float wordpersech,float hrz,ActionEvent event,TextField txt1,TextField txt2,TextField txt3,TextArea txtA) {
		typeofbutton.add(typeofB);
		stageList.add(stage);
		Text[0]=textf1;
		Text[1]=textf2;
		Text[2]=textf3;
		Text[3]=textf4;
		Text[4]=textf5;
		Txt[0]=txt1;
		Txt[1]=txt2;
		Txt[2]=txt3;
		TxtAREAList.add(txtA);
		TxtList.add(Txt);
		TextList.add(Text);
		TextAList.add(textA);	
		lineList.add(line);
		if (!(volume==-1)) {
			Sets[0]=volume;
			Sets[1]=wordpersech;
			Sets[2]=hrz;
			setVOICE.add(Sets);
		}
		events.add(event);
		for (int k=0;k<Text.length;k++) {
			if(!(Text[k]==null)) {
				array[k]=Text[k];
			}
		}
		if(!(textA==null)) {
			array[5]=textA;
		}
	}

	public void replay() {
		record=new Factory();
		int listSize = events.size();
		k=0;
		for (int i = 0; i<listSize; i++){
			if (typeofbutton.get(i).equals("ReverseSpeechButton")||typeofbutton.get(i).equals("speechButton")) {
				record.Factorybuttonsaction(typeofbutton.get(i), stageList.get(i), TextList.get(i)[0], TextList.get(i)[1], TextList.get(i)[2], TextList.get(i)[3], TextList.get(i)[4], TextAList.get(i), lineList.get(i), events.get(i),TxtList.get(i)[0],TxtList.get(i)[1],TxtList.get(i)[2],TxtAREAList.get(i));
			}
			else if (typeofbutton.get(i).equals("Atbsash")||typeofbutton.get(i).equals("Rot13")||typeofbutton.get(i).equals("UTF-8")){
				view.TEXTAset(record.Factorybuttonsaction(typeofbutton.get(i), TextAList.get(i), lineList.get(i), events.get(i)));
			}
			else if (typeofbutton.get(i).equals("setVoice")){

				record.Factorybuttonsaction(setVOICE.get(k)[0], setVOICE.get(k)[1], setVOICE.get(k)[2]);
			}else if(typeofbutton.get(i).equals("MenuNew")){
				view.ViewWindow(array);
			}
			else if (typeofbutton.get(i).equals("MenuLoad")){
				view.ViewWindow(array);
				
			}else if(typeofbutton.get(i).equals("Edit")) {
				view.TEXTeditable();
			}
			else if(typeofbutton.get(i).equals("closeStage")) {
				view.Closestage();
			}
			else if (typeofbutton.get(i).equals("MenuSave")) {
				record.Factorybuttonsaction(typeofbutton.get(i), stageList.get(i), TextList.get(i)[0], TextList.get(i)[1], TextList.get(i)[2], TextList.get(i)[3], TextList.get(i)[4], TextAList.get(i), lineList.get(i), events.get(i),TxtList.get(i)[0],TxtList.get(i)[1],TxtList.get(i)[2],TxtAREAList.get(i));
				view.Closestage();
			}
			else {
				System.out.print(typeofbutton.get(i));
				System.out.print("Something going wrong Fail inputs.Try again");
			}
		}
	}
	
}

package View;

import Commands.Factory;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;;

public class View {
	private int choicefrombox,arraylenght,flag=1;
	private String[] array1;
	private TextArea textA;
	private TextArea holdText;
	private TextField textf1,textf2,textf3,textf4,textf5,textPitch,textRate;
	private Factory PRESS;
	private Button btn1,btn2,btn3,btn4,btn5,btn6,btnSET;
	private Stop[] stops ;
	private LinearGradient lg1;
	private MenuItem encode1,encode2,encode3;
	private MenuButton encode;
	private GridPane grid1,grid2,grid3,grid4;
	private Label warning,linelabel,l6,l5,l4,l3,l2,l1,SliderLabel,PitschLabel,RateLabel;
	private Button ok ,space,btnselect;
	private Stage WarnStage,SelectStage,ViewWindowStage,SetVoiceStAGE;
	private Scene WARNScene,Selectscene,ViewWindowScene,SetVoiceScene;
	private ComboBox<Integer> cb;
	private Slider slider;
	private Boolean bPitch,bRate;
	public void ViewWindow(String[] array) {
		holdText=new TextArea();
		flag=1;
		PRESS=Main.factRet();
		grid1 = new GridPane();
		ViewWindowStage = new Stage();
		grid1.setMinHeight(417);
		grid1.setMinWidth(448);	
	    btn1 = new Button("Save");
	    btn2 = new Button("Exit");
	    btn3 = new Button("Speech");
	    btn4 = new Button("Edit");
	    btn5 = new Button("Reverse Speech");
	    btn6 = new Button("VoiceSet");
	    stops = new Stop[] { new Stop(0f,Color.web("#00eeff")), new Stop(1.0f,Color.web("#1aff03"))};
	    lg1 = new LinearGradient(0.5619047619047619, 0.519047619047619, 0.5476190476190476, 0.580952380952381, true, CycleMethod.NO_CYCLE,stops);
	    btn1.setTextFill(Color.web("#120aa4"));
	    btn2.setTextFill(Color.web("#ff0000"));
	    btn3.setTextFill(Color.web("#4800ff"));
	    btn4.setTextFill(lg1);
	    btn5.setTextFill(Color.web("#ff00e9"));
	    btn6.setTextFill(Color.web("#000000"));
	    btn1.setFont(new Font("System", 15));
	    btn2.setFont(new Font("System", 15));
	    btn3.setFont(new Font("System", 15));
	    btn4.setFont(new Font("System", 15));
	    btn5.setFont(new Font("System", 15));
	    btn6.setFont(new Font("System", 15));
	    btn1.setStyle("-fx-font-weight: bold");
	    btn2.setStyle("-fx-font-weight: bold");
	    btn3.setStyle("-fx-font-weight: bold");
	    btn4.setStyle("-fx-font-weight: bold");
	    btn5.setStyle("-fx-font-weight: bold");
	    btn6.setStyle("-fx-font-weight: bold");
	    btn1.setDefaultButton(true);
	    btn2.setDefaultButton(true);
	    btn3.setDefaultButton(true);
	    btn4.setDefaultButton(true);
	    btn5.setDefaultButton(true);
	    btn6.setDefaultButton(true);
	    btn1.setMaxHeight(31);
	    btn1.setMaxWidth(157);
	    btn2.setMaxHeight(31);
	    btn2.setMaxWidth(157);
	    btn3.setMaxHeight(31);
	    btn3.setMaxWidth(157);
	    btn4.setMaxHeight(31);
	    btn4.setMaxWidth(157);
	    btn5.setMaxHeight(31);
	    btn5.setMaxWidth(157);
	    btn6.setMaxHeight(31);
	    btn6.setMaxWidth(157);
	    encode1 = new MenuItem("Atbash");
	    encode2 = new MenuItem("Rot-13");
	    encode3 = new MenuItem("utf-8");
	    encode = new MenuButton("Encode",null, encode1, encode2,encode3);
	    encode.setMaxHeight(31);
	    encode.setMaxWidth(157);
	    encode.setStyle("-fx-font-weight: bold");
	    encode.setFont(new Font("System", 15));
	    encode.setTextFill(Color.web("#ff00a1"));
	    encode.setFont(new Font("System", 12));
	    encode1.setStyle("-fx-font-weight: bold");
	    encode2.setStyle("-fx-font-weight: bold");
	    encode3.setStyle("-fx-font-weight: bold");
	    l1=new Label("Name Of File ");
	    l2=new Label("The Author");
	    l3=new Label("The Title ");
	    l4=new Label("The date that it was created. ");
	    l5=new Label("The date that it was last saved. ");
	    l6=new Label("Text2Speech");
	    l1.setTextFill(Color.web("#000cff"));
	    l2.setTextFill(Color.web("ff0000"));
	    l3.setTextFill(Color.web("#8d0762"));
	    l4.setTextFill(Color.web("#ae1d1d"));
	    l5.setTextFill(Color.web("#08ae59"));
	    l6.setTextFill(Color.web("#ff9d00"));
	    l1.setFont(new Font("System", 15));
	    l2.setFont(new Font("System", 15));
	    l3.setFont(new Font("System", 15));
	    l4.setFont(new Font("System", 15));
	    l5.setFont(new Font("System", 15));
	    l6.setFont(new Font("System", 15));
	    l1.setStyle("-fx-font-weight: bold");
	    l2.setStyle("-fx-font-weight: bold");
	    l3.setStyle("-fx-font-weight: bold");
	    l4.setStyle("-fx-font-weight: bold");
	    l5.setStyle("-fx-font-weight: bold");
	    l6.setStyle("-fx-font-weight: bold");
	    textf1=new TextField();
	    textf2=new TextField();
	    textf3=new TextField();
	    textf4=new TextField();
	    textf5=new TextField();
	    textA=new TextArea();
	    textf1.setPromptText("Tolkien *Need completed for Save");
	    textf2.setPromptText("John Ronald Reuel Tolkien *Need completed for Save");
	    textf3.setPromptText("The Lord of the Rings *Need completed for Save");
	    textf4.setPromptText("No supplement required");
	    textf5.setPromptText("No supplement required");
	    textA.setPromptText("He was the author of the classic high fantasy works The Hobbit and The Lord of the Rings. "+"\n" + 
	    		"He served as the Rawlinson and Bosworth Professor of Anglo-Saxon and "+"\n" + 
	    		"Fellow of Pembroke College, Oxford, from 1925 to 1945 and "+"\n" + 
	    		"Merton Professor of English Language and Literature and "+"\n" + 
	    		"Fellow of Merton College, Oxford, from 1945 to 1959. "+"\n" + 
	    		"He was at one time a close friend of C. S. Lewisthey were both members of the informal literary discussion group known as the Inklings. "+"\n"+
	    		" *Need completed for Save");
	    if(!(array==null)) {
		    textf1.setText(array[0]);
		    textf2.setText(array[1]);
		    textf3.setText(array[2]);
		    textf4.setText(array[3]);
		    textf5.setText(array[4]);
		    textA.setText(array[5]);
		    textf1.setEditable(false);
		    textf2.setEditable(false);
		    textf3.setEditable(false);
		    textf4.setEditable(false);
		    textf5.setEditable(false);
		    textA.setEditable(false);
		    grid1.add(btn4,0,0);
		    ViewWindowStage.setTitle("Text2SpeechEditor Load File");

		    PRESS.callReplayManager("MenuLoad",ViewWindowStage, textf1.getText(), textf2.getText(), textf3.getText(), textf4.getText(), textf5.getText(), textA.getText(), -1, (float)-1,(float)-1, (float)-1, null,null,null,null,null);
	    }
	    else {
		    textf4.setEditable(false);
		    textf5.setEditable(false);
		    ViewWindowStage.setTitle("Text2SpeechEditor New File");
	    }
	    grid1.add(encode,1,0);
	    grid1.add(l1,0,1);
	    grid1.add(l2,0,2);
	    grid1.add(l3,0,3);
	    grid1.add(l4,0,4);
	    grid1.add(l5,0,5);
	    grid1.add(l6,0,6);
	    grid1.add(textf1,1,1);
	    grid1.add(textf2,1,2);
	    grid1.add(textf3,1,3);
	    grid1.add(textf4,1,4);
	    grid1.add(textf5,1,5);
	    grid1.add(textA,1,6);
	    grid1.add(btn1,2,0);
	    grid1.add(btn2,3,0);
	    grid1.add(btn3,2,6);
	    grid1.add(btn5,3,6);
	    grid1.add(btn6,2,1);
	    ViewWindowStage.show();
		ViewWindowScene=new Scene(grid1);
		ViewWindowStage.setScene(ViewWindowScene);
		ViewWindowStage.centerOnScreen();

	    btn1.setOnAction(e1 -> {
	    	PRESS.Factorybuttonsaction("MenuSave",ViewWindowStage,textf1.getText(), textf2.getText(), textf3.getText(), textf4.getText(), textf5.getText(), textA.getText(),-1,e1,null,null,null,null);

		    PRESS.callReplayManager("MenuSave", ViewWindowStage, textf1.getText(), textf2.getText(), textf3.getText(), textf4.getText(), textf5.getText(), textA.getText(), -1, (float)-1,(float)-1, (float)-1, e1,null,null,null,null);
	    });

	    btn2.setOnAction(e2 -> {
	    	PRESS.Factorybuttonsaction("closeStage",ViewWindowStage,null,null,null,null,null,null,-1,e2,null,null,null,null);

	    	PRESS.callReplayManager("closeStage", ViewWindowStage, null, null, null, null, null, null, -1, (float)-1,(float)-1, (float)-1, e2,null,null,null,null);

	    });
	    btn3.setOnAction(e3 -> {
	    	if (textA.getText().isEmpty()) {
	    		WarningWindow("SpeechButton");
	    	}
		    	else {
		    		Choicewindow(textA,"speechButton","read");		    	
			}
	    });
	    btn4.setOnAction(e4 -> {
	    	PRESS.Factorybuttonsaction("Edit",null,null, null, null,null,null, null,-1,e4,textf1,textf2,textf3,textA);

	    	PRESS.callReplayManager("Edit", null, null, null, null, null, null, null, -1, (float)-1,(float)-1, (float)-1, e4,textf1,textf2,textf3,textA);
	    });
	    btn5.setOnAction(e3 -> {
	    	if (textA.getText().isEmpty()) {
	    		WarningWindow("ReverseSpeechButton");	    		
	    	}
	    	else {
		    	Choicewindow(textA,"ReverseSpeechButton","read");
	    	}
	    });
	    btn6.setOnAction(e3 -> {
	    	grid4 = new GridPane();
	    	slider = new Slider(0, 1, 0.5); 
	        slider.setShowTickMarks(true); 
	        slider.setShowTickLabels(true);
	        slider.setMajorTickUnit(0.1f); 
	        slider.setBlockIncrement(0.1f); 
	        slider.setMinWidth(200);
	    	SliderLabel=new Label("Volume");
	    	PitschLabel=new Label("Sets the baseline pitch");
	    	RateLabel=new Label("Sets the rate of speech.");
	    	SliderLabel.setTextFill(Color.web("#00b4ff"));
	    	PitschLabel.setTextFill(Color.web("#007fff"));
	    	RateLabel.setTextFill(Color.web("#0b00e7"));
		    SliderLabel.setFont(new Font("System", 15));
		    PitschLabel.setFont(new Font("System", 15));
		    RateLabel.setFont(new Font("System", 15));
		    SliderLabel.setStyle("-fx-font-weight: bold");
		    PitschLabel.setStyle("-fx-font-weight: bold");
		    RateLabel.setStyle("-fx-font-weight: bold");
	    	textPitch=new TextField();
	    	textRate=new TextField();
	    	textPitch.setPromptText("Only numbers integer or Decimal");
	    	textRate.setPromptText("Only numbers integer or Decimal");
	    	btnSET=new Button("Set the voice");
	    	btnSET.setTextFill(Color.web("#ff4c00"));
	    	btnSET.setFont(new Font("System", 15));
	    	btnSET.setStyle("-fx-font-weight: bold");
	    	btnSET.setDefaultButton(true);
	    	grid4.add(SliderLabel,0,0);
	    	grid4.add(slider,1,0);
	    	grid4.add(PitschLabel,0,1);
	    	grid4.add(textPitch,1,1);
	    	grid4.add(RateLabel,0,2);
	    	grid4.add(textRate,1,2);
	    	grid4.add(btnSET,2,3);
	    	SetVoiceStAGE = new Stage();
	    	SetVoiceStAGE.setTitle("Set Voice");
	    	SetVoiceScene=new Scene(grid4);
	    	SetVoiceStAGE.setScene(SetVoiceScene);
	    	SetVoiceStAGE.centerOnScreen();
	    	SetVoiceStAGE.initModality(Modality.APPLICATION_MODAL);
	    	SetVoiceStAGE.show();	
	    	btnSET.setOnAction(enc1->{
	    		if(textPitch.getText().isEmpty()) {
	    			bPitch=true;
	    		}
	    		else {
	    			try
		            { 
		                // checking valid float using parseInt() method 
		                Float.parseFloat(textPitch.getText()); 
		                bPitch=true;
		                
		            }  
		            catch (NumberFormatException e) 
		            { 
		            	try
			            { 
			                // checking valid float using parseInt() method 
		            		Integer.parseInt(textPitch.getText()); 
		            		bPitch=true;
			            }  
			            catch (NumberFormatException ee) 
			            { 
			            	bPitch=false;
			            } 
		            } 
	    		}
	    		if(textRate.getText().isEmpty()) {
	    			bRate=true;
	    		}
	    		else {
		    		try
		            { 
		                // checking valid float using parseInt() method 
		                Float.parseFloat(textRate.getText()); 
		                bRate=true;
		                
		            }  
		            catch (NumberFormatException e) 
		            { 
		            	try
			            { 
			                // checking valid float using parseInt() method 
		            		Integer.parseInt(textRate.getText()); 
		            		bRate=true;
			            }  
			            catch (NumberFormatException ee) 
			            { 
			            	bRate=false;
			            } 
		            } 
	    		}
	    		if(bRate&&bPitch) {
	    			if(textRate.getText().isEmpty()&&textPitch.getText().isEmpty()) {
		    			PRESS.Factorybuttonsaction((float)slider.getValue(), (float)-1,(float)-1);

		    	    	PRESS.callReplayManager("setVoice", null, null, null, null, null, null, null, -1,(float)slider.getValue(), (float)-1, (float)-1, enc1, null, null, null, null);
	    			}
	    			else if(!(textRate.getText().isEmpty())&&textPitch.getText().isEmpty()) {

		    			PRESS.Factorybuttonsaction((float)slider.getValue(), Float.parseFloat(textRate.getText()), (float)-1);

		    	    	PRESS.callReplayManager("setVoice", null, null, null, null, null, null, null, -1,(float)slider.getValue(),Float.parseFloat(textRate.getText()), (float)-1, enc1, null, null, null, null);
	    			}
	    			else if(textRate.getText().isEmpty()&&!(textPitch.getText().isEmpty())) {

		    			PRESS.Factorybuttonsaction((float)slider.getValue(),  (float)-1,  Float.parseFloat(textPitch.getText()));

		    	    	PRESS.callReplayManager("setVoice", null, null, null, null, null, null, null, -1,(float)slider.getValue(),(float)-1,Float.parseFloat(textPitch.getText()), enc1, null, null, null, null);
	    			}
	    			else {
		    			PRESS.Factorybuttonsaction((float)slider.getValue(), Float.parseFloat(textRate.getText()),  Float.parseFloat(textPitch.getText()));

		    	    	PRESS.callReplayManager("setVoice", null, null, null, null, null, null, null, -1,(float)slider.getValue(),Float.parseFloat(textRate.getText()),Float.parseFloat(textPitch.getText()), enc1, null, null, null, null);
	    			}
	    			SetVoiceStAGE.close();
	    		}
	    		else {
	    			WarningWindow("Set the voice Button");
	    		}
	    		
	    	});
	    	
	    });
	    

	    encode1.setOnAction(enc1->{
	    	if (flag==1) {
	    		holdText.setText(textA.getText());
	    		flag=0;
	    	}
	    	if (textA.getText().isEmpty()) {
	    		WarningWindow("encode Atbash");
	    		}
	    	else {
		    	Choicewindow(textA,"Atbash","Encode");
			}
	    });
	    encode2.setOnAction(enc1->{
	    	if (flag==1) {
	    		holdText.setText(textA.getText());
	    		flag=0;
	    	}
	    	if (textA.getText().isEmpty()) {
	    		WarningWindow("encode Rot13");
	    	}
	    	else {
		    	Choicewindow(textA,"Rot13","Encode");
				}
	    });
	    encode3.setOnAction(enc3->{
	    	if (holdText.getText().isEmpty()) {
	    		WarningWindow("UTF-8");
	    	}
	    	else {
	    		Choicewindow(textA,"UTF-8","Encode");
	        	flag=1;
	    	}

	    });
	   
		
    	
		
	}

	public void WarningWindow(String ButtoName) {
		grid3 = new GridPane();
		if(ButtoName.equals("Set the voice Button")) {

			warning=new Label("You must write only numbers integer or Decimal  and after press "+ButtoName);
		}
		else {

			warning=new Label("You must write something in Text2Speech and after press "+ButtoName);
		}
		warning.setTextFill(Color.web("#ff0000"));
		warning.setStyle("-fx-font-weight: bold");
		warning.setFont(new Font("System", 15));
		ok=new Button("OK");
		space=new Button();
		space.setVisible(false);
		space.setMinWidth(50);
		ok.setMinHeight(31);
		ok.setMinWidth(100);
		ok.setTextFill(Color.web("#08ae59"));
		ok.setFont(new Font("System", 15));
		ok.setStyle("-fx-font-weight: bold");
		ok.setDefaultButton(true);
		grid3.add(warning, 0, 0);
		grid3.add(space,1,0);
		grid3.add(ok, 2, 0);
		WarnStage = new Stage();
		WarnStage.setTitle("Warning");
		WARNScene=new Scene(grid3);
		WarnStage.setScene(WARNScene);
		WarnStage.centerOnScreen();
		WarnStage.initModality(Modality.APPLICATION_MODAL);
		WarnStage.show();	
		ok.setOnAction(ok1->{
			WarnStage.close();
		});
	}
	
	public void Choicewindow(TextArea text,String type,String TypeOfButton) {
    	choicefrombox=0;
    	linelabel=new Label("Line :");			    	
    	btnselect = new Button("Select");				    
    	btnselect.setTextFill(Color.web("#120aa4"));				   
    	btnselect.setFont(new Font("System", 15));				    
    	btnselect.setStyle("-fx-font-weight: bold");				   
    	btnselect.setDefaultButton(true);
    	btnselect.setMaxHeight(31);
    	btnselect.setMaxWidth(157);
	    final Tooltip tooltip = new Tooltip();
	    tooltip.setText("\n If you do not select something,the whole text will be "+TypeOfButton+" \n");
	    cb = new ComboBox<>();
	    cb.setTooltip(tooltip);
	    cb.setMinWidth(200);
	    cb.setMinHeight(20);
		array1=textA.getText().split("\n");
	    arraylenght=array1.length;
	    for (int i = 1; i <=arraylenght; i++) {
	    	cb.getItems().add(i);
	    }
	    grid2 = new GridPane();
	    grid2.add(cb, 1, 0);
	    grid2.add(linelabel,0,0);
	    grid2.add(btnselect,2,0);
	    SelectStage = new Stage();
	    if( type.equals("UTF-8")||type.equals("Rot13")||type.equals("Atbash")){

		    SelectStage.setTitle("Select Line for Encode");
	    }else {

		    SelectStage.setTitle("Select Line for speech");
	    }
		Selectscene=new Scene(grid2);
		SelectStage.setScene(Selectscene);
		SelectStage.centerOnScreen();
		SelectStage.initModality(Modality.APPLICATION_MODAL);
		SelectStage.show();		
		btnselect.setOnAction(e4 -> {
			
			if (cb.getValue()!=null) {
				
				choicefrombox= cb.getValue();
			}		
			SelectStage.close();
			if( type.equals("UTF-8")){
				textA.setText(PRESS.Factorybuttonsaction("UTF-8",holdText.getText(),choicefrombox,e4));
				PRESS.callReplayManager("UTF", null, null, null, null, null, null, holdText.getText(), choicefrombox, (float)-1,(float)-1, (float)-1, e4, null, null, null, null);
			}else if( type.equals("Rot13")){
				textA.setText(PRESS.Factorybuttonsaction("Rot13",textA.getText(),choicefrombox,e4));
				PRESS.callReplayManager("Rot13", null, null, null, null, null, null, textA.getText(), choicefrombox, (float)-1,(float)-1, (float)-1, e4, null, null, null, null);
			}
			else if( type.equals("Atbash")){
				textA.setText(PRESS.Factorybuttonsaction("Atbash",textA.getText(),choicefrombox,e4));

				PRESS.callReplayManager("Atbash", null, null, null, null, null, null, textA.getText(), choicefrombox, (float)-1,(float)-1, (float)-1, e4, null, null, null, null);
			}else if( type.equals("ReverseSpeechButton")){
				PRESS.Factorybuttonsaction("ReverseSpeechButton",null,null,null,null,null,null,textA.getText(),choicefrombox, e4,null,null,null,null);

				PRESS.callReplayManager("ReverseSpeechButton", null, null, null, null, null, null, textA.getText(), choicefrombox, (float)-1,(float)-1, (float)-1, e4, null, null, null, null);
			}
			else if( type.equals("speechButton")){
				PRESS.Factorybuttonsaction("speechButton",null,null,null,null,null,null,textA.getText(),choicefrombox, e4,null,null,null,null);
				PRESS.callReplayManager("speechButton", null, null, null, null, null, null, textA.getText(), choicefrombox, (float)-1,(float)-1, (float)-1, e4, null, null, null, null);
			}
		});			
	}
	//me bohthane stin replay den xreisimopoiounte genika pote allios
	public void TEXTAset(String txt) {
		textA.setText(txt);
	}
	public void TEXTeditable() {
    	textf1.setEditable(true);
	    textf2.setEditable(true);
	    textf3.setEditable(true);
	    textA.setEditable(true);
	}

	public void Closestage() {
		ViewWindowStage.close();
	}
	
	
}

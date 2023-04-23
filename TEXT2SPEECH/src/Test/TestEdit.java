package Test;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.SwingUtilities;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Filebuttons;
import javafx.embed.swing.JFXPanel;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class TestEdit {

	private Filebuttons file=new Filebuttons();
	private TextField text1=new TextField();
	private TextField text2=new TextField();
	private TextField text3=new TextField();
	private TextArea textA=new TextArea();
	@BeforeClass
    public static void initializefortextfield() throws ExceptionInInitializerError, InterruptedException {

	        final CountDownLatch latch = new CountDownLatch(1);
	        SwingUtilities.invokeLater(() -> {
	        	new JFXPanel(); // initializes JavaFX items epeidh einai to edit kai prepei na kanei edit anagkastika textfield items 
	        	latch.countDown(); });
	            if (!latch.await(5L, TimeUnit.SECONDS)) {
	                throw new ExceptionInInitializerError();
	            }

            
    }
    @Test
    public void ΤestEditPass()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,text2,text3,textA) ;
		text1.setText("EditableText1");
		text2.setText("EditableText2");
		text3.setText("EditableText3");
		textA.setText("EditableTextA");
		Assert.assertTrue(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail1()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,null,text3,textA) ;
		text1.setText("EditableText1");
		text3.setText("EditableText3");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail2()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,text2,text3,textA) ;
		text2.setText("EditableText2");
		text3.setText("EditableText3");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail3()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,text2,null,textA) ;
		text1.setText("EditableText1");
		text2.setText("EditableText2");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail4()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,text2,text3,null) ;
		text1.setText("EditableText1");
		text2.setText("EditableText2");
		text3.setText("EditableText3");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail5()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,null,null,textA) ;
		text1.setText("EditableText1");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail6()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,null,text3,textA) ;
		text3.setText("EditableText3");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail7()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,text2,null,textA) ;
		text2.setText("EditableText2");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail8()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,text2,text3,null) ;
		text2.setText("EditableText2");
		text3.setText("EditableText3");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail9()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,text2,null,null) ;
		text1.setText("EditableText1");
		text2.setText("EditableText2");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail10()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,null,null,textA) ;
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail11()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,null,text3,null) ;
		text3.setText("EditableText3");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail12()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(null,text2,null,null) ;
		text2.setText("EditableText2");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail13()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,null,null,null) ;
		text1.setText("EditableText1");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail14()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,null,null,textA) ;
		text1.setText("EditableText1");
		textA.setText("EditableTextA");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    @Test
    public void ΤestEditFail15()  {

    	text1.setText("Text1");
		text2.setText("Text2");
		text3.setText("Text3");
		textA.setText("TextA");
		textA.setEditable(false);
		text1.setEditable(false);
		text2.setEditable(false);
		text3.setEditable(false);
		file.Edit(text1,null,text3,null) ;
		text1.setText("EditableText1");
		text3.setText("EditableText3");
		Assert.assertFalse(text1.getText().equals("EditableText1")&&text2.getText().equals("EditableText2")&&text3.getText().equals("EditableText3")&&textA.getText().equals("EditableTextA"));
    }
    
		
	
}

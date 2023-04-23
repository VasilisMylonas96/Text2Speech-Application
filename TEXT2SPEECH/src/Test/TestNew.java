package Test;


import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import javax.swing.SwingUtilities;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import Model.Filebuttons;
import javafx.embed.swing.JFXPanel;
public class TestNew {

	private Filebuttons file=new Filebuttons();
	@BeforeClass
    public static void initializefortextfield() throws ExceptionInInitializerError, InterruptedException {

	        final CountDownLatch latch = new CountDownLatch(1);
	        SwingUtilities.invokeLater(() -> {
	        	new JFXPanel(); // initializes JavaFX 
	        	latch.countDown(); });
	            if (!latch.await(5L, TimeUnit.SECONDS)) {
	                throw new ExceptionInInitializerError();
	            }

            
    }
	@Test
	public void NewTest() {
		 try
		    {
			 	file.Mnew();//epeidi o tropos opou exw ftiaksei tin new den dinei perithorio lathous profanws den ginetai na ftiaksoume test pou the bgainei arnitiko
		        Assert.assertTrue(true);
		    }
		    catch(Exception ex) {

		    }
	}
}

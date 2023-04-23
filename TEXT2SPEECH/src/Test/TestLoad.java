package Test;


import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import Model.LoadModel;

public class TestLoad {
	public final ExpectedException exception = ExpectedException.none();
	private LoadModel  file=new LoadModel();

    @Test
    public void ΤestLoadPass()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\Tolkien.txt")!=null);
    }
    @Test
    public void ΤestLoadPass1()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass1.txt")!=null);
    }
    @Test
    public void ΤestLoadPass2()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass2.txt")!=null);
    }
    @Test
    public void ΤestLoadPass3()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass3.txt")!=null);
    }
    @Test
    public void ΤestLoadPass4()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass4.txt")!=null);
    }
    @Test
    public void ΤestLoadPass5()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass5.txt")!=null);
    }
    @Test
    public void ΤestLoadPass6()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass6.txt")!=null);
    }
    @Test
    public void ΤestLoadPass7()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass7.txt")!=null);
    }
    @Test
    public void ΤestLoadPass8()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass8.txt")!=null);
    }
    @Test
    public void ΤestLoadPass9()  {

    	Assert.assertTrue(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\TESTNAMEPass9.txt")!=null);
    }
    
    @Test
    public void ΤestLoadFail1()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\emty.txt")!= null);

    }
    @Test
    public void ΤestLoadFail2()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad1.txt")!= null);

    }
    @Test
    public void ΤestLoadFail3()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad2.txt")!= null);

    }
    @Test
    public void ΤestLoadFail4()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad3.txt")!= null);

    }
    @Test
    public void ΤestLoadFail5()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad4.txt")!= null);

    }
    @Test
    public void ΤestLoadFail6()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad5.txt")!= null);

    }
    @Test
    public void ΤestLoadFail7()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad6.txt")!= null);

    }
    @Test
    public void ΤestLoadFail8()  {
    		Assert.assertFalse(file.LoadFile("C:\\Users\\BASILIS\\eclipse-workspace\\TEXT2SPEECH\\failTestForLoad7.txt")!= null);

    }

}

package Test;
import org.junit.Assert;
import org.junit.Test;
import Model.SaveModel;
public class TestSave {
	private SaveModel save;
	
	private String array[];

	@Test
	public void TestSaveFail1() {
		save=new SaveModel();
		array=new String[1];
		array[0]="TESTNAMEFail1";

		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail2() {
		save=new SaveModel();
		array=new String[2];
		array[0]="TESTNAMEFail2";
		array[1]="TestAuthor";
		
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail3() {
		save=new SaveModel();
		array=new String[3];
		array[0]="TESTNAMEFail3";
		array[1]="TestAuthor";
		array[2]="TestTitle";

		
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail4() {
		save=new SaveModel();
		array=new String[4];
		array[0]="TESTNAMEFail4";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="Testsomething here";


		
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail5() {
		save=new SaveModel();
		array=new String[5];
		array[0]="TESTNAMEFail5";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="Test create date something here";
		array[4]="Test last change something here";
		
		Assert.assertFalse(1==save.savefile(array));
	
	}
	@Test
	public void TestSaveFail6() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEFail13";
		array[1]="1332";
		array[2]="TestTitle";
		array[3]="";
		array[4]="";
		array[5]="Test Text2speech something here";
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail7() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEFail14";
		array[1]="TestAuthor";
		array[2]="123";
		array[3]="";
		array[4]="";
		array[5]="Test Text2speech something here";
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail8() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEFail16";
		array[1]="TestAuthor";
		array[2]="123";
		array[3]="";
		array[4]="2020-05-14T03:44:06.628858";
		array[5]="Test Text2speech something here";
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSaveFail9() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEFail17";
		array[1]="TestAuthor";
		array[2]="123";
		array[3]="2020-05-09T23:10:29.743898";
		array[4]="2020-05-14T03:44:06.628858";
		array[5]="Test Text2speech something here";
		Assert.assertFalse(1==save.savefile(array));
	}
	@Test
	public void TestSavePass1() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass1";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="";
		array[4]="";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass2() {
		save=new SaveModel();
		array=new String[9];
		array[0]="TESTNAMEPass2";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="";
		array[4]="";
		array[5]="Test Text2speech something here";//upotithete otidipote meta to 5 einai seires tou text2speech
		array[6]="Test Text2speech something here";
		array[7]="Test Text2speech something here";
		array[8]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}

	@Test
	public void TestSavePass3() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass3";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="Test create date something here";
		array[4]="Test last change something here";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass4() { 
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass4";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="asdasdasda";
		array[4]="";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass5() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass5";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="1231231231";
		array[4]="";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass6() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass6";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="";
		array[4]="asdasdasda";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}

	@Test
	public void TestSavePass7() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass7";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="";
		array[4]="1231231231";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass8() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass8";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="1231231231";
		array[4]="asdasdasda";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	@Test
	public void TestSavePass9() {
		save=new SaveModel();
		array=new String[6];
		array[0]="TESTNAMEPass9";
		array[1]="TestAuthor";
		array[2]="TestTitle";
		array[3]="asdasdasda";
		array[4]="1231231231";
		array[5]="Test Text2speech something here";
		Assert.assertTrue(1==save.savefile(array));
	}
	

}

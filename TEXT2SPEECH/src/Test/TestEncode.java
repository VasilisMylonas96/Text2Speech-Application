package Test;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;

import Model.Atbash;
import Model.Encode;
import Model.Rot_13;
public class TestEncode {

	private Encode Encode;
	private String startString;
	private String testString,converString;
	public char[] SmallAlphabet = new char[26],BigAlphabet = new char[26];
	
	
	
	@BeforeAll
    public void initializefortextfield() {		
		for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
	    {
	    	SmallAlphabet[ch-'a']=ch;
	    } 
	    for(char ch = 'A'; ch <= 'Z'; ++ch)// fills alphabet array with the alphabet
	    {
	    	BigAlphabet[ch-'A']=ch;
	    }
	
	}

	@Test
	public void TestAtbashPass1() {
		Encode=new Atbash();
		startString="AAA";
		converString="ZZZ";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestAtbashPass2() {
		Encode=new Atbash();
		startString="aaa";
		converString="zzz";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestAtbashPass3() {
		Encode=new Atbash();
		startString="123";
		converString="123";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestAtbashPass4() {
		Encode=new Atbash();
		startString="AAA \n ZZZ";
		converString="AAA \n AAA";
		testString=Encode.MakeMainEncode(startString,2);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestRot_13Pass1() {
		Encode=new Rot_13();
		startString="123";
		converString="123";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestRot_13Pas2() {
		Encode=new Rot_13();
		startString="AAA";
		converString="NNN";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestRot_13Pass3() {
		Encode=new Rot_13();
		startString="aaa";
		converString="nnn";
		testString=Encode.MakeMainEncode(startString,0);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestRot_13Pass4() {
		Encode=new Rot_13();
		startString="AAA \n NNN";
		converString="AAA \n AAA";
		testString=Encode.MakeMainEncode(startString,2);
		Assert.assertTrue(testString.equals(converString));
	}
	@Test
	public void TestRot_13Fail() {
		Encode=new Rot_13();
		startString="AAA \n AAA";
		converString="AAA \n AAA";
		testString=Encode.MakeMainEncode(startString,2);
		Assert.assertFalse(testString.equals(converString));
	}
	@Test
	public void TestAtbashFail() {
		Encode=new Atbash();
		startString="AAA \n AAA";
		converString="AAA \n AAA";
		testString=Encode.MakeMainEncode(startString,2);
		Assert.assertFalse(testString.equals(converString));
	}
	
}

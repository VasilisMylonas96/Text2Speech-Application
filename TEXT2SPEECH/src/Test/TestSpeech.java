package Test;

import org.junit.Assert;
import org.junit.Test;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import Model.Speech;
public class TestSpeech{
	private Speech Speech=new Speech();
	private VoiceManager vm = VoiceManager.getInstance();
    private Voice voice = vm.getVoice("kevin16");

	@Test
	public void TestSpeechPass() {
    	voice.allocate();
		Assert.assertTrue(Speech.speechButton(voice,"a b c 1 2 3 ! @ # $ % ^ & * _ -",0));
	}
	@Test
	public void TestSpeechPass1() {
    	voice.allocate();
		Assert.assertTrue(Speech.speechButton(voice,"1 2 3 ",0));
	}
	@Test
	public void TestSpeechPass2() {
    	voice.allocate();
		Assert.assertTrue(Speech.speechButton(voice,"1 \n 2 \n 3",1));
	}
	@Test
	public void TestSpeechPass3() {
    	voice.allocate();
		Assert.assertTrue(Speech.speechButton(voice,"1 \n 2 \n 3",2));
	}
	
	@Test
	public void TestSpeechPass4() {
    	voice.allocate();
		Assert.assertTrue(Speech.speechButton(voice,"1 \n 2 \n 3",3));
	}
	@Test
	public void TestSpeechFail() {
    	voice.allocate();
		Assert.assertFalse(Speech.speechButton(voice,"1 \n 2 \n 3",-1));
	}
	
	
}

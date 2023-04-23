package Test;

import org.junit.Assert;
import org.junit.Test;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import Model.ReverseSpeech;

public class TestReverseSpeech {
	private ReverseSpeech Speech=new ReverseSpeech();
	private VoiceManager vm = VoiceManager.getInstance();
    private Voice voice = vm.getVoice("kevin16");
	@Test
	public void TestSpeechPass() {
    	voice.allocate();
		Assert.assertTrue(Speech.ReverseSpeechButton(voice,"a b c 1 2 3 ! @ # $ % ^ & * _ -",0));
	}
	@Test
	public void TestSpeechPass1() {
    	voice.allocate();
		Assert.assertTrue(Speech.ReverseSpeechButton(voice,"1 2 3 ",0));
	}
	@Test
	public void TestSpeechPass2() {
    	voice.allocate();
		Assert.assertTrue(Speech.ReverseSpeechButton(voice,"1 2 3 \n 2 3 1  \n 3 2 1",1));
	}
	@Test
	public void TestSpeechPass3() {
    	voice.allocate();
		Assert.assertTrue(Speech.ReverseSpeechButton(voice,"1 2 3 \n 2 3 1 \n 3 2 1",2));
	}
	
	@Test
	public void TestSpeechPass4() {
    	voice.allocate();
		Assert.assertTrue(Speech.ReverseSpeechButton(voice,"1 2 3 \n 2 3 1 \n 3 2 1",3));
	}
	@Test
	public void TestSpeechFail() {
    	voice.allocate();
		Assert.assertFalse(Speech.ReverseSpeechButton(voice,"1 2 3 \n 2 3 1 \n 3 2 1",-1));
	}
}

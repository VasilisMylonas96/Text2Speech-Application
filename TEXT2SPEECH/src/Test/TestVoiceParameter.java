package Test;

import org.junit.Assert;
import org.junit.Test;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

import Model.VoiceParametersSet;

public class TestVoiceParameter {
	private VoiceManager vm = VoiceManager.getInstance();
    private Voice voice = vm.getVoice("kevin16");
    private VoiceParametersSet voicechange=new VoiceParametersSet();
    private float volume;
    private float speechRate;
    private float pitch;

	@Test
	public void TestVoiceParameterPass1() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();
		voice=voicechange.Volume(voice, (float)0.5);
		Assert.assertTrue(volume!=voice.getVolume()&&speechRate==voice.getRate()&&pitch==voice.getPitch());
	}
	@Test
	public void TestVoiceParameterPass2s() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();
    	voice=voicechange.Volume(voice, (float)0.5);
    	voice=voicechange.speechRate(voice, (float)100);
		Assert.assertTrue(volume!=voice.getVolume()&&speechRate!=voice.getRate()&&pitch==voice.getPitch());
	}
	@Test
	public void TestVoiceParameterPass3() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();
    	voice=voicechange.Volume(voice, (float)0.5);
    	voice=voicechange.speechRate(voice, (float)100);
		voice=voicechange.pitch(voice, (float)1000);

	}
	@Test
	public void TestVoiceParameterPass4() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)0.5);
    	voice=voicechange.speechRate(voice, (float)-1);// exw setarei to -1 na einai otan o xristis den dinei kamia timi gia to pitch i to rate
		voice=voicechange.pitch(voice, (float)-1);

		Assert.assertTrue(volume!=voice.getVolume()&&speechRate==voice.getRate()&&pitch==voice.getPitch());
		
	}
	@Test
	public void TestVoiceParameterPass5() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)0.5);
    	voice=voicechange.speechRate(voice, (float)10);
		voice=voicechange.pitch(voice, (float)-10);//to pitch mporei na parei arnitikes times

		Assert.assertTrue(volume!=voice.getVolume()&&speechRate!=voice.getRate()&&pitch!=voice.getPitch());
		
	}
	@Test
	public void TestVoiceParameterfail1() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)-1);
    	voice=voicechange.speechRate(voice, (float)-1);//den ta peirazw ousiastika
		voice=voicechange.pitch(voice, (float)-1);

		Assert.assertFalse(volume!=voice.getVolume()&&speechRate==voice.getRate()&&pitch==voice.getPitch());
		
	}
	@Test
	public void TestVoiceParameterfail2() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)-2);
    	voice=voicechange.speechRate(voice, (float)-1);
		voice=voicechange.pitch(voice, (float)-1);//den ta peirazw ousiastika

		Assert.assertFalse(volume!=voice.getVolume()&&speechRate==voice.getRate()&&pitch==voice.getPitch());
		
	}
	@Test
	public void TestVoiceParameterfail3() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)-2);
    	voice=voicechange.speechRate(voice, (float)-10);//den mporei na parei timi arnitiki
		voice=voicechange.pitch(voice, (float)-1);//den to peirazw ousiastika mporei na parei ta panta 

		Assert.assertFalse(volume!=voice.getVolume()&&speechRate!=voice.getRate()&&pitch==voice.getPitch());
		
	}
	@Test
	public void TestVoiceParameterfail4() {
		voice.allocate();
		volume=voice.getVolume();
		speechRate=voice.getRate();
		pitch=voice.getPitch();

    	voice=voicechange.Volume(voice, (float)1);
    	voice=voicechange.speechRate(voice, (float)-10);//den mporei na parei timi arnitiki
		voice=voicechange.pitch(voice, (float)-1);//den to peirazw ousiastika mporei na parei ta panta 

		Assert.assertFalse(volume==voice.getVolume()&&speechRate!=voice.getRate()&&pitch==voice.getPitch());
	}
}
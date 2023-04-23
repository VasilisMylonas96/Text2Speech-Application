package Model;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
public class SpeechAdapter {
	private VoiceManager vm = VoiceManager.getInstance();
    private Voice voice = vm.getVoice("kevin16");
	private textToSpeechInterface voicetext;
	private Boolean condition;
	public void speech(String text,int i) {
		voice.allocate();
		voicetext=new Speech();
		condition=voicetext.speechButton(voice ,text, i) ;
		if(condition=false) {
			System.out.print("Text conversion Fail in speeches");
		}
		else {
			System.out.print("Text conversion successes in speeches");
		}
	}
	public void ReverseSpeech(String text,int i) {
		voice.allocate();
		voicetext=new ReverseSpeech();
		condition=voicetext.ReverseSpeechButton(voice ,text, i) ;
		if(condition=false) {
			System.out.print("Text conversion Fail in Reverse speeches");
		}
		else {
			System.out.print("Text conversion successes in Reverse speeches");
		}
	}
	public void SetParametersofVoice(float volume,float wordpersech,float hrz) {
		voicetext=new VoiceParametersSet();
		voice=voicetext.Volume(voice, volume);
		voice=voicetext.speechRate(voice, wordpersech);
		voice=voicetext.pitch(voice, hrz);
		
	}
}

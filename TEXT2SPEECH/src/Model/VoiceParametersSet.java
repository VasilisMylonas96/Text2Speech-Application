package Model;

import com.sun.speech.freetts.Voice;
public class VoiceParametersSet implements textToSpeechInterface{
	@Override
	public Boolean ReverseSpeechButton(Voice voice, String text, int i) {
		//do nothing
	     return false;
	}
	@Override
	public Boolean speechButton(Voice voice, String text, int i) {
		//do nothing
	     return false;
	}
	@Override
	public Voice Volume(Voice voice,float volume) {
		if(volume>=0.0&&volume<=1.0) {
			voice.setVolume(volume);
		}
		else {
			System.out.print("unsuccessful change volume ");
		}
		return voice;
	}
	@Override
	public Voice speechRate(Voice voice,float wordpersech) {
		if(wordpersech!=-1) {
			voice.setRate(wordpersech);
		}
		else if(wordpersech==-1){
			//dont do something
		}
		else {
			System.out.print("unsuccessful change  speech rate ");
		}
		return voice;
	}
	@Override
	public Voice pitch(Voice voice,float hrz) {
		if((hrz!=-1)) {
			voice.setPitch(hrz);
		}
		else if(hrz==-1){
			System.out.print("unsuccessful change  speech pitch ");
			//dont do something
		}
		return voice;
	}
}

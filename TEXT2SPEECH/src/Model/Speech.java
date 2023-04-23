package Model;

import com.sun.speech.freetts.Voice;
public class Speech implements textToSpeechInterface
{
	private String[] array1;
	@Override
	public Boolean ReverseSpeechButton(Voice voice,String text,int i) {
		//do nothing
		return false;
	}
	@Override
	public Boolean speechButton(Voice voice,String text,int i) {
		if (i<0) {
			return false;
		}
	    if (i==0) {
	    	voice.speak(text);
	    }
	    else {
	    	array1=text.split("\n");
	    	voice.speak(array1[i-1]);
	    }
	    return true;
	}
	@Override
	public Voice Volume(Voice voice,float volume) {
		// TODO Auto-generated method stub
		//do nothing
		return voice;
	}
	@Override
	public Voice speechRate(Voice voice,float wordpersech) {
		// TODO Auto-generated method stub
		//do nothing
		return voice;
	}
	@Override
	public Voice pitch(Voice voice,float hrz) {
		// TODO Auto-generated method stub
		//do nothing
		return voice;
	}


}

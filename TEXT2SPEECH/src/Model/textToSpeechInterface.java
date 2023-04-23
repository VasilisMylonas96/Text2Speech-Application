package Model;

import com.sun.speech.freetts.Voice;


public interface textToSpeechInterface {
	public Boolean ReverseSpeechButton(Voice voice,String text,int i) ;
	public Boolean speechButton(Voice voice,String text,int i) ;
	public Voice Volume(Voice voice,float volume) ;
	public Voice  speechRate (Voice voice,float wordpersech);
	public Voice  pitch (Voice voice,float hrz);
}

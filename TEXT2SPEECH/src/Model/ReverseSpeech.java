package Model;
import com.sun.speech.freetts.Voice;
public class ReverseSpeech implements textToSpeechInterface
{
	private String[] array1,input,input1;
	private String voiceString;
	@Override
	public Boolean ReverseSpeechButton(Voice voice ,String text,int i) {
		if (i<0) {
			return false;
		}
		voiceString="";
    	if (i==0) {
    		input = text.split(" "); 
        }
        else {
        	array1=text.split("\n");
        	input =array1[i-1].split(" "); 
        }
        input1=new String[input.length];
        int k1=0;
        for (int k=input.length-1;k>=0;k--) {
        	input1[k1]=input[k];
        	k1=k1+1;
         }
         for(int n=0;n<input1.length;n++) {
        	 voiceString=voiceString+input1[n]+"\n";
         }
         voice.speak(voiceString);
	     return true;
	}
	@Override
	public Boolean speechButton(Voice voice ,String text,int i) {
		//do nothing
	     return false;
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

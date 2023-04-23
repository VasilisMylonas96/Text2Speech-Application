package Model;
public class Atbash extends Encode{
	InterfaceEncode encode;
	private char[] ReverseSmallAlphabet = new char[26],ReverseBigAlphabet = new char[26],change;
	private int counter;
	private String StringForReturn;
	public  Atbash() {
		super();
		encode=new AtbaashReturn();
	}
	@Override
	String typeEncode() {
		return encode.encode() ;
	}
	@Override
	String EncodeAtbash(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		StringForReturn="";
		counter=0;
		for (int i=SmallAlphabet.length-1;i>=0;i--) {
			ReverseSmallAlphabet[counter]=SmallAlphabet[i];
			counter=counter+1;
		}
		counter=0;
		for (int i=BigAlphabet.length-1;i>=0;i--) {
			ReverseBigAlphabet[counter]=BigAlphabet[i];
			counter=counter+1;
		}
		change=array.toCharArray();
		for (int i=0;i<change.length;i++) {
			for (int j=0;j<SmallAlphabet.length;j++) {
				if (change[i]==SmallAlphabet[j]) {
					change[i]=ReverseSmallAlphabet[j];
					break;
				}
				else if (change[i]==BigAlphabet[j]) {
					change[i]=ReverseBigAlphabet[j];
					break;
				}
			}
		}
		for (int i=0;i<change.length;i++) {
			StringForReturn=StringForReturn+change[i];
		}
		return StringForReturn;
	}
	@Override
	String EncodeRot_13(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		//do nothing
		return"";
	}
	 String  EncodeUTF_8(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		 //do nothing 
		 return "";
	 }
}

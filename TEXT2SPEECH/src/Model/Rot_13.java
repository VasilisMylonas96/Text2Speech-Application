package Model;
public class Rot_13 extends Encode{
	InterfaceEncode encode;
	private char[] SmallAlphabetPlus13 = new char[39],BigAlphabetPlus13 = new char[39],change;
	private int counter;
	private String StringForReturn;
	public  Rot_13() {
		super();
		encode=new Rot13Return();
	}
	String typeEncode() {
		return encode.encode() ;
	}
	String EncodeAtbash(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		//do nothing
		return "" ;
	}
	String EncodeRot_13(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		StringForReturn="";
		counter=0;
		for (int i=0; i<SmallAlphabet.length;i++) {
			SmallAlphabetPlus13[counter]=SmallAlphabet[i];
			counter=counter+1;
		}
		for (int i=0; i<SmallAlphabet.length-13;i++) {
			SmallAlphabetPlus13[counter]=SmallAlphabet[i];
			counter=counter+1;
		}
		counter=0;
		for (int i=0; i<BigAlphabet.length;i++) {
			BigAlphabetPlus13[counter]=BigAlphabet[i];
			counter=counter+1;
		}
		for (int i=0; i<BigAlphabet.length-13;i++) {
			BigAlphabetPlus13[counter]=BigAlphabet[i];
			counter=counter+1;
		}
		change=array.toCharArray();
		for (int i=0;i<change.length;i++) {
			for (int j=0;j<SmallAlphabet.length;j++) {
				if (change[i]==SmallAlphabet[j]) {
					change[i]=SmallAlphabetPlus13[j+13];
					break;
				}
				else if (change[i]==BigAlphabet[j]) {
					change[i]=BigAlphabetPlus13[j+13];
					break;
				}
			}
			
		}
		for (int i=0;i<change.length;i++) {
			StringForReturn=StringForReturn+change[i];
		}
		return StringForReturn;
	}
	 String  EncodeUTF_8(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		 //donothing
		 return"";
	 }
}

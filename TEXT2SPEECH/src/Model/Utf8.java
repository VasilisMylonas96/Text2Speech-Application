package Model;
public class Utf8 extends Encode{
	private InterfaceEncode encode;
	public  Utf8() {
		super();
		encode=new UTF();
	}
	String EncodeAtbash(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		return "" ;
	}
	 String  EncodeRot_13(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		//do nothing
			return "" ;
	}
	 String  EncodeUTF_8(String array, char[] SmallAlphabet,char[] BigAlphabet) {
		 return array;
	 }
	String typeEncode() {
		return encode.encode() ;
	}
}

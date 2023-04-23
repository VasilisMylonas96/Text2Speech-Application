package Model;
public abstract class Encode {
	private char[] SmallAlphabet = new char[26],BigAlphabet = new char[26];
	private String[] array,arrayline;
	private String arraytostring="",arraytostringline="";
	public final String MakeMainEncode(String text,int line){
        for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
        {
        	SmallAlphabet[ch-'a']=ch;
        } 
        for(char ch = 'A'; ch <= 'Z'; ++ch)// fills alphabet array with the alphabet
        {
        	BigAlphabet[ch-'A']=ch;
        }
		if (line==0) {
			array=text.split(" ");
			for (int i=0; i<array.length;i++) {
					if (!array[i].equals("\n")) {
						if (typeEncode().equals("Atbash")) {
							array[i]=EncodeAtbash(array[i],SmallAlphabet,BigAlphabet);
						}							
						if(typeEncode().equals("Rot13")) {
							array[i]=EncodeRot_13(array[i],SmallAlphabet,BigAlphabet);
						}	
						if(typeEncode().equals("UTF8")) {
							array[i]= EncodeUTF_8(array[i],SmallAlphabet,BigAlphabet);
								
						}
					}
			}
			for (int i=0;i<array.length;i++) {
				if (i==array.length-1) {
					arraytostring=arraytostring+array[i];
				}else {
					arraytostring=arraytostring+array[i]+" ";
				}
			}
		}
		else {
			array=text.split("\n");
			arrayline=array[line-1].split(" ");
			for (int i=0; i<arrayline.length;i++) {
				if (typeEncode().equals("Atbash")) {
					arrayline[i]=EncodeAtbash(arrayline[i],SmallAlphabet,BigAlphabet);
				}							
				if(typeEncode().equals("Rot13")) {
					arrayline[i]=EncodeRot_13(arrayline[i],SmallAlphabet,BigAlphabet);
				}
				if(typeEncode().equals("UTF8")) {
					arrayline[i]= EncodeUTF_8(arrayline[i],SmallAlphabet,BigAlphabet);
				}
			}
			for (int i=0;i<arrayline.length;i++) {
				if (i==arrayline.length-1) {
					arraytostringline=arraytostringline+arrayline[i];
				}else {

					arraytostringline=arraytostringline+arrayline[i]+" ";
				}
			}
			for (int i=0;i<array.length;i++) {
				if(i!=line-1) {
					if(i==array.length-1) {
						arraytostring=arraytostring+array[i];
					}
					else {
						arraytostring=arraytostring+array[i]+"\n";
					}
				}
				else {
					if(i==array.length-1) {
						arraytostring=arraytostring+arraytostringline;
					}
					else {
						arraytostring=arraytostring+arraytostringline+"\n";
					}
				}
			}
		}
		return arraytostring;
	}
	abstract String EncodeAtbash(String array, char[] SmallAlphabet,char[] BigAlphabet);
	abstract String EncodeRot_13(String array, char[] SmallAlphabet,char[] BigAlphabet);
	abstract String  EncodeUTF_8(String array, char[] SmallAlphabet,char[] BigAlphabet);
	 String typeEncode() {
		return "kati" ;
	}

}

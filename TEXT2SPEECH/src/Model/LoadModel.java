package Model;



import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
public class LoadModel {

	private String[] array;
	private String  dataTextA;
	private Scanner myReader;
	private int loadtag=1;
	public String[] LoadFile(String path) {
		File file =new File(path);
		dataTextA="";

		
		try {
			myReader = new Scanner(file);
			int i =0;
			if(!myReader.hasNextLine()) {
				myReader.close();
				return null;
				
			}
			else {
				array=new String[6];
			}
			while (myReader.hasNextLine()) {
				
				if(i!=5) {
					String data = myReader.nextLine();
					if (data=="") {
						array[i]="";
					}
					array[i]=data;
					i=i+1;
				}
				else {
					dataTextA=dataTextA+myReader.nextLine()+"\n";
				}
				
			}
			array[i]=dataTextA;
			myReader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(array==null) {
			System.out.print("Load unsuccessful");
			return null;
		}
		for (int i = 0; i <=5; i++) {
			if(loadtag==1&&array[i].isEmpty()) {
				loadtag=0;
			}
		}
		try {
			Integer.parseInt(array[1]);
			loadtag=0;
		} catch (final NumberFormatException e) {
			
		}
		try {
			Integer.parseInt(array[2]);
			loadtag=0;
		} catch (final NumberFormatException e) {
		}
		
		if (loadtag==1) {
	    	System.out.print("Load successful");
	    	
	    	return array;
		}else {
	    	System.out.print("Load unsuccessful");
	    	loadtag=1;
	    	return null;
		}
		
	}
}

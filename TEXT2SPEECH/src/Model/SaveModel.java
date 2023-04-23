package Model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;
public class SaveModel {

	private String namefile;
	private FileWriter myWriter;
	private BasicFileAttributes attr;
	private FileWriter fstream;
	public int savefile(String[] array) {

		namefile=array[0];
		if(array.length<6) {
			return 0;
		}
		for (int i = 0; i <=5; i++) {
			if(array[i].isEmpty()&& i!=3&&i!=4) {
				return 0;
			}
		}
		 try {
		        Integer.parseInt(array[1]);
		        
		      
		        return 0;
		} catch (final NumberFormatException e) {
		       
		}
		try {
		       
		        
		        Integer.parseInt(array[2]);
		        return 0;
		} catch (final NumberFormatException e) {
		       
		}
		try {
			myWriter = new FileWriter(namefile+".txt");
			myWriter.close();
			File file = new File(namefile+".txt");
		    attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class);
			fstream = new FileWriter(namefile+".txt", true);
			for (int i = 0; i <=5; i++) {
				if(i==3) {
					fstream.write(attr.creationTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()+"\n");
				}
				else if(i==4){
					
					fstream.write(attr.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime()+"\n");
				}
				else {
					fstream.write(array[i]+"\n");
				}
			}
			fstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
		return 1;
		
	}
}

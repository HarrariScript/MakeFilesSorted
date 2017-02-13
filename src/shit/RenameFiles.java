package shit;

import java.io.File;

public class RenameFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 File folder = new File("F:\\Oo\\WorldHistory");
	        File[] listOfFiles = folder.listFiles();

	        for (int i = 0; i < listOfFiles.length; i++) {

	            if (listOfFiles[i].isFile()) {

	                File f = new File("F:\\Oo\\WorldHistory\\"+listOfFiles[i].getName()); 
//                    int j = listOfFiles[i].getName().indexOf("#");
                    String[] name = listOfFiles[i].getName().split("#");
                    String[] nametemp = (name[1]+"-"+name[0]).split(".mp4");
                    
                    System.out.println(nametemp[0]+" "+nametemp[1]);
	                f.renameTo(new File("F:\\Oo\\WorldHistory\\"+nametemp[0]+" "+nametemp[1]+".mp4"));
	            }
	        }
           System.out.println("conversion is done");
	        

	}

}

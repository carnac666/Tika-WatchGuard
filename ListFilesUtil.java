package testTika;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListFilesUtil {

    /**
     * List all files from a directory and its subdirectories
     * @param directoryName to be listed
     * @return 
     */
    public ArrayList<String> listFilesAndFilesSubDirectories(String directoryName){
        File directory = new File(directoryName);
        //get all the files from a directory
        File[] fList = directory.listFiles();
        ArrayList<String> al = new ArrayList<String>();
        for (File file : fList){
            if (file.isFile()){
            	//System.out.println(file.getAbsolutePath());
                al.add(file.getAbsolutePath());                
            } else if (file.isDirectory()){
                listFilesAndFilesSubDirectories(file.getAbsolutePath());
                
            }
            
        }
        System.out.println(al);
		return al;
		
    }
    
    public static void main (String[] args){
        ListFilesUtil listFilesUtil = new ListFilesUtil();
        final String directoryLinuxMac ="/media/carles/WD2TB/Postgrau Big Data/txts";
        //Windows directory example
        //final String directoryWindows ="C://test";
        //ArrayList<String> fsc=new ArrayList<String>();
        ArrayList<String> fsc =listFilesUtil.listFilesAndFilesSubDirectories(directoryLinuxMac);
        //System.out.println("Hola" + fsc));
        
        
    }
}
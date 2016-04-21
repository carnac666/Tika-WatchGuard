package testTika;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.File;
import static java.util.stream.Collectors.*;

import java.awt.List;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.stream.Stream;
import java.io.*;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;
import testTika.ListFilesUtil;

//import com.mongodb.MongoClient;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;

public class getDataMetadata {
	
	public static void main(final String[] args) throws IOException, SAXException,
	  org.apache.tika.exception.TikaException {
		  //File file = new File(filepath);
		  ListFilesUtil listFilesUtil = new ListFilesUtil();
	      final String directoryLinuxMac ="/media/carles/WD2TB/Postgrau Big Data/tests";
	      ArrayList<String> fsc =listFilesUtil.listFilesAndFilesSubDirectories(directoryLinuxMac);
	      Iterator<String> itr = fsc.iterator();
	      while (itr.hasNext()) {
	        String filepath = itr.next();
	        Parser parser = new AutoDetectParser();
	        BodyContentHandler handler = new BodyContentHandler();
	        Metadata metadata = new Metadata();
	        ParseContext context = new ParseContext();
		    FileInputStream inputstream = new FileInputStream(filepath);
	        parser.parse(inputstream, handler, metadata, context);
	        System.out.println(handler.toString());
	        }
	        //FALTA COMPROVAR PASSANT-HO A FITXER !!!
	        //PARSEJA EL DARRER ? 
	      }
	/*  public static void streamFileToMongo(InputStream Str ){
		  MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
		  MongoDatabase database = client.getDatabase("test");

//  public static void streamMetaToMongo (InputStream StrM){
	  
	  
	  }*/
}

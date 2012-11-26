package main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class CRValidator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String filepath = "prescibe-mediciene-small-tm.xml";
		
		String CRxml = readFromFile(filepath);
		System.out.println(CRxml);
		
		String DCRxml = convertCRtoDCR(CRxml);
	
		verifyXML(DCRxml);
	}
	
	public static String readFromFile(String filepath) 
	{
		File file = new File(filepath);
		StringBuilder sb = new StringBuilder();
		try {
			Scanner scanner = new Scanner(file);
			while(scanner.hasNext())
				sb.append(scanner.next());
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return sb.toString();
	}
	
	public static String convertCRtoDCR(String xml)
	{
		String reply = "";
		//contact TaskmanagerHelperService 
		
		return reply;
	}
	
	public static String verifyXML(String xml)
	{
		String reply = "";
		//contact VerificationService
		
		return reply;
	}
}

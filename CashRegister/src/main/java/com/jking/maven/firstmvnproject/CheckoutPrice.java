package com.jking.maven.firstmvnproject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class CheckoutPrice {
	static Logger logger = Logger.getLogger(CheckoutPrice.class);
	
	public static void main(String[] args) throws IOException {
		BasicConfigurator.configure();
		System.out.println(CheckoutPrice.class.getResourceAsStream("/test.csv"));
		logger.info("hi");
		//readItems(pathToFile);
	}
	
	private static void readItems(String filename) throws IOException {
		Path pathToFile = Paths.get(filename);
		BufferedReader br = Files.newBufferedReader(pathToFile);
		String line = br.readLine();
		
		while(line != null) {
			String[] fields = line.split(",");
			
			System.out.println(Arrays.toString(fields));
			
			line = br.readLine();
		}
	}
	
	private static void createNameMap(ArrayList person) throws FileNotFoundException {
		HashMap<String, ArrayList<String>> nameMap = new HashMap<String, ArrayList<String>>();				
	}
	
	private static boolean verifyEmail(String email) {
		boolean result = true;
		try {
			InternetAddress emailAddress = new InternetAddress(email);
		}
		catch(AddressException ex) {
			result = false;
		}
		return result;
	}
	
	private static boolean verifyAge(int age) {
		return (age < 1 || age > 150);
	}
	
//	private static boolean hasNameAndDomain(String aEmailAddress){
//		String[] tokens = aEmailAddress.split("@");
//		return tokens.length == 2 
//				&& Util.textHasContent(tokens[0])
//				&& Util.textHasContent(tokens[1]); 
//	}
}

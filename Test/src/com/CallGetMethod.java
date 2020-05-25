package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;

import java.net.URL;

public class CallGetMethod {
	
	
	public static String[] getListOfMovie(String str) {
		
		URL url;
		StringBuilder result = new StringBuilder();
		try {
			url = new URL("https://jsonmock.hackerrank.com/api/movies/search/?Title=Spiderman");
			
		 HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		 conn.setRequestMethod("GET");
		 BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
	      String line;
	      while ((line = rd.readLine()) != null) {
	         result.append(line);
	      }
	      rd.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//JSONParser parser = new JSONParser(); 
		//JSONObject json = (JSONObject) parser.parse(result);
		return null;
	} 
	
	public static void main(String[] args) {
		getListOfMovie("");
	}
}

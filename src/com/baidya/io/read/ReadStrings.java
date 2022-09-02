package com.baidya.io.read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadStrings {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter stop to end ..");
		String info;
		do {
			info = br.readLine();
			System.out.println(info);
		}while(!"stop".equals(info));
		
	}
	
}

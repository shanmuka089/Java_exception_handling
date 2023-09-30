package com.tryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
	
	public static void main(String[] args) {
		
		try(BufferedReader reader=new BufferedReader(new InputStreamReader(System.in))){
			String name=reader.readLine();
			System.out.println(name);
			TryWithResource2 resource=new TryWithResource2();
			resource.m1();
			String name2=reader.readLine();
			System.out.println(name2);
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}

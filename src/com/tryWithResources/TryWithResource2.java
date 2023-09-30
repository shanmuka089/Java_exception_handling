package com.tryWithResources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource2 {

	public void m1() {
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		try{
			String line = read.readLine();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

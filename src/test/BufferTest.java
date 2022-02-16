package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferTest {

	public static void main(String[] args) {
		
		try {
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			String s = "aslkdfj";
			bw.write(s);
			bw.write(s);
			bw.write(s);
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

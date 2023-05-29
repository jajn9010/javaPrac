package homeworkClassDiagram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Item {
	public static void main(String[] args) throws IOException {
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter BW = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BW.write("\n======================================================================\n");
		BW.write("|\t     직급번호     \t   |\t          직급명     \t     |");
		BW.write("\n======================================================================\n");
		BW.write("|\t\t 10\t\t   |\t\t   인턴\t\t     |");
		BW.flush();
		
	}
}

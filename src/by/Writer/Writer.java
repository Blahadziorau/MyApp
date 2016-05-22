package by.Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

	public static void main(String[] args) throws IOException {
		File treeJson = new File("tree.txt");
		try {
			BufferedWriter zapis = new BufferedWriter(new FileWriter(treeJson, true));
			Scanner sc = new Scanner(System.in);
			System.out.println("¬веди фамилию:");
			zapis.write(sc.nextLine().toString() + "\n");
			sc.close();
			zapis.flush();
			zapis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

package by;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import by.BAA.People;


public class Stat {

	public static void main(String[] args) throws IOException {
		System.out.println("����� ���������� � ����� ���������!");
		Scanner sc=new Scanner(System.in);
		System.out.println("����� �������:");
		String s=sc.nextLine();
		System.out.println("����� ���:");
		String s1=sc.nextLine();
		System.out.println("����� ��������:");
		String s2=sc.nextLine();
		sc.close();
	    
		//����������� ������(������) ��� ������
		People im=new People(s,s1,s2);
		 System.out.println(im.toString());
		
		 //������� ���� ��� ������
		 File spisok = new File("spisok.json");
			if (spisok.createNewFile()) {
				System.out.println("����� ���� ������");
			} else {
				System.out.println("���� ��� ����������");
			}
			
			//���������� � ���� ������
			PrintWriter out = new PrintWriter(
					"spisok.json");
			out.print(im.toString());
			out.close();
			System.out.println("��������");
			
			//������ ���� � ����������� � ������
			
		Scanner in= new Scanner(spisok);
		String h=in.nextLine();
		System.out.println("������ �� �����: "+h.toString());
		in.close();
	}

}

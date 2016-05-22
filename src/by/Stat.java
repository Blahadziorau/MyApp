package by;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import by.BAA.People;


public class Stat {

	public static void main(String[] args) throws IOException {
		System.out.println("Добро пожаловать в новую программу!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Введи фамилию:");
		String s=sc.nextLine();
		System.out.println("Введи имя:");
		String s1=sc.nextLine();
		System.out.println("Введи отчество:");
		String s2=sc.nextLine();
		sc.close();
	    
		//преобразуем данные(строку) для списка
		People im=new People(s,s1,s2);
		 System.out.println(im.toString());
		
		 //создаем файл для списка
		 File spisok = new File("spisok.json");
			if (spisok.createNewFile()) {
				System.out.println("Новый файл создан");
			} else {
				System.out.println("Файл уже существует");
			}
			
			//записываем в файл данные
			PrintWriter out = new PrintWriter(
					"spisok.json");
			out.print(im.toString());
			out.close();
			System.out.println("Записали");
			
			//читаем файл и преобразуем в строку
			
		Scanner in= new Scanner(spisok);
		String h=in.nextLine();
		System.out.println("Читаем из файла: "+h.toString());
		in.close();
	}

}

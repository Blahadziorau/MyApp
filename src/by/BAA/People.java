package by.BAA;

public class People {

	private String surename;
	private String name;
	private String secondName;

	public People(String s, String s1, String s2) {
		this.surename = s;
		this.name = s1;
		this.secondName = s2;
	}

	public String toString() {
		return "1." + this.getSurename() + " " + this.getName() + " " + this.getSecondName() + " ";
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
}

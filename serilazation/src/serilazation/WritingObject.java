package serilazation;

import java.io.*;

public class WritingObject {
		public static void main(String[] args)throws Exception {
			//marker interface which doesno't have any method i.e.serializable
			Student[] st= {new Student(101,"manish",99), new Student(102,"prachi",98)};
			FileOutputStream fos=new FileOutputStream("student.obj");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(st);
			oos.flush();
			oos.close();
			
			
			
		}
}
class Student implements Serializable{
	private int id;
	private String  name;
	private int marks;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public Student(int id,String name, int marks) {
		super();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	public Student() {
		super();
	}
	public String toString() {
		return "student[id="+id+", name="+name+",marks="+marks+" ]";
	}
}
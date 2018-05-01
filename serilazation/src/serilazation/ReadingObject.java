package serilazation;
import java.io.*;

public class ReadingObject {

	public static void main(String[] args)throws Exception {
		FileInputStream fis=new FileInputStream("Student.obj");
		@SuppressWarnings("resource")
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student[] st=(Student[])ois.readObject();
		for(Student s:st) {
			System.out.println(s);
		}
	}

}

package ch14_Serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// 직렬화 가능한 클래스라고 적어줘야 NotSerializableException 에러가 안남
// Serializable : 구현코드는 없는 그냥 marker interface 
class Person implements Serializable{
	String name;
	String job;
	// transient 직렬화 시 제외 - 복호화 시 default값으로 복호화됨..
	// transient String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", job=" + job + "]";
	}
	
}

/*
 //프로그래머가 직접 객체를 읽고 쓰는 코드를 구현하고 싶을 땐 Externalizable 한 후 override..  
class Person implements Externalizable{
	
	String name;
	String job;
	
	public Person() {}
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString()
	{
		return name + "," + job;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
		//out.writeUTF(job);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		//job = in.readUTF();
	}
	
}
*/


public class SerializationTest {

	public static void main(String[] args) {
		Person lee = new Person("이순신", "대표이사");
		Person kim = new Person("김유신", "상무이사");
		
		// serialization(직렬화, 암호화)
		// write object in file
		try (FileOutputStream fos = new FileOutputStream("serial.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(lee);
			oos.writeObject(kim);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// deserialization(역직렬화, 복호화)
		// read object in file
		try (FileInputStream fis = new FileInputStream("serial.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person pLee = (Person)ois.readObject();
			Person pKim = (Person)ois.readObject();
			
			System.out.println(pLee);
			System.out.println(pKim);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}

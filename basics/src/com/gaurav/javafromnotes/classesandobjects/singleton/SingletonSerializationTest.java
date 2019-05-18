package com.gaurav.javafromnotes.classesandobjects.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonSerialization implements Serializable {
	
	private static final long serialVersionUID = -7787812441140522595L;
	private static SingletonSerialization singletonSerializationInstance = null;
	String string;
	int randomNum;

	private SingletonSerialization() {
		string = "string in classic singleton class";
		randomNum = 10;
	}

	public static SingletonSerialization getInstance() { // only critical code is synchronized
		synchronized (SingletonSerialization.class) {
			if (singletonSerializationInstance == null)
				singletonSerializationInstance = new SingletonSerialization();
		}

		return singletonSerializationInstance;
	}
	
	protected Object readResolve() {
        return singletonSerializationInstance;
    }

	public void displayData() {
		System.out.println(string + " with random number " + randomNum);
	}

	public void setString(String string) {
		this.string = string;
	}

	public void setRandomNum(int randomNum) {
		this.randomNum = randomNum;
	}
}

public class SingletonSerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SingletonSerialization SingletonSerialization1 = SingletonSerialization.getInstance();
		
		//serialize
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("serialized.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(SingletonSerialization1);

			System.out.println("\nSingleton object serialized successfully");

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is caught");
		} catch (IOException e) {
			System.out.println("IO Exception is caught");
			e.printStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
		
		//desrialize

		SingletonSerialization SingletonSerialization2 = null;

		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("serialized.txt");
			ois = new ObjectInputStream(fis);
			SingletonSerialization2 = (SingletonSerialization) ois.readObject();

			System.out.println("SingletonSerialization object deserialized successfully\n");

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is caught");
		} catch (IOException e) {
			System.out.println("IO Exception is caught");
			e.printStackTrace();
		} finally {
			ois.close();
			fis.close();
		}
		
		if(SingletonSerialization1 == SingletonSerialization2)
			System.out.println("Both singleton instances are same");
		else
			System.out.println("Both singleton instances are different");
		
		System.out.println(SingletonSerialization1.hashCode());
		System.out.println(SingletonSerialization2.hashCode());
		
	}

}

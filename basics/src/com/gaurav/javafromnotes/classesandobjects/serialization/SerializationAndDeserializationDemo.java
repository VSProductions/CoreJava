package com.gaurav.javafromnotes.classesandobjects.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationAndDeserializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Employee employee = new Employee("gaurav", 1, "DFS");
		
		System.out.println("Employee object before serialization.");
		System.out.println("Employee name : " + employee.getName() + "\nEmployee Id : " + employee.getId() + "\nEmployee department : " + employee.getDepartment());
		
		serializeObject(employee);
		employee.setDepartment("GP");
		deSerializeObject();

	}

	private static void serializeObject(Employee employee) throws IOException {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("serialized.txt");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(employee);

			System.out.println("\nEmployee object serialized successfully");

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is caught");
		} catch (IOException e) {
			System.out.println("IO Exception is caught");
			e.printStackTrace();
		} finally {
			oos.close();
			fos.close();
		}
	}
	
	private static void deSerializeObject() throws ClassNotFoundException, IOException {
		 Employee emp = null;
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("serialized.txt");
			ois = new ObjectInputStream(fis);
			emp = (Employee) ois.readObject();

			System.out.println("Employee object deserialized successfully\n");
			
			System.out.println("Employee object after serialization.");
			System.out.println("Employee name : " + emp.getName() + "\nEmployee Id : " + emp.getId() + "\nEmployee department : " + emp.getDepartment());

		} catch (FileNotFoundException e) {
			System.out.println("File not found exception is caught");
		} catch (IOException e) {
			System.out.println("IO Exception is caught");
			e.printStackTrace();
		} finally {
			ois.close();
			fis.close();
		}
	}

}

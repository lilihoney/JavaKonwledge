package com.qll.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream.PutField;

public class SerializableTest {
	private String password = "pass";
	public static void main(String[] args){
		User user = new User("FengZi", 20, false,"i am a person");
		System.out.println(user);
		
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("serializableFile"));
			oos.writeObject(user);
			User.type = "change type";
			user.setName("SHAZI");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			IOUtils.closeQuietly(oos);
		}
		
		File file = new java.io.File("serializableFile");
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			User newUser = (User)ois.readObject();
			System.out.println(newUser);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
//			IOUtils.closeQuietly(ois);
//			FileUtils.forceDelete(file);
		}
		
		try {
			ObjectOutputStream oos2 = new ObjectOutputStream(new FileOutputStream("passFile"));
			oos2.writeObject(new User("JIAMI", 30, true, "i have password"));
			oos2.close();
			ObjectInputStream ois2 = new ObjectInputStream(new FileInputStream("passFile"));
			User user2 = (User)ois2.readObject();
			System.out.println(user2);
			ois2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void writeObject(ObjectOutputStream oos){
		try {
			PutField putField = oos.putFields();
			password = "jiami";//模拟加密
			putField.put("password", password);
			oos.writeFields();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	private void readObject(ObjectInputStream osi){
		try {
			GetField readField = osi.readFields();
			Object obj = readField.get("password", "");
			password = "pass";//模拟解密
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

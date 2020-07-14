package test703.exam01;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "¾È³çÇÏ¼¼¿ä";
		byte[] bytes1 = str.getBytes();
		System.out.println("byte1.length: " + bytes1.length);
		String str1 = new String(bytes1);
		System.out.println("byte->String : " +str1);
		
		try {
			byte[] bytes2 = str.getBytes("EUC-KR");
			System.out.println("byte2.length: " + bytes2.length);
			String str2 = new String(bytes2,"EUC-KR");
			System.out.println("byte->String : " +str2);
			
			byte[] bytes3 = str.getBytes("UTF-8");
			System.out.println("byte3.length: " + bytes3.length);
			String str3 = new String(bytes3,"UTF-8");
			System.out.println("byte->String : " + str3);
			
			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}

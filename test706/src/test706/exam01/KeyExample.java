package test706.exam01;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Key, String> hashMap = new HashMap<Key,String>();
		
		hashMap.put(new Key(1), "±Êµø¿Ã");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
		
	}

}

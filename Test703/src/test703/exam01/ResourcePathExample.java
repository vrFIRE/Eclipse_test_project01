package test703.exam01;

public class ResourcePathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class clazz = Car.class;
  		String photo1Path = clazz.getResource("exitButton.png").getPath();
		String photo2Path = clazz.getResource("image/exitButton.png").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	}

}

package test703.exam01;

public class isLikeGlobal {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		MyClass[] mc = new MyClass[10];
		for (int i = 0; i < 10; i++) {
			mc[i] = new MyClass();
			System.out.println("instence ¼ö :  " + mc[0].getObjectNum() + "°³");
		}
	}

}
class MyClass{
	static int object_num = 0;
	public MyClass() {
		object_num++;
	}
	
	public static int getObjectNum() {
		return object_num;
	}
}

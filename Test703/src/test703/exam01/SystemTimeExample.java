package test703.exam01;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long time1 = System.nanoTime();
		long sum = 0;
		for (int i = 0; i < 1000000000L; i++) {
			sum += i;
			
		}
		long time2 = System.nanoTime();
		System.out.println("�հ�  :" +sum);
		System.out.println("�ð���  :" + (time2- time1) + "������ �ɸ�");
		}

}

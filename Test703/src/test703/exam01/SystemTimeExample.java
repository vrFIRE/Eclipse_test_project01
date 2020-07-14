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
		System.out.println("합계  :" +sum);
		System.out.println("시간은  :" + (time2- time1) + "나노초 걸림");
		}

}

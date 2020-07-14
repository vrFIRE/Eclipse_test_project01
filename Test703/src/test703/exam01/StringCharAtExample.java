package test703.exam01;

public class StringCharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ssn = "000000-4000000";
		char sex = ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자 ");
			break;
		case '2':
		case '4':
			System.out.println("여자 ");
			break;
		}
	}

}

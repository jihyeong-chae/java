package sec10.exam01_execption;

public class LoginExample {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "12345");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WorngPasswordException {
		
		if(!id.contentEquals("blue")) {
			throw new NotExistIDException("���̵� �������� �ʽ��ϴ�.");
		}
		
		if(!password.equals("12345")) {
			throws new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
}

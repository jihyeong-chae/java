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
			throw new NotExistIDException("아이디가 존재하지 않습니다.");
		}
		
		if(!password.equals("12345")) {
			throws new WrongPasswordException("패스워드가 틀립니다.");
		}
}

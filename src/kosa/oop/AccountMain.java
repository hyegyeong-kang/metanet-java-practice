package kosa.oop;

public class AccountMain {

	public static void main(String[] args) {
//		Account account = new Account("11-111", "ff", 1000);
//		Account account2 = new Account("11-111", "ff", 1000);
//		
//		account2.withdraw(3000);
//		account2.printAccount();

	CheckingAccount ca = new CheckingAccount("111-11", "kang", 1000, "11011");
	
	try {
		ca.pay("111-11", 500);
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		
	}
	
	ca.printAccount();
	
	}

}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrintTest {

	//see the printed result in the console
	@Test
	void testPrint() throws Exception {
		Account account = new Account();
		account.setMoney(50);
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.deposit(20);
		bankClient.withdraw(30);
		bankClient.print();
	}

}

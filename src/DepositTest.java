import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DepositTest {

	//depositing 20 to account
	@Test
	void testDeposit() throws Exception {
		Account account = new Account();
		account.setMoney(50);
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.deposit(20);
		assertTrue(bankClient.getAccount().getMoney() == 70);
	}

}

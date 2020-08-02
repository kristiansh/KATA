import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WithdrawalTest {

	//withdrawing 20
	@Test
	void testWithdrawal() throws Exception {
		Account account = new Account();
		account.setMoney(50);
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.withdraw(20);
		assertTrue(bankClient.getAccount().getMoney() == 30);
	}
	
	//withdrawing a sum greater than the amount present in the account
	@Test
	void testIllegalWithdrawal() throws Exception {
		Assertions.assertThrows(Exception.class, () -> {
			Account account = new Account();
			account.setMoney(50);
			BankClient bankClient = new BankClient();
			bankClient.setAccount(account);
			bankClient.withdraw(60);	
		});
	}

}

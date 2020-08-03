package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Test;

import model.Account;
import model.BankClient;
import model.InvalidAmountException;

class DepositTest {

	//depositing 20 to account
	@Test
	void testDeposit() throws InvalidAmountException {
		Account account = new Account();
		account.setMoney(new BigDecimal(50));
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.deposit(new BigDecimal(20));
		assertTrue(bankClient.getAccount().getMoney().compareTo(new BigDecimal(70)) == 0);
	}

}

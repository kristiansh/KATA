package tests;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import model.Account;
import model.BankClient;
import model.InvalidAmountException;

class WithdrawalTest {

	//withdrawing 20
	@Test
	void testWithdrawal() throws InvalidAmountException {
		Account account = new Account();
		account.setMoney(new BigDecimal(50));
		BankClient bankClient = new BankClient();
		bankClient.setAccount(account);
		bankClient.withdraw(new BigDecimal(20));
		assertTrue(bankClient.getAccount().getMoney().compareTo(new BigDecimal(30)) == 0);
	}
	
	//withdrawing a sum greater than the amount present in the account
	@Test
	void testIllegalWithdrawal() throws InvalidAmountException {
		Assertions.assertThrows(InvalidAmountException.class, () -> {
			Account account = new Account();
			account.setMoney(new BigDecimal(50));
			BankClient bankClient = new BankClient();
			bankClient.setAccount(account);
			bankClient.withdraw(new BigDecimal(60));	
		});
	}

}

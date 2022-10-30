package banking;

import java.util.LinkedHashMap;

/**
 * Private Variables:<br>
 * {@link #accounts}: List&lt;Long, Account&gt;
 */
public class Bank implements BankInterface {
	private LinkedHashMap<Long, Account> accounts;

	public Bank() {
		accounts = new LinkedHashMap<>();
	}

	private Account getAccount(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber);
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		Account account = new CommercialAccount(company,  null, pin, startingDeposit);
        return (long)startingDeposit;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		Account account = new ConsumerAccount(person,  null, pin, startingDeposit);
        return (long) startingDeposit;
	}
	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
        return true;
	}

	public double getBalance(Long accountNumber) {
		// complete the function
        return accounts.get(accountNumber) != null ? accounts.get(accountNumber).getBalance() : 0;
	}

	public void credit(Long accountNumber, double amount) {
		Account account = new CommercialAccount(null,  accountNumber, 0, amount);
		accounts.put(accountNumber, account);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
        return accounts.containsKey(accountNumber);
	}
}

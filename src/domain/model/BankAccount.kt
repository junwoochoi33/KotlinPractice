package domain.model

class BankAccount(private var balance: Int) {

    fun deposit(amount: Int) {
        if (amount > 0) balance += amount
    }

    fun getBalance(): Int {
        return balance
    }
}
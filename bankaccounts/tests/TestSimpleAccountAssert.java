package fr.cnam.tp8.bankaccounts.tests;

import fr.cnam.tp8.bankaccounts.Person;
import fr.cnam.tp8.bankaccounts.SimpleAccount;

public class TestSimpleAccountAssert {
    public static void main(String args[]) {
        Person p1 = new Person("Jean", "Jean", true);
        SimpleAccount sa1 = new SimpleAccount(p1, 1000);
        assert sa1.getBalance() == 1000;
        sa1.credit(100);
        assert sa1.getBalance() == 1100;
        sa1.withdraw(2000);
        assert sa1.getBalance() == -900;

        SimpleAccount sa2 = new SimpleAccount(p1);
        assert sa2.getBalance() == 0;
        sa2.credit(100);
        assert sa2.getBalance() == 100;
    }
}


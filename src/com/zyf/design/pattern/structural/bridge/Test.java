package com.zyf.design.pattern.structural.bridge;

public class Test {

    public static void main(String[] args) {
        Bank icbc = new ICBCBank(new DepositAccount());
        Account icbcAccount = icbc.openAccount();
        icbcAccount.showAccountType();

        Bank abc = new ABCBank(new SavingAccount());
        Account abcAccount = abc.openAccount();
        abcAccount.showAccountType();
    }
}

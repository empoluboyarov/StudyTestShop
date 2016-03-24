package service;

import interfaces.BankInterface;

/**
 * Created by Evgeniy on 24.03.2016.
 */
public class Bankir extends BaseEmployee{

    private BankInterface bank;

    public BankInterface getBank() {
        return bank;
    }

    public void setBank(BankInterface bank) {
        this.bank = bank;
    }

    public void sendRequest(){

    };
}

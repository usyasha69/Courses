package com.company.hometask.TaskNine.exchange_simulator;

public class HumanThread extends Thread {

    private static final String CURRENCY_SHORTAGE = "Currency shortage!";

    private Transaction transaction;
    private double sum;
    private String operationType;
    private String currency;

    private Accountant accountant;

    public HumanThread(Transaction transaction, Accountant accountant) {
        this.transaction = transaction;
        this.sum = transaction.getSum();
        this.operationType = transaction.getOperationType();
        this.currency = transaction.getCurrency();
        this.accountant = accountant;
    }

    @Override
    public void run() {
        super.run();

        synchronized (HumanThread.class) {

            //operation sale
            if (operationType.equals(ExchangeOffice.BUY_OPERATION_TYPE)) {
                if (currency.equals(ExchangeOffice.DOLLAR_CURRENCY)) {
                    if (ExchangeOffice.hryvniaBalance > (sum * ExchangeOffice.DOLLAR_SALE_COURSE)) {
                        ExchangeOffice.dollarBalance += sum;
                        ExchangeOffice.hryvniaBalance -= (sum * ExchangeOffice.DOLLAR_SALE_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);
                        accountant.calculateNextProfit(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println(CURRENCY_SHORTAGE);
                        ExchangeOffice.lackOfHryvnia = true;
                    }
                }

                if (currency.equals(ExchangeOffice.EURO_CURRENCY)) {
                    if (ExchangeOffice.hryvniaBalance > (sum * ExchangeOffice.EURO_SALE_COURSE)) {
                        ExchangeOffice.euroBalance += sum;
                        ExchangeOffice.hryvniaBalance -= (sum * ExchangeOffice.EURO_SALE_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);
                        accountant.calculateNextProfit(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println(CURRENCY_SHORTAGE);
                        ExchangeOffice.lackOfHryvnia = true;
                    }
                }
            }

            //operation buy
            if (operationType.equals(ExchangeOffice.SALE_OPERATION_TYPE)) {
                if (currency.equals(ExchangeOffice.DOLLAR_CURRENCY)) {
                    if (ExchangeOffice.dollarBalance > sum) {
                        ExchangeOffice.dollarBalance -= sum;
                        ExchangeOffice.hryvniaBalance += (sum * ExchangeOffice.DOLLAR_BUY_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);
                        accountant.calculateNextProfit(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println(CURRENCY_SHORTAGE);
                        ExchangeOffice.lackOfDollar = true;
                    }
                }
                if (currency.equals(ExchangeOffice.EURO_CURRENCY)) {
                    if (ExchangeOffice.euroBalance > sum) {
                        ExchangeOffice.euroBalance -= sum;
                        ExchangeOffice.hryvniaBalance += (sum * ExchangeOffice.EURO_BUY_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);
                        accountant.calculateNextProfit(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println(CURRENCY_SHORTAGE);
                        ExchangeOffice.lackOfEuro = true;
                    }
                }
            }
        }
    }
}

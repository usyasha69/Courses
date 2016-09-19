package com.company.hometask.TaskNine.exchange_simulator;

public class HumanThread extends Thread {

    private Transaction transaction;
    private double sum;
    private String operationType;
    private String currency;

    public HumanThread(Transaction transaction) {
        this.transaction = transaction;
        this.sum = transaction.getSum();
        this.operationType = transaction.getOperationType();
        this.currency = transaction.getCurrency();
    }

    @Override
    public void run() {
        super.run();

        synchronized (HumanThread.class) {

            //operation sale
            if (operationType.equals("Buy")) {
                if (currency.equals("Dollar")) {
                    if (ExchangeOffice.hryvniaBalance > (sum * ExchangeOffice.DOLLAR_SALE_COURSE)) {
                        ExchangeOffice.dollarBalance += sum;
                        ExchangeOffice.hryvniaBalance -= (sum * ExchangeOffice.DOLLAR_SALE_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println("Currency shortage");
                        ExchangeOffice.lackOfHryvnia = true;
                    }
                }

                if (currency.equals("Euro")) {
                    if (ExchangeOffice.hryvniaBalance > (sum * ExchangeOffice.EURO_SALE_COURSE)) {
                        ExchangeOffice.euroBalance += sum;
                        ExchangeOffice.hryvniaBalance -= (sum * ExchangeOffice.EURO_SALE_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println("Currency shortage");
                        ExchangeOffice.lackOfHryvnia = true;
                    }
                }
            }

            //operation buy
            if (operationType.equals("Sale")) {
                if (currency.equals("Dollar")) {
                    if (ExchangeOffice.dollarBalance > sum) {
                        ExchangeOffice.dollarBalance -= sum;
                        ExchangeOffice.hryvniaBalance += (sum * ExchangeOffice.DOLLAR_BUY_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println("Currency shortage");
                        ExchangeOffice.lackOfDollar = true;
                    }
                }
                if (currency.equals("Euro")) {
                    if (ExchangeOffice.euroBalance > sum) {
                        ExchangeOffice.euroBalance -= sum;
                        ExchangeOffice.hryvniaBalance += (sum * ExchangeOffice.EURO_BUY_COURSE);

                        //add transaction to total list
                        Accountant.transactions.add(transaction);

                        System.out.println("\n" + transaction.toString());
                    } else {
                        System.out.println("Currency shortage");
                        ExchangeOffice.lackOfEuro = true;
                    }
                }
            }
        }
    }
}

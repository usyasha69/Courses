package com.company.hometask.TaskNine.exchange_simulator;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Accountant {
    /**
     * Currency profits for exchange office.
     */
    public static double totalDollarProfit;
    public static double totalEuroProfit;
    public static double totalHryvniaProfit;

    public static double nextDollarProfit;
    public static double nextEuroProfit;
    public static double nextHryvniaProfit;

    /**
     * List with all transaction in exchange office.
     */
    public static ArrayList<Transaction> transactions = new ArrayList<>();

    /**
     * This method calculate profit for exchange office by one transaction.
     *
     * @param sum           - sum of transaction
     * @param operationType - operation type of transaction
     * @param currency      - currency of transaction
     * @return - profit of transaction
     */
    public double calculateTransactionProfit(double sum, String operationType
            , String currency) {
        //result
        double result = 0.0;

        //buy currency by exchange office
        if (operationType.equals(ExchangeOffice.BUY_OPERATION_TYPE)) {
            if (currency.equals(ExchangeOffice.DOLLAR_CURRENCY)) {
                result += (sum * (ExchangeOffice.DOLLAR_SALE_COURSE - ExchangeOffice.DOLLAR_BUY_COURSE))
                        / ExchangeOffice.DOLLAR_BUY_COURSE;
            }

            if (currency.equals(ExchangeOffice.EURO_CURRENCY)) {
                result += (sum * (ExchangeOffice.EURO_SALE_COURSE - ExchangeOffice.EURO_BUY_COURSE))
                        / ExchangeOffice.DOLLAR_BUY_COURSE;
            }
        }

        //sale currency by exchange office
        if (operationType.equals(ExchangeOffice.SALE_OPERATION_TYPE)) {
            if (currency.equals(ExchangeOffice.DOLLAR_CURRENCY)) {
                result += (sum * (ExchangeOffice.DOLLAR_SALE_COURSE - ExchangeOffice.DOLLAR_BUY_COURSE));
            }

            if (currency.equals(ExchangeOffice.EURO_CURRENCY)) {
                result += (sum * (ExchangeOffice.EURO_SALE_COURSE - ExchangeOffice.EURO_BUY_COURSE));
            }

        }
        return result;
    }

    /**
     * This method add profit off one transaction to total profit.
     *
     * @param transaction - transaction
     */
    public void calculateNextProfit(Transaction transaction) {
        //calculate next dollar profit
        if (transaction.getDollarProfit() != 0.0) {
            nextDollarProfit += transaction.getDollarProfit();
        }

        //calculate next euro profit
        if (transaction.getEuroProfit() != 0.0) {
            nextEuroProfit += transaction.getEuroProfit();
        }

        //calculate next hryvnia profit
        if (transaction.getHryvniaProfit() != 0.0) {
            nextHryvniaProfit += transaction.getHryvniaProfit();
        }
    }

    /**
     * This method print profit by one cycle and update total profit.
     */
    public void calculateAndPrintCycleProfit(int i) {
        DecimalFormat df = new DecimalFormat("#0.0");
        //print profit by 1 cycle
        System.out.println("\n" + (i + 1) + " Cycle USD profit: " + df.format(nextDollarProfit - totalDollarProfit)
                + " Cycle EUR profit: " + df.format(nextEuroProfit - totalEuroProfit)
                + " Cycle UAH profit: " + df.format(nextHryvniaProfit - totalHryvniaProfit));

        //update total profit
        totalDollarProfit = nextDollarProfit;
        totalEuroProfit = nextEuroProfit;
        totalHryvniaProfit = nextHryvniaProfit;
    }

    /**
     * This method print total profit of exchange office by all time.
     */
    public void printTotalProfit() {
        DecimalFormat df = new DecimalFormat("#0.0");
        System.out.println("\nTotal USD profit: " + df.format(totalDollarProfit) + "\nTotal EUR profit: "
                + df.format(totalEuroProfit) + "\nTotal UAH profit: " + df.format(totalHryvniaProfit));
    }

    /**
     * This method print all transaction in exchange office and print
     * transaction with max profit for exchange office.
     */
    public void printTransaction() {
        System.out.println("\nAll transaction: \n");
        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }

        System.out.println("\nTransaction with max USD profit: "
                + foundMaxTrade(ExchangeOffice.DOLLAR_CURRENCY).toString() + "\nTransaction with max EUR profit: "
                + foundMaxTrade(ExchangeOffice.EURO_CURRENCY).toString() + "\nTransaction with max UAH profit: "
                + foundMaxTrade(ExchangeOffice.HRYVNIA_CURRENCY).toString());
    }

    /**
     * This method found transaction with max profit.
     *
     * @return - transaction with max profit
     */
    private Transaction foundMaxTrade(String currency) {
        //result
        Transaction maxTransaction = transactions.get(0);

        if (currency.equals(ExchangeOffice.DOLLAR_CURRENCY)) {
            for (int i = 0; i < transactions.size() - 1; i++) {
                if (transactions.get(i).getDollarProfit() > transactions.get(i + 1).getDollarProfit()) {
                    maxTransaction = transactions.get(i);
                }
            }
        }

        if (currency.equals(ExchangeOffice.EURO_CURRENCY)) {
            for (int i = 0; i < transactions.size() - 1; i++) {
                if (transactions.get(i).getEuroProfit() > transactions.get(i + 1).getEuroProfit()) {
                    maxTransaction = transactions.get(i);
                }
            }
        }

        if (currency.equals(ExchangeOffice.HRYVNIA_CURRENCY)) {
            for (int i = 0; i < transactions.size() - 1; i++) {
                if (transactions.get(i).getHryvniaProfit() > transactions.get(i + 1).getHryvniaProfit()) {
                    maxTransaction = transactions.get(i);
                }
            }
        }


        return maxTransaction;
    }

    /**
     * This method print star balance of exchange office.
     */
    public void printStartBalance() {
        DecimalFormat df = new DecimalFormat("#0.0");

        System.out.println("\nStart balance: " + "\nUSD: " + df.format(ExchangeOffice.dollarBalance)
                + "\nEUR: " + df.format(ExchangeOffice.euroBalance) + "\nUAH: "
                + df.format(ExchangeOffice.hryvniaBalance));
    }
    /**
     * This method print final balance of exchange office.
     */
    public void printFinalBalance() {
        DecimalFormat df = new DecimalFormat("#0.0");

        System.out.println("\nFinal balance: " + "\nUSD: " + df.format(ExchangeOffice.dollarBalance)
                + "\nEUR: " + df.format(ExchangeOffice.euroBalance) + "\nUAH: "
                + df.format(ExchangeOffice.hryvniaBalance));
    }
}

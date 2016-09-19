package com.company.hometask.TaskNine.exchange_simulator;

import java.text.DecimalFormat;

public class Transaction {
    private String personName;
    private double sum;
    private String operationType;
    private String currency;
    private double dollarProfit;
    private double euroProfit;
    private double hryvniaProfit;

    public Transaction(String personName, double sum, String operationType
            , String currency, double dollarProfit, double euroProfit, double hryvniaProfit) {
        this.personName = personName;
        this.sum = sum;
        this.operationType = operationType;
        this.currency = currency;
        this.dollarProfit = dollarProfit;
        this.euroProfit = euroProfit;
        this.hryvniaProfit = hryvniaProfit;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDollarProfit() {
        return dollarProfit;
    }

    public void setDollarProfit(double dollarProfit) {
        this.dollarProfit = dollarProfit;
    }

    public double getEuroProfit() {
        return euroProfit;
    }

    public void setEuroProfit(double euroProfit) {
        this.euroProfit = euroProfit;
    }

    public double getHryvniaProfit() {
        return hryvniaProfit;
    }

    public void setHryvniaProfit(double hryvniaProfit) {
        this.hryvniaProfit = hryvniaProfit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transaction that = (Transaction) o;

        if (Double.compare(that.sum, sum) != 0) return false;
        if (Double.compare(that.dollarProfit, dollarProfit) != 0) return false;
        if (Double.compare(that.euroProfit, euroProfit) != 0) return false;
        if (Double.compare(that.hryvniaProfit, hryvniaProfit) != 0) return false;
        if (!personName.equals(that.personName)) return false;
        if (!operationType.equals(that.operationType)) return false;
        return currency.equals(that.currency);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = personName.hashCode();
        temp = Double.doubleToLongBits(sum);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + operationType.hashCode();
        result = 31 * result + currency.hashCode();
        temp = Double.doubleToLongBits(dollarProfit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(euroProfit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(hryvniaProfit);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#0.0");
        return "Transaction{" +
                "personName='" + personName + '\'' +
                " sum=" + df.format(sum) +
                " operationType='" + operationType + '\'' +
                " currency='" + currency + '\'' +
                " dollarProfit=" + df.format(dollarProfit) +
                " euroProfit=" + df.format(euroProfit) +
                " hryvniaProfit=" + df.format(hryvniaProfit) +
                '}';
    }
}

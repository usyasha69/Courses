package com.company.hometask.TaskNine.exchange_simulator;

public class ExchangeOffice {
    /**
     * Current curse of currency.
     */
    public static final double DOLLAR_BUY_COURSE = 25.61;
    public static final double DOLLAR_SALE_COURSE = 26.14;
    public static final double EURO_BUY_COURSE = 28.54;
    public static final double EURO_SALE_COURSE = 29.46;

    /**
     * Balance of currency in exchange office.
     */
    public static double dollarBalance;
    public static double euroBalance;
    public static double hryvniaBalance;

    /**
     * Presence of currency in exchange office.
     */
    public static boolean lackOfDollar;
    public static boolean lackOfEuro;
    public static boolean lackOfHryvnia;

    /**
     * This method filling exchange office starting balance.
     */
    private static void fillingBalance() {
        //set start currency balance
        dollarBalance = 10000;
        euroBalance = 10000;
        hryvniaBalance = 250000;

        lackOfDollar = false;
        lackOfEuro = false;
        lackOfEuro = false;
    }

    public static void main(String[] args) {
        fillingBalance();

        //print curse of currency
        System.out.println("Curse of currency: \nUSD: buy - " + DOLLAR_BUY_COURSE
                + "; sale - " + DOLLAR_SALE_COURSE + "\nEUR: buy - " + EURO_BUY_COURSE
                + "; sale - " + EURO_SALE_COURSE);

        //print start balance
        Accountant.printStartBalance();

        //count of simulation
        final int SIMULATION_COUNT = 5;

        //start simulation
        for (int i = 0; i < SIMULATION_COUNT; i++) {
            //create random array
            byte[] randomArray = generateRandomArray();

            for (int j = 0; j < randomArray.length; j++) {
                HumanThread humanThread = null;
                if (randomArray[j] == 1) {
                    //values for transaction
                    double sum = generateRandomSum();
                    String operationType = generateRandomOperationType();
                    String currency = generateRandomCurrency();

                    String personName = generateRandomPersonName();

                    double dollarProfit = 0;
                    double euroProfit = 0;
                    double hryvniaProfit = 0;

                    //calculate profit for one transaction
                    if (currency.equals("Dollar")) {
                        if (operationType.equals("Buy")) {
                            dollarProfit = Accountant.calculateTransactionProfit(sum, operationType, currency);
                        }
                        if (operationType.equals("Sale")) {
                            hryvniaProfit = Accountant.calculateTransactionProfit(sum, operationType, currency);
                        }
                    }
                    if (currency.equals("Euro")) {
                        if (operationType.equals("Buy")) {
                            euroProfit = Accountant.calculateTransactionProfit(sum, operationType, currency);
                        }
                        if (operationType.equals("Sale")) {
                            hryvniaProfit = Accountant.calculateTransactionProfit(sum, operationType, currency);
                        }
                    }

                    Transaction transaction = new Transaction(personName, sum, operationType
                            , currency, dollarProfit, euroProfit, hryvniaProfit);

                    humanThread = new HumanThread(transaction);
                    humanThread.setName(personName);
                    humanThread.start();
                }
                if (j == 4) {
                    try {
                        if (humanThread != null && humanThread.isAlive()) {
                            humanThread.join();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //calculate profit by one cycle
                    Accountant.calculateAndPrintCycleProfit(i);
                }
            }
        }

        //print total profit
        Accountant.printTotalProfit();
        //print all transaction and transaction with max profit
        Accountant.printTransaction();
        //print final balance
        Accountant.printFinalBalance();
    }

    /**
     * This method generate random array for select clients.
     *
     * @return - random array byte[]
     */
    private static byte[] generateRandomArray() {
        //max number of client
        final int CLIENT_NUMBER = 10;

        byte[] randomArray = new byte[CLIENT_NUMBER];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (byte) (Math.random() * 2);
        }

        return randomArray;
    }

    /**
     * This method generate random sum of transaction.
     *
     * @return - random sum of transaction
     */
    private static double generateRandomSum() {
        return (int) (Math.random() * 5000);
    }

    /**
     * This method generate random operation type of transaction.
     *
     * @return - random operation type of transaction
     */
    private static String generateRandomOperationType() {
        //result
        String result = "";
        //max number of operation
        final int OPERATION_NUMBER = 2;

        byte[] randomArray = new byte[OPERATION_NUMBER];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (byte) (Math.random() * 2);
        }

        //generate result
        for (byte b : randomArray) {
            if (b == 0) {
                result = "Buy";
            } else {
                result = "Sale";
            }
        }

        return result;
    }

    /**
     * This method generate random currency of transaction.
     *
     * @return - random currency of transaction
     */
    private static String generateRandomCurrency() {
        //result
        String result = "";
        //max number of currency
        final int CURRENCY_NUMBER = 2;

        byte[] randomArray = new byte[CURRENCY_NUMBER];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (byte) (Math.random() * 2);
        }

        //generate result
        for (byte b : randomArray) {
            if (b == 0) {
                result = "Dollar";
            } else {
                result = "Euro";
            }
        }

        return result;
    }

    /**
     * This method generate random person name of transaction.
     *
     * @return - random person name of transaction
     */
    private static String generateRandomPersonName() {
        //result
        String result = "";
        //max number of name
        final int NAME_NUMBER = 8;

        byte[] randomArray = new byte[NAME_NUMBER];

        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (byte) (Math.random() * 9);
        }

        //generate result
        for (byte b : randomArray) {
            switch (b) {
                case 0:
                    result = "Vasya";
                    break;
                case 1:
                    result = "Sanya";
                    break;
                case 2:
                    result = "Petya";
                    break;
                case 3:
                    result = "Vadya";
                    break;
                case 4:
                    result = "Dima";
                    break;
                case 5:
                    result = "Anna";
                    break;
                case 6:
                    result = "Sveta";
                    break;
                case 7:
                    result = "Olya";
                    break;
                case 8:
                    result = "Valya";
                    break;
            }
        }

        return result;
    }
}

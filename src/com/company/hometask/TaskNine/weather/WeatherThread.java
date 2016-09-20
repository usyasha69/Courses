package com.company.hometask.TaskNine.weather;

public class WeatherThread extends Thread {

    private String language;

    public WeatherThread(String language) {
        this.language = language;
    }

    @Override
    public void run() {
        super.run();

        final int NUMBER_UPDATES = 20;

        for (int i = 0; i < NUMBER_UPDATES; i++) {
            if (language.equals("English")) {

                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(language + " weather thread: \n" + WeatherMain.weather.toString());
            }

            if (language.equals("Russian")) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(language + " weather thread: \n" + WeatherMain.weather.toString());
            }

            if (language.equals("Germany")) {
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(language + " weather thread: \n" + WeatherMain.weather.toString());
            }
        }
    }
}

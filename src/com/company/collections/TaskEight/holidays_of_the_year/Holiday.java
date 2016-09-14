package com.company.collections.TaskEight.holidays_of_the_year;

public class Holiday {
    private String name;
    private boolean dayOff;

    public Holiday(String name, boolean dayOff) {
        this.name = name;
        this.dayOff = dayOff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDayOff() {
        return dayOff;
    }

    public void setDayOff(boolean dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "name='" + name + '\'' +
                ", dayOff=" + dayOff +
                '}';
    }
}

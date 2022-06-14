package com.var.attendanceappmvpexample;

public class Model implements Contract.Model {
    String name;
    String date;
    String hour;
    String attend;

    public Model(String name, String date, String hour, String attend) {
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.attend = attend;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getAttend() {
        return attend;
    }

    public void setAttend(String attend) {
        this.attend = attend;
    }

    @Override
    public int checkAttendValidity(String name, String date, String hour, String attend) {
        int res;
        if (name.isEmpty() || date.isEmpty() || hour.isEmpty() || attend.isEmpty()) {
            res = 0;
        } else {
            res = 1;
        }
        return res;
    }


}

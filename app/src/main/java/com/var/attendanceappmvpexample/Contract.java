package com.var.attendanceappmvpexample;

public interface Contract {
    interface View {
        void onClearText();

        void onLoginResult(Boolean result);
    }

    interface Model {
        int checkAttendValidity(String name, String date, String hour, String attend);

    }

    interface Presenter {
        void initUser();

        void onButtonClick(String name, String date, String hour, String attend);

        void onDestroy();
    }
}
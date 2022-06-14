package com.var.attendanceappmvpexample;

public class Presenter implements Contract.Presenter {

    private Contract.View view1;
    private Contract.Model model1;

    public Presenter(Contract.View view1) {
        this.view1 = view1;
        initUser();
    }

    @Override
    public void initUser() {
        model1 = new Model("", "", "", "");
    }

    @Override
    public void onButtonClick(String name, String date, String hour, String attend) {
        if (view1 != null) {
            view1.onClearText();
            Boolean isLoginSuccess = true;
            final int code = model1.checkAttendValidity(name, date, hour, attend);
            if (code == 0)
                isLoginSuccess = false;


            final Boolean result = isLoginSuccess;
            view1.onLoginResult(result);

        }
    }

    @Override
    public void onDestroy() {
        view1 = null;
    }


}

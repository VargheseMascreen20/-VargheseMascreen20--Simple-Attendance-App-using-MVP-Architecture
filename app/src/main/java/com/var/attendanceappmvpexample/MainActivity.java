package com.var.attendanceappmvpexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Contract.View {
    EditText t1, t2, t3, t4;
    Button b1;
    Presenter presenterX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = findViewById(R.id.uname1);
        t2 = findViewById(R.id.date);
        t3 = findViewById(R.id.hour);
        t4 = findViewById(R.id.attend);
        b1 = findViewById(R.id.log);

        presenterX = new Presenter(this);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenterX.onButtonClick(t1.getText().toString(), t2.getText().toString(), t3.getText().toString(), t4.getText().toString());
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenterX.onDestroy();
    }

    @Override
    public void onClearText() {
        t1.setText("");
        t2.setText("");
        t3.setText("");
        t4.setText("");
    }

    @Override
    public void onLoginResult(Boolean result) {
        if (result) {
            Toast.makeText(this, "Attendance Marked.", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this, "Check Fields and Try Again.", Toast.LENGTH_SHORT).show();
    }

}
package ru.startandroid.develop.p0102_activitylistener;

import android.app.Activity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener {


    //TextView tvOut;
    //Button btnOk;
    //Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //tvOut = (TextView) findViewById(R.id.tvOut);
        //btnOk = (Button) findViewById(R.id.btnOk);
        //btnCancel = (Button) findViewById(R.id.btnCancel);
        //btnOk.setOnClickListener(this);
        //btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        //switch (v.getId()) {
        //    case R.id.btnOk:
        //        // кнопка ОК
        //        tvOut.setText("Нажата кнопка ОК");
        //        break;
        //    case R.id.btnCancel:
        //        // кнопка Cancel
        //        tvOut.setText("Нажата кнопка Cancel");
        //        break;
//
        //}
    }
    //public void onClickStart(View v) {
    //    tvOut.setText("Нажата кнопка ОК");
//
//
    //}
}
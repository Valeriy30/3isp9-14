package com.example.nolik;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    AppCompatButton btn1;
    AppCompatButton btn2;
    AppCompatButton btn3;
    AppCompatButton btn4;
    AppCompatButton btn5;
    AppCompatButton btn6;
    AppCompatButton btn7;
    AppCompatButton btn8;
    AppCompatButton btn9;
    AppCompatButton btnStart;
    public int count=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView) findViewById(R.id.textView);
        btn1=(AppCompatButton) findViewById(R.id.btn1);
        btn2=(AppCompatButton) findViewById(R.id.btn2);
        btn3=(AppCompatButton) findViewById(R.id.btn3);
        btn4=(AppCompatButton) findViewById(R.id.btn4);
        btn5=(AppCompatButton) findViewById(R.id.btn5);
        btn6=(AppCompatButton) findViewById(R.id.btn6);
        btn7=(AppCompatButton) findViewById(R.id.btn7);
        btn8=(AppCompatButton) findViewById(R.id.btn8);
        btn9=(AppCompatButton) findViewById(R.id.btn9);
        btnStart=(AppCompatButton) findViewById(R.id.btnStart);

        View.OnClickListener oclBtn = new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // TODO Auto-generated method stub


                {


                    switch (v.getId()) {

                        case R.id.btn1:
                            if (count > 0&&btn1.getText().equals(" "))
                            {
                                if( count % 2 == 0)
                                {
                                    btn1.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn1.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn2:
                            if (count > 0&&btn2.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn2.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn2.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn3:
                            if (count > 0&&btn3.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn3.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn3.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn4:
                            if (count > 0&&btn4.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn4.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn4.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn5:
                            if (count > 0&&btn5.getText().equals("  "))
                            {
                                if( count % 2 == 0)
                                {
                                    btn5.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn5.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn6:
                            if (count > 0&&btn6.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn6.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn6.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn7:
                            if (count > 0&&btn7.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn7.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn7.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn8:
                            if (count > 0 &&btn8.getText().equals(""))
                            {
                                if( count % 2 == 0)
                                {
                                    btn8.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn8.setText("X");
                                    count++;
                                }
                            }
                            break;
                        case R.id.btn9:
                            if (count > 0&&btn9.getText().equals(" "))
                            {

                                if( count % 2 == 0)
                                {
                                    btn9.setText("O");
                                    count++;
                                }
                                else
                                {
                                    btn9.setText("X");
                                    count++;
                                }
                            }

                            break;
                        case R.id.btnStart:
                            if (count == 0) {
                                count++;
                                btn1.setText(" ");
                                btn2.setText("");
                                btn3.setText("");
                                btn4.setText("");
                                btn5.setText("  ");
                                btn6.setText("");
                                btn7.setText("");
                                btn8.setText("");
                                btn9.setText(" ");
                                textView.setText("Результат");
                            }
                            break;

                    }
                    if (btn1.getText()==btn2.getText()&&btn2.getText()==btn3.getText()||btn1.getText()==btn4.getText()&&btn4.getText()==btn7.getText()||btn1.getText()==btn5.getText()&&btn5.getText()==btn9.getText()||btn4.getText()==btn5.getText()&&btn5.getText()==btn6.getText()||btn7.getText()==btn8.getText()&&btn8.getText()==btn9.getText()||btn2.getText()==btn5.getText()&&btn5.getText()==btn8.getText()||btn3.getText()==btn6.getText()&&btn6.getText()==btn9.getText()||btn3.getText()==btn5.getText()&&btn5.getText()==btn7.getText())
                    {
                        if( count % 2 == 0)
                        {
                            textView.setText("Победа X");
                            count=0;
                        }
                        else
                        {
                            textView.setText("Победа O");
                            count=0;
                        }

                    }
                    if (count==10)
                    {
                        count=0;
                        textView.setText("Ничья");
                    }
                }
            }

        };
        btn1.setOnClickListener(oclBtn);
        btn2.setOnClickListener(oclBtn);
        btn3.setOnClickListener(oclBtn);
        btn4.setOnClickListener(oclBtn);
        btn5.setOnClickListener(oclBtn);
        btn6.setOnClickListener(oclBtn);
        btn7.setOnClickListener(oclBtn);
        btn8.setOnClickListener(oclBtn);
        btn9.setOnClickListener(oclBtn);
        btnStart.setOnClickListener(oclBtn);
    };
}
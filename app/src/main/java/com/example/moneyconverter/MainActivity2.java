package com.example.moneyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    TextView tv, tv1;
    EditText et, et1, et2;
    Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv = (TextView) findViewById(R.id.texts);
        tv1 = (TextView) findViewById(R.id.textView2);
        et = (EditText) findViewById(R.id.editTextNumber);
        et1 = (EditText) findViewById(R.id.editTextTextPersonName);
        et2 = (EditText) findViewById(R.id.PersonName);
        bt = (Button) findViewById(R.id.button2);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int n = Integer.parseInt(et.getText().toString());
                String value = et1.getText().toString();
                if (value.equals("USD") || value.equals("usd")) {
                    n /= Currency.usd;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("EUR") || value.equals("eur")) {
                    n /= Currency.eur;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("CHF") || value.equals("chf")) {
                    n /= Currency.chf;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("GBP") || value.equals("gbp")) {
                    n /= Currency.gbp;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("JPY") || value.equals("jpy")) {
                    n /= Currency.jpy;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат: " + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("CNY") || value.equals("cny")) {
                    n /= Currency.cny;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
                else if (value.equals("AED") || value.equals("aed")) {
                    n /= Currency.aed;
                    Toast toast = Toast.makeText(getApplicationContext(), "Результат:" + n,
                            Toast.LENGTH_LONG);
                    toast.show();
                    et2.setText(n+"");
                }
            }
        });


    }

}

package com.devangpachory.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checkBox;
    CheckBox checkBox2;
    Button button;
    Button button2;
    TextView textView;
    Button button3;
    String price;

    int toppingprice=0,i=0;;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        button =(Button) findViewById(R.id.button);
        button2 =(Button) findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        textView = (TextView) findViewById(R.id.textView13);

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    toppingprice++;
                }
                else{
                    toppingprice --;
                }
            }
        });
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkBox2.isChecked()) {
                    toppingprice++;

                } else {
                    toppingprice--;
                }
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    i++;

                textView.setText(String.valueOf(i));
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i > 0) {
                    i--;
                    textView.setText(String.valueOf(i));
                } else {
                    i = 0;
                    textView.setText(String.valueOf(i));
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                price=String.valueOf((i*10)+(i*(toppingprice*5)));

                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("bill", price);

                startActivity(intent);


                i=0;
                toppingprice=0;
                textView.setText(String.valueOf(i));
                checkBox.setChecked(false);
                checkBox2.setChecked(false);

            }
        });

    }
}

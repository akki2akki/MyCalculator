package com.aasdevlopers.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



        Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnadd,btnsub,btnmul,btndot,btndiv,btneql;
        TextView resultTextView;
        double var1,var2;
        boolean add,mul,sub,div;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultTextView = (TextView)findViewById(R.id.resultTextView);

        btn0 = (Button)findViewById(R.id.btn0);

        btn1 = (Button)findViewById(R.id.btn1);

        btn2 = (Button)findViewById(R.id.btn2);

        btn3 = (Button)findViewById(R.id.btn3);

        btn4 = (Button)findViewById(R.id.btn4);

        btn5 = (Button)findViewById(R.id.btn5);

        btn6 = (Button)findViewById(R.id.btn6);

        btn7 = (Button)findViewById(R.id.btn7);

        btn8 = (Button)findViewById(R.id.btn8);

        btn9 = (Button)findViewById(R.id.btn9);

        btnadd = (Button)findViewById(R.id.btnadd);

        btnsub = (Button)findViewById(R.id.btnsub);

        btnmul = (Button)findViewById(R.id.btnmul);

        btndiv = (Button)findViewById(R.id.btndiv);

        btndot = (Button)findViewById(R.id.btndot);

        btneql = (Button)findViewById(R.id.btneql);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"1");

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"9");

            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+"0");

            }
        });

        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultTextView.setText(resultTextView.getText()+".");

            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(resultTextView.getText()+"");
                add=true;
                resultTextView.setText(null);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(resultTextView.getText()+"");
                sub=true;
                resultTextView.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(resultTextView.getText()+"");
                mul=true;
                resultTextView.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1=Double.parseDouble(resultTextView.getText()+"");
                div=true;
                resultTextView.setText(null);
            }
        });

        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(resultTextView.getText()+"");
                if (add==true){
                    resultTextView.setText(var1+var2+"");
                    add=false;
                }

                if (sub==true){
                    resultTextView.setText(var1-var2+"");
                    sub=false;
                }
                if (mul==true){
                    resultTextView.setText(var1*var2+"");
                    mul=false;
                }
                if (div==true){
                    resultTextView.setText(var1/var2+"");
                    div=false;
                }
            }
        });
    }
}

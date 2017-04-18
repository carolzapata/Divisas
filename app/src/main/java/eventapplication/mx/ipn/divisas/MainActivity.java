package eventapplication.mx.ipn.divisas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 ,
            button7 , button8 , button9 , buttonde, buttone , buttondc,
            buttonle, buttonpa , button10 , buttonC , buttonEqual ;

    EditText edt1 ;

    float mValue, moneda;

    boolean de, eu , le , dc, pa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        buttonde = (Button) findViewById(R.id.buttonde);
        buttone = (Button) findViewById(R.id.buttone);
        buttonle = (Button) findViewById(R.id.buttonle);
        buttondc = (Button) findViewById(R.id.buttondc);
        buttonpa = (Button) findViewById(R.id.buttonpa);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonEqual = (Button) findViewById(R.id.buttoneql);
        edt1 = (EditText) findViewById(R.id.edt1);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });

        buttonde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue = Float.parseFloat(edt1.getText() + "");
                moneda = Float.parseFloat(0.0541 + "");
                de = true;
                edt1.setText("0.0541");
            }
        });

        buttondc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue = Float.parseFloat(edt1.getText() + "");
                moneda = Float.parseFloat(0.0719 + "");
                eu = true ;
                edt1.setText("0.0719");
            }
        });

        buttonle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue = Float.parseFloat(edt1.getText() + "");
                moneda = Float.parseFloat(0.0431 + "");
                le = true ;
                edt1.setText("0.0431");
            }
        });

        buttone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue = Float.parseFloat(edt1.getText()+"");
                moneda = Float.parseFloat(0.0509 + "");
                dc = true ;
                edt1.setText("0.0509");
            }
        });

        buttonpa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValue = Float.parseFloat(edt1.getText()+"");
                moneda = Float.parseFloat(0.8188 + "");
                pa = true ;
                edt1.setText("0.8188");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (de == true){

                    edt1.setText(mValue * moneda +"");
                    de =false;
                }


                if (eu == true){
                    edt1.setText(mValue * moneda +"");
                    eu =false;
                }

                if (le == true){
                    edt1.setText(mValue * moneda +"");
                    le =false;
                }

                if (dc == true){
                    edt1.setText(mValue * moneda +"");
                    dc =false;
                }

                if (pa == true){
                    edt1.setText(mValue * moneda +"");
                    pa =false;
                }
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
    }



}


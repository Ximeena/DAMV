package test.sensor.mario.mixtega.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button0, sumar,
    restar, dividir, multiplicar, buttonP, buttonC, igual = null;
    EditText editText1, operacion = null;
    double numero1, numero2, resultado;
    String op;

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
        sumar = (Button) findViewById(R.id.sumar);
        buttonP = (Button) findViewById(R.id.buttonP);
        buttonC = (Button) findViewById(R.id.buttonC);
        restar = (Button) findViewById(R.id.restar);
        multiplicar = (Button) findViewById(R.id.multiplicar);
        dividir = (Button) findViewById(R.id.dividir);
        igual = (Button) findViewById(R.id.igual);
        editText1 = (EditText) findViewById(R.id.editText1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + "9");
            }
        });

        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                editText1.setText(operacion.getText().toString() + ".");
            }
        });

        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = "+";
                operacion = (EditText) findViewById(R.id.editText1);
                numero1 = Double.parseDouble(operacion.getText().toString());
                editText1.setText("");
            }
        });

        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = "-";
                operacion = (EditText) findViewById(R.id.editText1);
                numero1 = Double.parseDouble(operacion.getText().toString());
                editText1.setText("");
            }
        });

        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = "x";
                operacion = (EditText) findViewById(R.id.editText1);
                numero1 = Double.parseDouble(operacion.getText().toString());
                editText1.setText("");
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                op = "/";
                operacion = (EditText) findViewById(R.id.editText1);
                numero1 = Double.parseDouble(operacion.getText().toString());
                editText1.setText("");

            }
        });

        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                operacion = (EditText) findViewById(R.id.editText1);
                numero2 = Double.parseDouble(operacion.getText().toString());

                if(op.equals("+")){

                    editText1.setText("");
                    resultado = numero1 + numero2;

                }

                if(op.equals("-")){

                    editText1.setText("");
                    resultado = numero1 - numero2;

                }

                if(op.equals("x")){

                    editText1.setText("");
                    resultado = numero1 * numero2;

                }

                boolean divZero = false;

                if(op.equals("/")){

                    editText1.setText("");

                    if(numero2 == 0){

                        editText1.setText("error");
                        divZero = true;
                    }else{

                        resultado = numero1 / numero2;
                    }
                }
                if(!divZero)
                editText1.setText(String.valueOf(resultado));
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                numero2 = 0;
                numero1 = 0;
                editText1.setText("");
            }
        });
    }
}

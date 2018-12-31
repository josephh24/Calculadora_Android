package com.example.josepablo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fathzer.soft.javaluator.DoubleEvaluator;

public class MainActivity extends AppCompatActivity {
    private EditText resulado1;
    private TextView resulado2;
    private Button  C, flecha, suma, resta, multiplicacion, division, punto, igual,
    uno, dos, tres, cuatro, cinco, seis, siete, ocho, nueve, cero, parentesis_1, signo, parentesis_2;
    private double operan1, operan2, res;
    private int count=0;
    private String expression="";
    private String text="";
    private Double result=0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resulado1 = (EditText) findViewById(R.id.resulado1);
        resulado2 = (TextView) findViewById(R.id.resulado2);
        C = (Button) findViewById(R.id.C);
        flecha = (Button) findViewById(R.id.flecha);
        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        multiplicacion = (Button) findViewById(R.id.multiplicacion);
        division = (Button) findViewById(R.id.division);
        punto = (Button) findViewById(R.id.punto);
        igual = (Button) findViewById(R.id.igual);
        uno = (Button) findViewById(R.id.uno);
        dos = (Button) findViewById(R.id.dos);
        tres = (Button) findViewById(R.id.tres);
        cuatro = (Button) findViewById(R.id.cuatro);
        cinco = (Button) findViewById(R.id.cinco);
        seis = (Button) findViewById(R.id.seis);
        siete = (Button) findViewById(R.id.siete);
        ocho = (Button) findViewById(R.id.ocho);
        nueve = (Button) findViewById(R.id.nueve);
        cero = (Button) findViewById(R.id.cero);
        parentesis_1 = (Button) findViewById(R.id.parentesis_1);
        signo = (Button) findViewById(R.id.signo);
        parentesis_2 = (Button) findViewById(R.id.parentesis_2);

        uno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt1(view);
            }
        });
        dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt2(view);
            }
        });
        tres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt3(view);
            }
        });
        cuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt4(view);
            }
        });
        cinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt5(view);
            }
        });
        seis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt6(view);
            }
        });
        siete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt7(view);
            }
        });
        ocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt8(view);
            }
        });
        nueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt9(view);
            }
        });
        cero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bt0(view);
            }
        });
        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btpunto(view);
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btsuma(view);
            }
        });
        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btresta(view);
            }
        });
        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btmultiplicacion(view);
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btdivision(view);
            }
        });
        igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btigual(view);
            }
        });
        C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear(view);
            }
        });
        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                borrar(view);
            }
        });
        parentesis_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btparentsis1(view);
            }
        });
        parentesis_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btparentsis2(view);
            }
        });
        signo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btsigno(view);
            }
        });

    }

    public void bt1(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "1";
        resulado2.setText(numero);
    }
    public void bt2(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "2";
        resulado2.setText(numero);
    }
    public void bt3(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "3";
        resulado2.setText(numero);
    }
    public void bt4(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "4";
        resulado2.setText(numero);
    }
    public void bt5(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "5";
        resulado2.setText(numero);
    }
    public void bt6(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "6";
        resulado2.setText(numero);
    }
    public void bt7(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "7";
        resulado2.setText(numero);
    }
    public void bt8(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "8";
        resulado2.setText(numero);
    }
    public void bt9(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "9";
        resulado2.setText(numero);
    }
    public void bt0(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "0";
        resulado2.setText(numero);
    }
    public void btpunto(View v){
        String numero = resulado2.getText().toString();
        numero = numero + ".";
        resulado2.setText(numero);
    }
    public void btsuma(View v){
        operacion("+");
    }
    public void btresta(View v){
        operacion("-");
    }
    public void btmultiplicacion(View v){
        operacion("*");
    }
    public void btdivision(View v){
        operacion("/");
    }
    public void btparentsis1(View v){
        String numero = resulado2.getText().toString();
        numero = numero + "(";
        resulado2.setText(numero);
    }
    public void btparentsis2(View v){
        String numero = resulado2.getText().toString();
        numero = numero + ")";
        resulado2.setText(numero);
    }
    public void btsigno(View v){
        if(resulado2.length()!=0)
        {
            String s=resulado2.getText().toString();
            char arr[]=s.toCharArray();
            if(arr[0]=='-')
                resulado2.setText(s.substring(1,s.length()));
            else
                resulado2.setText("-"+s);
        }
    }
    public void btigual(View v){
        if(resulado2.length()!=0)
        {
            text=resulado2.getText().toString();
            expression=resulado1.getText().toString()+text;
        }
        resulado1.setText("");
        if(expression.length()==0)
            expression="0.0";
        DoubleEvaluator evaluator = new DoubleEvaluator();
        try
        {
            //evalua la expresion
            result = new DoubleEvaluator().evaluate(expression);
            if(!expression.equals("0.0"))
            resulado2.setText(result+"");
        }
        catch (Exception e)
        {
            resulado2.setText("Expresion Invalida");
            resulado1.setText("");
            expression="";
            e.printStackTrace();
        }
    }
    public void clear(View v){
        resulado1.setText("");
        resulado2.setText("");
        operan1 = 0.0;
        operan2 = 0.0;
        res = 0.0;
    }
    public void borrar(View v){
        if(!resulado2.getText().toString().equals("")){
            resulado2.setText(resulado2.getText().subSequence(0,resulado2.getText().length()-1)+"");
        }
    }

    private void operacion(String op)
    {
        if(resulado2.length()!=0)
        {
            String text=resulado2.getText().toString();
            resulado1.setText(resulado1.getText() + text+op);
            resulado2.setText("");
            count=0;
        }
        else
        {
            String text=resulado1.getText().toString();
            if(text.length()>0)
            {
                String newText=text.substring(0,text.length()-1)+op;
                resulado1.setText(newText);
            }
        }
    }
}

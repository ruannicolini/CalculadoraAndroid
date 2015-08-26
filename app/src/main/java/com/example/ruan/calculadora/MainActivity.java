package com.example.ruan.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int operacao; // Divisao = 1; Multiplicação = 2; Subtração = 3; Adição = 4;
    Float num1, num2;
    boolean resultado = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn0 = (Button) findViewById(R.id.btn0);
        Button btn1 = (Button) findViewById(R.id.btn1);
        Button btn2 = (Button) findViewById(R.id.btn2);
        Button btn3 = (Button) findViewById(R.id.btn3);
        Button btn4 = (Button) findViewById(R.id.btn4);
        Button btn5 = (Button) findViewById(R.id.btn5);
        Button btn6 = (Button) findViewById(R.id.btn6);
        Button btn7 = (Button) findViewById(R.id.btn7);
        Button btn8 = (Button) findViewById(R.id.btn8);
        Button btn9 = (Button) findViewById(R.id.btn9);

        Button btnDiv = (Button) findViewById(R.id.btnDiv);
        Button btnMult = (Button) findViewById(R.id.btnMult);
        Button btnSub = (Button) findViewById(R.id.btnSub);
        ImageButton btnSoma = (ImageButton) findViewById(R.id.btnSoma);
        Button btnIgual = (Button) findViewById(R.id.btnIgual);
        Button btnCE = (Button) findViewById(R.id.btnCE);

        final TextView txtExib = (TextView) findViewById(R.id.txtExibicao);
        final TextView txtAux = (TextView) findViewById(R.id.txtAux);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                CharSequence aux = txtExib.getText();
                txtExib.setText(aux + "9");
            }
        });

        btnCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(resultado == true){
                    resultado = false;
                    txtExib.setText("");
                }
                txtAux.setText("");
                txtExib.setText("");
                operacao = 0; // Eu que coloquei
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = 1;
                num1 = Float.parseFloat((String) txtExib.getText());
                txtAux.setText(txtExib.getText() + "/");
                txtExib.setText("");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = 2;
                num1 = Float.parseFloat((String) txtExib.getText());
                txtAux.setText(txtExib.getText() + "*");
                txtExib.setText("");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = 3;
                num1 = Float.parseFloat((String) txtExib.getText());
                txtAux.setText(txtExib.getText() + "-");
                txtExib.setText("");
            }
        });

        btnSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operacao = 4;
                num1 = Float.parseFloat((String) txtExib.getText());
                txtAux.setText(txtExib.getText() + "+");
                txtExib.setText("");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    num2 = Float.parseFloat((String) txtExib.getText());
                    txtAux.setText("");
                    switch (operacao) {
                        case 1:
                            txtExib.setText(formataSaida((num1 / num2)));
                            break;
                        case 2:
                            txtExib.setText(formataSaida((num1 * num2)));
                            break;
                        case 3:
                            txtExib.setText(formataSaida((num1 - num2)));
                            break;
                        case 4:
                            txtExib.setText(formataSaida((num1 + num2)));
                            break;
                        default:

                            break;
                    }
                    resultado = true;
                }catch (Exception e){

                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public String formataSaida(Float resultado){
        DecimalFormat formatar = new DecimalFormat("0");
        if(resultado%1 ==0) return formatar.format(resultado);
        else return String.valueOf(resultado);
    }
}

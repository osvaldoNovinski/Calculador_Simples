package osvaldo.unifacear.edu.br.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Double valor1;
    Double valor2 = 0.0;
    Double resultado = 0.0;
    //String operação = "";
    int operacao = 0;
    //√;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);



            Button btn0 = findViewById(R.id.btn0);
            Button btn1 = findViewById(R.id.btn1);
            Button btn2 = findViewById(R.id.btn2);
            Button btn3 = findViewById(R.id.btn3);
            Button btn4 = findViewById(R.id.btn4);
            Button btn5 = findViewById(R.id.btn5);
            Button btn6 = findViewById(R.id.btn6);
            Button btn7 = findViewById(R.id.btn7);
            Button btn8 = findViewById(R.id.btn8);
            Button btn9 = findViewById(R.id.btn9);
            Button btnSub = findViewById(R.id.btnSub);
            Button btnSoma = findViewById(R.id.btnSoma);
            Button btnMult = findViewById(R.id.btnMult);
            Button btnDiv = findViewById(R.id.btnDiv);
            Button btnIgual = findViewById(R.id.btnIgual);
            Button btnPor = findViewById(R.id.btnPor);
            Button btnExpo = findViewById(R.id.btnExpo);
            Button btnRaiz = findViewById(R.id.btnRaiz);
            Button btnPonto = findViewById(R.id.btnPonto);
            Button btnClr = findViewById(R.id.btnClr);


            btn0.setOnClickListener(this);
            btn1.setOnClickListener(this);
            btn2.setOnClickListener(this);
            btn3.setOnClickListener(this);
            btn4.setOnClickListener(this);
            btn5.setOnClickListener(this);
            btn6.setOnClickListener(this);
            btn7.setOnClickListener(this);
            btn8.setOnClickListener(this);
            btn9.setOnClickListener(this);
            btnSub.setOnClickListener(this);
            btnSoma.setOnClickListener(this);
            btnMult.setOnClickListener(this);
            btnDiv.setOnClickListener(this);
            btnIgual.setOnClickListener(this);
            btnPor.setOnClickListener(this);
            btnExpo.setOnClickListener(this);
            btnRaiz.setOnClickListener(this);
            btnPonto.setOnClickListener(this);
            btnClr.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        final TextView tv = findViewById(R.id.resultado);
        final TextView ans = findViewById(R.id.txtAns);
            switch(v.getId()){
                case R.id.btn0:
                    tv.setText(tv.getText()+"0");
                    break;
                case R.id.btn1:
                    tv.setText(tv.getText()+"1");
                    break;
                case R.id.btn2:
                    tv.setText(tv.getText()+"2");
                    break;
                case R.id.btn3:
                    tv.setText(tv.getText()+"3");
                    break;
                case R.id.btn4:
                    tv.setText(tv.getText()+"4");
                    break;
                case R.id.btn5:
                    tv.setText(tv.getText()+"5");
                    break;
                case R.id.btn6:
                    tv.setText(tv.getText()+"6");
                    break;
                case R.id.btn7:
                    tv.setText(tv.getText()+"7");
                    break;
                case R.id.btn8:
                    tv.setText(tv.getText()+"8");
                    break;
                case R.id.btn9:
                    tv.setText(tv.getText()+"9");
                    break;
                case R.id.btnPonto:
                    if(tv.getText().toString().contains(".")){

                    }else {
                        tv.setText(tv.getText() + ".");
                    }
                    break;
                case R.id.btnSoma:
                    operacao = 1;
                    if (tv.getText() == "") {
                        valor1 = 0.0;
                        ans.setText("0+");
                    }else {
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString());
                    }
                    break;
                case R.id.btnSub:
                    operacao = 2;
                    if (tv.getText() == "") {
                        valor1 = 0.0;
                        ans.setText("0-");
                    }else {
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString());
                    }
                    break;
                case R.id.btnMult:
                    operacao = 3;
                    if (tv.getText() == "") {
                        valor1 = 0.0;
                        ans.setText("0*");
                    }else {
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString());
                    }
                    break;
                case R.id.btnDiv:
                    operacao = 4;
                    if (tv.getText() == "") {
                        valor1 = 0.0;
                        ans.setText("0/");
                    }else {
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString());
                    }
                    break;
                case R.id.btnPor:
                    operacao = 5;
                    if(tv.getText() == ""){
                        valor1 = 0.0;
                        ans.setText("0%");
                    }else{
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString()+"%");
                    }
                    break;
                case R.id.btnExpo:
                    operacao = 6;
                    if (tv.getText() == "") {
                        valor1 = 0.0;
                        ans.setText("0^");

                    }else{
                        valor1 = Double.valueOf(tv.getText().toString());
                        tv.setText("");
                        ans.setText(valor1.toString()+"^");
                    }
                    break;
                case R.id.btnRaiz:
                    operacao = 7;
                    if (tv.getText() == "") {
                        ans.setText("√");
                    }else{
                        //valor1 = Double.valueOf(tv.getText().toString());
                        //ans.setText("√"+valor1.toString());
                    }
                    break;
                case R.id.btnIgual:
                    if(operacao == 0){
                        tv.setText("");
                        ans.setText("");
                        operacao=0;
                    }else if(operacao == 1){
                        resultado = valor1 + Double.valueOf(tv.getText().toString());
                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else {
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }

                    }else if (operacao == 2){
                        resultado = valor1 - Double.valueOf(tv.getText().toString());
                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else {
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }
                    }else if ( operacao == 3){
                        resultado = valor1 * Double.valueOf(tv.getText().toString());
                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else {
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }
                    }else if (operacao == 4){
                        if(Double.valueOf(tv.getText().toString())==0){
                            tv.setText("");
                            ans.setText("");
                            valor1 = 0.0;
                            Toast.makeText(getApplicationContext(),"Erro Matemágico", Toast.LENGTH_LONG).show();
                            operacao=0;
                        }else {
                            resultado = valor1 / Double.valueOf(tv.getText().toString());
                            if(resultado == 0){
                                tv.setText("");
                                ans.setText("");
                                operacao=0;
                            }else {
                                tv.setText(resultado.toString());
                                ans.setText("");
                                operacao=0;
                            }
                        }
                    }else if (operacao == 5){
                        resultado = (valor1 / 100)*Double.valueOf(tv.getText().toString());
                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else {
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }
                    }else if(operacao == 6){

                        resultado = Math.pow(valor1 ,Double.valueOf(tv.getText().toString()) );

                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else{
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }
                    }else if(operacao == 7){
                        resultado = Math.sqrt(Double.valueOf(tv.getText().toString()));

                        if(resultado == 0){
                            tv.setText("");
                            ans.setText("");
                            operacao=0;
                        }else{
                            tv.setText(resultado.toString());
                            ans.setText("");
                            operacao=0;
                        }
                    }
                    break;
                case R.id.btnClr:
                    operacao=0;
                    valor1 = 0.0;
                    tv.setText("");
                    ans.setText("");
            }

    }
}

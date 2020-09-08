package com.example.example22;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    EditText t,t2,t3,t4;
    Button punto,pendiente,cuadrante;


    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        t= findViewById(R.id.txtx1);
        t2=findViewById(R.id.txtx2);
        t3=findViewById(R.id.txty1);
        t4=findViewById(R.id.txty2);
        punto=findViewById(R.id.btnpunto);
        pendiente=findViewById(R.id.btnpendiente);
        cuadrante=findViewById(R.id.btncuadrante);
        
        
        
        
        
        
        


        punto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                StringBuilder result=new StringBuilder();
                StringBuilder result2=new StringBuilder();
                if(TextUtils.isEmpty(t.getText().toString()) || TextUtils.isEmpty(t2.getText().toString()) || TextUtils.isEmpty(t3.getText().toString()) || TextUtils.isEmpty(t4.getText().toString()) ){
                    Toast.makeText(getApplicationContext(),"Datos invalidos",Toast.LENGTH_LONG).show();


                }else{
                    int a=2;
                    String x =t.getText().toString();
                    double x1 =Double.parseDouble(x);
                    String xx =t2.getText().toString();
                    double x2 = Double.parseDouble(xx);
                    String y =t3.getText().toString();
                    double y1 =Double.parseDouble(y);
                    String yy =t4.getText().toString();
                    double y2= Double.parseDouble(yy);

                    double r1= x1+x2;
                    double rx=r1/a;

                    double r2= y1+y2;
                    double ry=r2/a;
                    result.append("x("+rx+")");
                    result2.append("y("+ry+")");

                    Toast.makeText(getApplicationContext(),result.toString()+result2.toString(),Toast.LENGTH_LONG).show();


                }


            }
        });


pendiente.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {


        StringBuilder result=new StringBuilder();
        StringBuilder result2=new StringBuilder();
        if(TextUtils.isEmpty(t.getText().toString()) || TextUtils.isEmpty(t2.getText().toString()) || TextUtils.isEmpty(t3.getText().toString()) || TextUtils.isEmpty(t4.getText().toString()) ){
            Toast.makeText(getApplicationContext(),"Datos invalidos",Toast.LENGTH_LONG).show();


        }else{
            int a=2;
            String x =t.getText().toString();
            double x1 =Double.parseDouble(x);
            String xx =t2.getText().toString();
            double x2 = Double.parseDouble(xx);
            String y =t3.getText().toString();
            double y1 =Double.parseDouble(y);
            String yy =t4.getText().toString();
            double y2= Double.parseDouble(yy);

            double r1= x2-x1;
            double r2=y2-y1;
            double m=r2/r1;


            result.append("M=("+m+")");


            Toast.makeText(getApplicationContext(),result.toString()+result2.toString(),Toast.LENGTH_LONG).show();


        }




    }
});




cuadrante.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {

        if(TextUtils.isEmpty(t.getText().toString()) ||  TextUtils.isEmpty(t3.getText().toString())  ){
            Toast.makeText(getApplicationContext(),"Datos invalidos",Toast.LENGTH_LONG).show();


        }else{

            String x =t.getText().toString();
            double x1 =Double.parseDouble(x);
            String xx =t2.getText().toString();
            double x2 = Double.parseDouble(xx);
            String y =t3.getText().toString();
            double y1 =Double.parseDouble(y);
            String yy =t4.getText().toString();
            double y2= Double.parseDouble(yy);

            if(x1 > 0  && y1 > 0){
                Toast.makeText(getApplicationContext(),"Esta cuadrante 1",Toast.LENGTH_LONG).show();
            }if(x1 > 0  && y1 < 0){
                Toast.makeText(getApplicationContext(),"Esta cuadrante 4",Toast.LENGTH_LONG).show();
            }if(y1 < 0  && x1 <0){
                Toast.makeText(getApplicationContext(),"Esta cuadrante 3",Toast.LENGTH_LONG).show();
            }if(y1 > 0  && x1 < 0){
                Toast.makeText(getApplicationContext(),"Esta cuadrante 2",Toast.LENGTH_LONG).show();
            }






        }


    }
});







    }



    private void addListenerOnButtonClick() {
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                double x=Math.random()*5;
                String x1=String.valueOf(x);
                double xx=Math.random()*5;
                String x2=String.valueOf(xx);
                double y=Math.random()*5;
                String y1=String.valueOf(y);
                double yy=Math.random()*5;
                String y2=String.valueOf(yy);
                t.setText(x1);
                t2.setText(x2);
                t3.setText(y1);
                t4.setText(y2);
                break;

            case R.id.item2:
                StringBuilder result=new StringBuilder();
                String a =t.getText().toString();
                double a1 =Double.parseDouble(a);
                String aa =t2.getText().toString();
                double a2 = Double.parseDouble(aa);
                 String b =t3.getText().toString();
                 double b1 =Double.parseDouble(b);
                 String b2 =t4.getText().toString();
                 double bb=Double.parseDouble(b2);
                double d= Math.hypot(a2-a1,bb-b1);


                result.append("La Distancia es:("+d+")");


                Toast.makeText(getApplicationContext(),result.toString(),Toast.LENGTH_LONG).show();

                break;

            case R.id.item3:
                t.setText("");
                t2.setText("");
                t3.setText("");
                t4.setText("");

        }


        return super.onOptionsItemSelected(item);
    }
}
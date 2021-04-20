package com.example.baitapbuoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText edtsodienthoai;            TextView txterrorsodienthoai;
    EditText edtemail;                  TextView txterroremail;
    EditText edtten;                    TextView txterrorten;
    EditText edtcoquan;                 TextView txterrorcoquan;
    EditText edtmatkhau;                TextView txterrormatkhau;
    Button btndangky2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Anhxa();
        btndangky2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtsodienthoai.getText().toString().length()==0)
                {edtsodienthoai.setBackgroundColor(Color.RED);txterrorsodienthoai.setText("Không được để trống");}
                else {edtsodienthoai.setBackgroundColor(Color.WHITE);}
                if (!edtemail.getText().toString().contains("@"))
                {edtemail.setBackgroundColor(Color.RED);txterroremail.setText("Email không hợp lệ");}
                else {edtemail.setBackgroundColor(Color.WHITE);}
                if (edtten.getText().toString().length()==0)
                {edtten.setBackgroundColor(Color.RED);txterrorten.setText("Không được để trống");}
                else {edtten.setBackgroundColor(Color.WHITE);}
                if (edtcoquan.getText().toString().length()==0)
                {edtcoquan.setBackgroundColor(Color.RED);txterrorcoquan.setText("Không được để trống");}
                else {edtcoquan.setBackgroundColor(Color.WHITE);}
                if (edtmatkhau.getText().toString().length()<8)
                {edtten.setBackgroundColor(Color.RED);txterrormatkhau.setText("Mật khẩu quá ngắn");}
                else {edtten.setBackgroundColor(Color.WHITE);}
                if (edtsodienthoai.getText().toString().length()!=0&& edtemail.getText().toString().contains("@") &&
                        edtten.getText().toString().length()!=0&&edtcoquan.getText().toString().length()!=0&&edtmatkhau.getText().toString().length()>=8)
                {
                    Intent intent2 = new Intent(MainActivity2.this,MainActivity3.class);
                    startActivity(intent2);
                }
            }
        });

    }




    private void Anhxa() {
        edtsodienthoai = (EditText) findViewById(R.id.edtsodienthoai);
        edtemail = (EditText) findViewById(R.id.edtemail);
        edtten = (EditText) findViewById(R.id.edtten);
        edtcoquan = (EditText) findViewById(R.id.edtcoquan);
        edtmatkhau = (EditText) findViewById(R.id.edtmatkhau3);
        btndangky2 = (Button) findViewById(R.id.btndangky2);
        txterrorsodienthoai = (TextView) findViewById(R.id.txterrorsodienthoai);
        txterrormatkhau = (TextView) findViewById(R.id.txterrormatkhau);
        txterroremail = (TextView) findViewById(R.id.txterroremail);
        txterrorcoquan = (TextView) findViewById(R.id.txterrorcoquan);
        txterrorten = (TextView) findViewById(R.id.txterrorten);



    }
}
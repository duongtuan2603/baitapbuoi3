package com.example.baitapbuoi3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txttaikhoan;
    EditText txtmatkhau;
    EditText txtmatkhau2;
    Button btntieptuc;
    TextView txterror;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        btntieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtmatkhau.setBackgroundColor(Color.WHITE);
                txtmatkhau2.setBackgroundColor(Color.WHITE);
                if (txttaikhoan.getText().toString().length()<6||txttaikhoan.getText().toString().contains(" "))
                     {
                        txterror.setText("Không hợp lệ, mời nhập lại");
                        txttaikhoan.setBackgroundColor(Color.RED);
                    }
                else {txttaikhoan.setBackgroundColor(Color.WHITE);}
                if (txtmatkhau.getText().toString().length()<8)
                {
                    txterror.setText("Không hợp lệ, mời nhập lại");
                    txtmatkhau.setBackgroundColor(Color.RED);
                }
                else {txtmatkhau.setBackgroundColor(Color.WHITE);}
                if (!txtmatkhau.getText().toString().equals(txtmatkhau2.getText().toString()))
                {
                    txterror.setText("Không hợp lệ, mời nhập lại");
                    txtmatkhau.setBackgroundColor(Color.RED);
                    txtmatkhau2.setBackgroundColor(Color.RED);
                }
                else {txtmatkhau.setBackgroundColor(Color.WHITE);
                    txtmatkhau2.setBackgroundColor(Color.WHITE);}

                if (txttaikhoan.getText().toString().length()>=6&&!txttaikhoan.getText().toString().contains(" ")&&txtmatkhau.getText().toString().length()>=8&&txtmatkhau.getText().toString().equals(txtmatkhau2.getText().toString()))
                    {
                    Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                    startActivity(intent);}
            }
        });
    }

    private void Anhxa() {
        txttaikhoan = (EditText) findViewById(R.id.edttaikhoan);
        txtmatkhau = (EditText) findViewById(R.id.edtmatkhau);
        txtmatkhau2 = (EditText) findViewById(R.id.edtmatkhau2);
        btntieptuc = (Button) findViewById(R.id.btndangky);
        txterror = (TextView) findViewById(R.id.txterror);
    }
}
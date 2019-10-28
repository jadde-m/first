package com.example.first;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Map;
import java.util.Set;

public class Main2Activity extends AppCompatActivity {
    float dollar,euro,won;
    EditText dollarRate,euroRate,wonRate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        dollar = intent.getFloatExtra("dollar_rate",0.0f);
        euro = intent.getFloatExtra("euro_rate",0.0f);
        won = intent.getFloatExtra("won_rate",0.0f);
        dollarRate=findViewById(R.id.sdoll);
        euroRate=findViewById(R.id.seuro);
        wonRate=findViewById(R.id.swon);
        dollarRate.setText(String.valueOf(dollar));
        euroRate.setText(String.valueOf(euro));
        wonRate.setText(String.valueOf(won));
    }
    public void save(View v){
        float dollar1=Float.parseFloat(dollarRate.getText().toString());
        float euro1=Float.parseFloat(euroRate.getText().toString());
        float won1=Float.parseFloat(wonRate.getText().toString());
        Intent intent =getIntent();
        Bundle dbl=new Bundle();
        dbl.putFloat("key_dollar",dollar1);
        dbl.putFloat("key_euro",euro1);
        dbl.putFloat("key_won",won1);
        intent.putExtra("bundle",dbl);
        setResult(2,intent);

        finish();
    }

    @Override
    public SharedPreferences getSharedPreferences(String name, int mode) {
        return super.getSharedPreferences(name, mode);
    }
}

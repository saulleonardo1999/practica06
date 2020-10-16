package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button button;
    ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.boton1);
        image = (ImageView) findViewById(R.id.img_android);
        button.setOnClickListener(this);
        image.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.boton1:
                Toast toast1 = Toast.makeText(getApplicationContext(), "Lanzaste un Toast corto con el boton", Toast.LENGTH_SHORT);
                toast1.setGravity(Gravity.TOP, 0,0);
                toast1.show();
                break;
            case R.id.img_android:
                Toast toast2 = Toast.makeText(getApplicationContext(), "Lanzaste un Toast largo con el boton", Toast.LENGTH_LONG);
                toast2.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast2.show();
                break;
        }
    }
}
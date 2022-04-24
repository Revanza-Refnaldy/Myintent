package com.example.myintentapp;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMoveActivity = findViewById(R.id.btn_move_activity);
        btnMoveActivity.setOnClickListener(this);

        Button btnMoveData = findViewById(R.id.btn_move_data);
        btnMoveData.setOnClickListener(this);

        Button btnMoveActivityObject = findViewById(R.id.btn_move_object);
        btnMoveActivityObject.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {
        switch (v.getId())  {
            case R.id.btn_move_activity:
                Intent moveIntent = new Intent(MainActivity.this,MoveActivity.class);
                startActivity(moveIntent);
                break;

            case R.id.btn_move_data:
                Intent Mdata = new Intent(MainActivity.this,MoveActivity.class);
                Mdata.putExtra( "data1", "yey bisa pindah");
                Mdata.putExtra("data2", "bisa ");
                startActivity(Mdata);
                break;

            case R.id.btn_move_object:
                 Person manusia = new Person("Samid ", "MidMid@gmail.com ", "Malang", 17);
                 Intent intent_object = new Intent(MainActivity.this, MoveWithObjectActivity.class);
                 intent_object.putExtra(MoveWithObjectActivity.EXTRA_PERSON, manusia);
                 startActivity(intent_object);
                 break;
        }
    }
}
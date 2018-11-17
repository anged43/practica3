package com.example.angel.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button login;
    Button registro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registro = (Button)findViewById(R.id.btnregistrar);
        registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentregistrar = new Intent(MainActivity.this, Registrar.class);
                startActivity(intentregistrar);
            }
        });

        login = (Button)findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentlog = new Intent(MainActivity.this, Login.class);
                startActivity(intentlog);
            }
        });
    }
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        Intent menuintent;
        switch (item.getItemId()){
            case R.id.opcionlogin:
                menuintent = new Intent(MainActivity.this, Login.class);
                startActivity(menuintent);
                break;
            case R.id.opcionregistrar:
                menuintent = new Intent(MainActivity.this, Registrar.class);
                startActivity(menuintent);
                break;
        }
        return true;

    }
}

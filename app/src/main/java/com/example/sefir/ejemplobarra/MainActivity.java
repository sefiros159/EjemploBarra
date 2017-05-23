package com.example.sefir.ejemplobarra;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //agregamos toolbar a la aplicación
        Toolbar toolbar = (Toolbar) findViewById(R.id.mi_toolbar);

        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater infla = getMenuInflater();
        infla.inflate(R.menu.mi_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        String cad = "";
        switch (item.getItemId())
        {
            case R.id.opcion1:
                cad = "Presionaste la opción 1";
                break;
            case R.id.opcion2:
                cad = "Presionaste la opción 2";
                break;
            case R.id.opcion3:
                cad = "Presionaste la opción 3";
                break;
            case R.id.opcion4:
                cad = "Presionaste la opción 4";
                break;
        }

        Toast.makeText(this, "Mensaje " + cad, Toast.LENGTH_SHORT).show();
        return true;
    }
}

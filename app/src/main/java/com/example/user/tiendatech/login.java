package com.example.user.tiendatech;

import android.content.Intent;
import android.support.v4.app.NotificationCompatSideChannelService;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class login extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button boton = (Button) findViewById(R.id.btnIngresar);
        boton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 String usuario = ((EditText) findViewById(R.id.usuario)).getText().toString();
                 String password = ((EditText) findViewById(R.id.password)).getText().toString();
                 if (usuario.isEmpty() || password.isEmpty()){
                     Toast.makeText(getApplicationContext(), "Por favor ingrese el usuario y la contraseña.", Toast.LENGTH_SHORT).show();
                 }
                 else
                 {
                     if (usuario.toUpperCase().equals("ADMIN") && password.equals("PRB123")){
                         Intent inicio = new Intent(login.this, Inicio.class);
                         startActivity(inicio);
                     }
                     else {
                         Toast.makeText(getApplicationContext(), "Usuario y/o la contraseña son incorrectos.", Toast.LENGTH_SHORT).show();
                     }
                 }
             }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the inicio; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
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
}

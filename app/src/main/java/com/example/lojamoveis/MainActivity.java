package com.example.lojamoveis;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.exemple.LojaMoveis.MESSAGE";
    public final static String EXTRA_MESSAGE_EMAIL = "com.exemple.LojaMoveis.MESSAGE_EMAIL";
    public final static String EXTRA_MESSAGE_DATA = "com.exemple.LojaMoveis.MESSAGE_DATA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void concluido(View view)
    {
        Intent intent = new Intent(this, Result.class);
        EditText txtNomeFun = (EditText)findViewById(R.id.txtNomeFun);
        EditText txtEmail = (EditText)findViewById(R.id.txtEmail);
        EditText dtData = (EditText)findViewById(R.id.dtData);

        String message1 = txtNomeFun.getText().toString();
        String message2 = txtEmail.getText().toString();
        String message3 = dtData.getText().toString();

        intent.putExtra(EXTRA_MESSAGE, message1);
        intent.putExtra(EXTRA_MESSAGE_EMAIL, message2);
        intent.putExtra(EXTRA_MESSAGE_DATA, message3);
        startActivity(intent);
    }
}

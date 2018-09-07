package com.example.bartoszczajkowski.shoppinglist;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
// added static variable
import static com.example.bartoszczajkowski.shoppinglist.MainActivity.KEY;
import static com.example.bartoszczajkowski.shoppinglist.MainActivity.SP;
import static com.example.bartoszczajkowski.shoppinglist.MainActivity.SP_KEY;



public class ShoppingListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Transfer message:
        Intent intent = getIntent();
        String message = intent.getStringExtra(KEY);
        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        SharedPreferences.Editor editor = getSharedPreferences(SP, MODE_PRIVATE).edit();
        editor.putString(SP_KEY, "Inna super tajna wiadomość");
        editor.commit();

    }

}

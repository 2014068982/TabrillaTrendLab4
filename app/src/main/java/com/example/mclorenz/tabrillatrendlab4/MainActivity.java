package com.example.mclorenz.tabrillatrendlab4;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf", "onCreate has executed...");
        Button btn1 = (Button) findViewById(R.id.button);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v)  {
                Toast.makeText(getBaseContext(), "Back Button is pressed!" , Toast.LENGTH_SHORT ).show();
            }
        });

        Button button = (Button) findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Snackbar snackbar = Snackbar.make(v,"Next Button is pressed!", Snackbar.LENGTH_LONG);
                snackbar.show();
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf", "onStart has executed...");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf", "onResume has executed...");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf", "onPause has executed...");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf", "onStop has executed...");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf", "onRestart has executed...");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf", "object is deallocated...");
    }

}
package com.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                EditText editText = (EditText) findViewById(R.id.name);
                String name = editText.getText().toString();
                Intent greeting = new Intent(Main.this, Greeting.class);
                greeting.putExtra("name", name);
                startActivity(greeting);
            }
        });
    }
}

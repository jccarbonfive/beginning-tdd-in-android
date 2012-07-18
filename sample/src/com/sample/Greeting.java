package com.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Greeting extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);

      Intent intent = getIntent();
      String name = intent.getStringExtra("name");
      String greeting = String.format("Hello %s", name);

      TextView textView = new TextView(this);
      textView.setText(greeting);

      setContentView(textView);
    }
}

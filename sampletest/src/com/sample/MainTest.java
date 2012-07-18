package com.sample;

import android.test.ActivityUnitTestCase;
import android.app.Activity;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Button;

public class MainTest extends ActivityUnitTestCase<Main> {
    public MainTest() {
        super(Main.class);
    }

    public void testExpectToIntendToStartANewActivityAfterSubmittingAName() {
        Intent intent = new Intent(getInstrumentation().getTargetContext(),
                                   Main.class);
        startActivity(intent, null, null);

        Activity activity = getActivity();

        String name = "Test User";
        EditText editText = (EditText) activity.findViewById(R.id.name);
        editText.setText(name);

        Button submit = (Button) activity.findViewById(R.id.submit);
        submit.performClick();

        Intent startedIntent = getStartedActivityIntent();
        assertNotNull("Intent not started", startedIntent);
        assertEquals(name, startedIntent.getStringExtra("name"));
    }
}

package com.sample;

import android.test.ActivityInstrumentationTestCase2;

import com.jayway.android.robotium.solo.Solo;

public class GreeterTest extends ActivityInstrumentationTestCase2<Main> {
    public GreeterTest() {
        super("com.sample", Main.class);
    }

    public void testExpectAGreetingAfterSubmittingAName() {
        Solo solo = new Solo(getInstrumentation(), getActivity());

        int editTextIndex = 0;
        String name = "Android";
        solo.enterText(editTextIndex, name);
        solo.clickOnButton("Submit");

        String greeting = String.format("Hello %s", name);
        assertTrue("Greeting not found", solo.searchText(greeting));
    }
}

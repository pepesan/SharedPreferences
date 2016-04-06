package com.example.pepesan.sharedpreferences;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MisPreferencias
        extends AppCompatActivity {
    @Override
    public void onCreate(
            Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        // Display the fragment as the main content.
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new SettingsFragment())
                .commit();
    }
}

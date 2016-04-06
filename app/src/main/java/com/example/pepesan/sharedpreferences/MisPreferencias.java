package com.example.pepesan.sharedpreferences;

import android.preference.PreferenceActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MisPreferencias
        extends PreferenceActivity {
    @Override
    public void onCreate(
            Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(
                R.xml.preferences);
    }
}

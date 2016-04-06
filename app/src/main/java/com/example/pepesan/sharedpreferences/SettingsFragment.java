package com.example.pepesan.sharedpreferences;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by pepesan on 06/04/2016.
 */
public class SettingsFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Load the preferences from an XML resource
        addPreferencesFromResource(R.xml.preferences);
    }
}

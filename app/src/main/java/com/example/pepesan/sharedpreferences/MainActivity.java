package com.example.pepesan.sharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences preferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize preferences
        preferences = PreferenceManager
                .getDefaultSharedPreferences(
                        getApplicationContext());
    }
    public void getPref(View v) {
        String username =
                preferences.getString(
                        "username",
                        "n/a");
        String password =
                preferences.getString(
                        "password",
                        "n/a");
        showPrefs(username, password);
    }
    private void showPrefs(
            String username, String password){
        Toast.makeText(this,
                "Input: "
                        + username + " and password: "
                        + password, Toast.LENGTH_LONG)
                .show();

    }
    public void updatePreferenceValue(View view){
        SharedPreferences.Editor edit = preferences.edit();
        String username = preferences
                .getString("username", "n/a");
        // We will just revert the current user name and save again
        StringBuffer buffer =
                new StringBuffer();
        for (int i = username.length() - 1;
             i >= 0; i--) {
            buffer.append(username.charAt(i));
        }
        edit.putString("username",
                buffer.toString());
        edit.commit();
        // A toast is a view containing a quick little message for the
        // user. We give a little feedback
        Toast.makeText(this,
                "Reverted string sequence of user name.",
                Toast.LENGTH_LONG).show();
    }
    @Override
    public boolean onCreateOptionsMenu(
            Menu menu) {
        MenuInflater inflater =
                getMenuInflater();
        inflater.inflate(R.menu.mainmenu, menu);
        return true;
    }

    // This method is called once the menu is selected
    @Override
    public boolean onOptionsItemSelected(
            MenuItem item) {
        switch (item.getItemId()) {
            // We have only one menu option
            case R.id.preferences:
                // Launch Preference activity
                Intent i = new Intent(
                        getApplicationContext(),
                        MisPreferencias.class);
                startActivity(i);
                // Some feedback to the user

                Toast.makeText(this,
                        "Enter your user credentials.",
                        Toast.LENGTH_LONG).show();
                break;

        }
        return true;
    }
}

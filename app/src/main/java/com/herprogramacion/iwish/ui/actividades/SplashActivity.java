package com.herprogramacion.iwish.ui.actividades;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;

import com.herprogramacion.iwish.tools.Preferences;

public class SplashActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        prefs = getSharedPreferences("Preferences", Context.MODE_PRIVATE);

        Intent intentLogin = new Intent(this, LoginActivity.class);
        Intent intentMain = new Intent(this, MainActivity.class);

        if (!TextUtils.isEmpty(Preferences.getUserMailPrefs(prefs)) &&
                !TextUtils.isEmpty(Preferences.getUserPassPrefs(prefs))) {
            startActivity(intentMain);
        } else {
            startActivity(intentLogin);
        }
        finish();
    }

}

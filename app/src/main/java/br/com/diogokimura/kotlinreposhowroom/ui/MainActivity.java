package br.com.diogokimura.kotlinreposhowroom.ui;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import br.com.diogokimura.kotlinreposhowroom.R;
import br.com.diogokimura.kotlinreposhowroom.utils.AppSharedPreferences;

public class MainActivity extends AppCompatActivity {

    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.imageButton);
        button.setOnClickListener(view1 -> {
            // Reseting pages
            AppSharedPreferences appSharedPreferences = new AppSharedPreferences(this);
            appSharedPreferences.resetPage();

            Intent intent = new Intent(MainActivity.this, RepoListActivity.class);
            startActivity(intent);
        });
    }
}
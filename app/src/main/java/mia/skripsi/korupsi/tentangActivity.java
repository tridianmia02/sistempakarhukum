package mia.skripsi.korupsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class tentangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Tentang Aplikasi");
    }
}

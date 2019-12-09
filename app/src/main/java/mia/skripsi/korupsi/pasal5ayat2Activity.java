package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal5ayat2Activity extends AppCompatActivity {

    Button Btnbunyipasal5ayat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal5ayat2);

        Btnbunyipasal5ayat2 = (Button) findViewById(R.id.button39);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal5ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal5ayat1Activity.class);
                startActivity(i);}
        });
    }
}

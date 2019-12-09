package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal12Cayat4Activity extends AppCompatActivity {

    Button Btnbunyipasal12Cayat2dan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal12_cayat4);

        Btnbunyipasal12Cayat2dan3 = (Button) findViewById(R.id.button64);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal12Cayat2dan3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat2dan3Activity.class);
                startActivity(i);}
        });
    }
}

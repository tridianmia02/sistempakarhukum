package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal4Activity extends AppCompatActivity {

    Button Btnbunyipasal2dan3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal4);

        Btnbunyipasal2dan3 = (Button) findViewById(R.id.button40);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal2dan3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal2dan3Activity.class);
                startActivity(i);}
        });
    }
}

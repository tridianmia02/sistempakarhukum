package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal7ayat2Activity extends AppCompatActivity {

    Button Btnbunyipasal7ayat2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal7ayat2);

        Btnbunyipasal7ayat2 = (Button) findViewById(R.id.button48);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal7ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal7ayat1Activity.class);
                startActivity(i);}
        });
    }
}

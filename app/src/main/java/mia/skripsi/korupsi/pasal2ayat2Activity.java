package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal2ayat2Activity extends AppCompatActivity {

    Button Btnbunyipasal2ayat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal2ayat2);

        Btnbunyipasal2ayat1 = (Button) findViewById(R.id.button35);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal2ayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal2ayat1Activity.class);
                startActivity(i);}
        });
    }
}

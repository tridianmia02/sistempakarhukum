package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasal12Cayat2Activity extends AppCompatActivity {

    Button Btnbunyipasal12Cayat1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal12_cayat2);

        Btnbunyipasal12Cayat1 = (Button) findViewById(R.id.button61);

        getSupportActionBar().setTitle("Pasal Korupsi");

        Btnbunyipasal12Cayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat1Activity.class);
                startActivity(i);}
        });
    }
}

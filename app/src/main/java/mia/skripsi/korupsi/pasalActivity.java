package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pasalActivity extends AppCompatActivity {
    Button Btnpasal2ayat1,
            Btnpasal2ayat2,
            Btnpasal3,
            Btnpasal4,
            Btnpasal5ayat1,
            Btnpasal5ayat2,
            Btnpasal6ayat1,
            Btnpasal6ayat2,
            Btnpasal7ayat1,
            Btnpasal7ayat2,
            Btnpasal8,
            Btnpasal9,
            Btnpasal10,
            Btnpasal11,
            Btnpasal12,
            Btnpasal12Aayat1,
            Btnpasal12Aayat2,
            Btnpasal12Bayat1,
            Btnpasal12Bayat2,
            Btnpasal12Cayat1,
            Btnpasal12Cayat2,
            Btnpasal12Cayat3,
            Btnpasal12Cayat4,
            Btnpasal13,
            Btnpasal14,
            Btnpasal15,
            Btnpasal16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pasal);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Pasal-pasal Korupsi ");

        Btnpasal2ayat1 = (Button) findViewById(R.id.button8);
        Btnpasal2ayat2 = (Button) findViewById(R.id.button9);
        Btnpasal3 = (Button) findViewById(R.id.button10);
        Btnpasal4 = (Button) findViewById(R.id.button11);
        Btnpasal5ayat1 = (Button) findViewById(R.id.button12);
        Btnpasal5ayat2 = (Button) findViewById(R.id.button13);
        Btnpasal6ayat1 = (Button) findViewById(R.id.button14);
        Btnpasal6ayat2 = (Button) findViewById(R.id.button15);
        Btnpasal7ayat1 = (Button) findViewById(R.id.button16);
        Btnpasal7ayat2 = (Button) findViewById(R.id.button17);
        Btnpasal8 = (Button) findViewById(R.id.button18);
        Btnpasal9 = (Button) findViewById(R.id.button19);
        Btnpasal10 = (Button) findViewById(R.id.button20);
        Btnpasal11 = (Button) findViewById(R.id.button21);
        Btnpasal12 = (Button) findViewById(R.id.button22);
        Btnpasal12Aayat1 = (Button) findViewById(R.id.button23);
        Btnpasal12Aayat2 = (Button) findViewById(R.id.button24);
        Btnpasal12Bayat1 = (Button) findViewById(R.id.button25);
        Btnpasal12Bayat2 = (Button) findViewById(R.id.button26);
        Btnpasal12Cayat1 = (Button) findViewById(R.id.button27);
        Btnpasal12Cayat2 = (Button) findViewById(R.id.button28);
        Btnpasal12Cayat3 = (Button) findViewById(R.id.button29);
        Btnpasal12Cayat4 = (Button) findViewById(R.id.button30);
        Btnpasal13 = (Button) findViewById(R.id.button31);
        Btnpasal14 = (Button) findViewById(R.id.button32);
        Btnpasal15 = (Button) findViewById(R.id.button33);
        Btnpasal16 = (Button) findViewById(R.id.button34);

        Btnpasal2ayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal2ayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal2ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal2ayat2Activity.class);
                startActivity(i);}
             });
        Btnpasal3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal3Activity.class);
                startActivity(i);}
            });
        Btnpasal4.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal4Activity.class);
                startActivity(i);}
            });
        Btnpasal5ayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal5ayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal5ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal5ayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal6ayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal6ayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal6ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal6ayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal7ayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal7ayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal7ayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal7ayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal8.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal8Activity.class);
                startActivity(i);}
            });
        Btnpasal9.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal9Activity.class);
                startActivity(i);}
            });
        Btnpasal10.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal10Activity.class);
                startActivity(i);}
            });
        Btnpasal11.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal11Activity.class);
                startActivity(i);}
            });
        Btnpasal12.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Activity.class);
                startActivity(i);}
             });
        Btnpasal12Aayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Aayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal12Aayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Aayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal12Bayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Bayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal12Bayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Bayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal12Cayat1.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat1Activity.class);
                startActivity(i);}
            });
        Btnpasal12Cayat2.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat2Activity.class);
                startActivity(i);}
            });
        Btnpasal12Cayat3.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat3Activity.class);
                startActivity(i);}
            });
        Btnpasal12Cayat4.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal12Cayat4Activity.class);
                startActivity(i);}
             });
        Btnpasal13.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal13Activity.class);
                startActivity(i);}
            });
        Btnpasal14.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal14Activity.class);
                startActivity(i);}
            });
        Btnpasal15.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal15Activity.class);
                startActivity(i);}
            });
        Btnpasal16.setOnClickListener (new View.OnClickListener() {
            public void onClick(View argo0) {
                Intent i = new Intent(getApplicationContext(), pasal16Activity.class);
                startActivity(i);}
            });

    }


}
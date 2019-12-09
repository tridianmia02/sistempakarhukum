//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
//public class hasil01Activity extends AppCompatActivity {
//    String hasily;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil01);
//
//        getSupportActionBar().setTitle("Hasil Analisis");
//
//        TextView hasil = (TextView) findViewById(R.id.hasil);
//        Button button = (Button) findViewById(R.id.button79);
//
//        hasily = getIntent().getStringExtra("hasilnya");
//
//        hasil.setText(hasily);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P01Activity.class);
//        startActivity(i);
//    }
//}

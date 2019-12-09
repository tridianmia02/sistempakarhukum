//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class hasil03Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil03);
//
//        getSupportActionBar().setTitle("Hasil Analisa");
//
//        TextView hasil = (TextView) findViewById(R.id.textView80);
//        TextView pasal = (TextView) findViewById(R.id.textView81);
//        TextView nilai = (TextView) findViewById(R.id.textView82);
//
//        hasil.setText("Jawaban Benar : "+P03Activity.benar+"\nJawaban Salah : "+P03Activity.salah);
//        nilai.setText(""+P03Activity.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P03Activity.class);
//        startActivity(i);
//    }
//}
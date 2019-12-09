//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class hasil07Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil07);
//
//        getSupportActionBar().setTitle("Hasil Analisa");
//
//        TextView hasil = (TextView) findViewById(R.id.textView92);
//        TextView pasal = (TextView) findViewById(R.id.textView93);
//        TextView nilai = (TextView) findViewById(R.id.textView94);
//
//        hasil.setText("Jawaban Benar : "+P07Activity.benar+"\nJawaban Salah : "+P07Activity.salah);
//        nilai.setText(""+P07Activity.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P07Activity.class);
//        startActivity(i);
//    }
//}

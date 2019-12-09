//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class hasil06Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil06);
//
//        getSupportActionBar().setTitle("Hasil Analisa");
//
//        TextView hasil = (TextView) findViewById(R.id.textView89);
//        TextView pasal = (TextView) findViewById(R.id.textView90);
//        TextView nilai = (TextView) findViewById(R.id.textView91);
//
//        hasil.setText("Jawaban Benar : "+P06Activity.benar+"\nJawaban Salah : "+P06Activity.salah);
//        nilai.setText(""+P06Activity.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P06Activity.class);
//        startActivity(i);
//    }
//}

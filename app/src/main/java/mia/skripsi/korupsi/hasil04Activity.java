//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class hasil04Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil04);
//
//        getSupportActionBar().setTitle("Hasil Analisa");
//
//        TextView hasil = (TextView) findViewById(R.id.textView83);
//        TextView pasal = (TextView) findViewById(R.id.textView84);
//        TextView nilai = (TextView) findViewById(R.id.textView85);
//
//        hasil.setText("Jawaban Benar : "+P04Activity.benar+"\nJawaban Salah : "+P04Activity.salah);
//        nilai.setText(""+P04Activity.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P04Activity.class);
//        startActivity(i);
//    }
//}

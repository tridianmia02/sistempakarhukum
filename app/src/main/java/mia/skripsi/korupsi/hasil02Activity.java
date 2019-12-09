//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//public class hasil02Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_hasil02);
//
//        getSupportActionBar().setTitle("Hasil Analisa");
//
//        TextView hasil = (TextView) findViewById(R.id.textView73);
//        TextView pasal = (TextView) findViewById(R.id.textView75);
//        TextView nilai = (TextView) findViewById(R.id.textView79);
//
//        hasil.setText("Jawaban Benar : "+P02Activity.benar+"\nJawaban Salah : "+P02Activity.salah);
//        nilai.setText(""+P02Activity.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i =new Intent(getApplicationContext(),P02Activity.class);
//        startActivity(i);
//    }
//}
//

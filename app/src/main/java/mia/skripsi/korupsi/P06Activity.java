//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.content.IntentFilter;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class P06Activity extends AppCompatActivity {
//
//    TextView pertanyaan_perkara;
//    RadioGroup rg;
//    RadioButton PilihanA, PilihanB;
//    int nomor = 0;
//    public static int hasil,benar, salah;
//
//    //pertanyaan
//    String[] pertanyaan = new String[]{
//            "1. Apakah tindak pidana tersebut dilakukan di wilayah Republik Indonesia ? ",
//            "2. Apakah dilakukan oleh perseorangan dan atau suatu korporasi ?",
//            "3. Apakah perbuatan tersebut benturan kepentingan dalam pengadaan ?",
//            "4. Apakah perbuatan yang dilakukan melanggar atau bertentangan dengan Undang-Undang ?",
//            "5. Apakah dilakukan untuk penyelenggara negara baik langsung maupun tidak langsung dengan sengaja turut serta dalam pemborongan, pengadaan atau persewaan untuk mengurus atau mengawasinya ?",
//    };
//
//    //pilihan jawaban
//    String[] pilihan_jawaban = new String[]{
//            "Ya", "Tidak",
//            "Ya", "Tidak",
//            "Ya", "Tidak",
//            "Ya", "Tidak",
//            "Ya", "Tidak",
//            "Ya", "Tidak",
//    };
//
//    //Jawaban yang benar
//    String[] jawaban_benar = new String[]{
//            "Ya",
//            "Ya",
//            "Ya",
//            "Ya",
//            "Ya",
//            "Ya",
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_p06);
//
//        getSupportActionBar().setTitle("Jawab pertanyaan berikut !");
//
//        pertanyaan_perkara = (TextView) findViewById(R.id.textView13);
//        rg = (RadioGroup) findViewById(R.id.radioGroup6);
//        PilihanA = (RadioButton) findViewById(R.id.radioButton11);
//        PilihanB = (RadioButton) findViewById(R.id.radioButton12);
//
//        pertanyaan_perkara.setText(pertanyaan[nomor]);
//        PilihanA.setText(pilihan_jawaban[0]);
//        PilihanB.setText(pilihan_jawaban[1]);
//
//        rg.check(0);
//        benar = 0;
//        salah = 0;
//    }
//
//    public void next(View view) {
//        if (PilihanA.isChecked() || PilihanB.isChecked()){
//            RadioButton jawaban_user = (RadioButton) findViewById(rg.getCheckedRadioButtonId());
//            String ambil_jawaban_user = jawaban_user.getText().toString();
//            rg.check(0);
//            if (ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
//            else salah++;
//            nomor++;
//            if (nomor < pertanyaan_perkara.length()) {
//                pertanyaan_perkara.setText(pertanyaan[nomor]);
//                PilihanA.setText(pilihan_jawaban[(nomor*2)+0]);
//                PilihanB.setText(pilihan_jawaban[(nomor*2)+1]);
//            } else {
//                hasil = benar;
//                Intent selesai = new Intent(getApplicationContext(), hasil06Activity.class);
//                startActivity(selesai);
//            }
//        }
//        else {
//            Toast.makeText(this, "Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
//        }
//    }
//}

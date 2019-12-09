//package mia.skripsi.korupsi;
//
//import android.content.Intent;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class P02Activity<pertanyaan> extends AppCompatActivity {
//
//    TextView pertanyaan_perkara;
//    RadioGroup rg;
//    RadioButton PilihanA, PilihanB;
//    int nomor = 0;
//    public static int hasil, benar, salah;
//
//    //pertanyaan
//    String[] pertanyaan = new String[]{
//            "1. Apakah tindak pidana tersebut dilakukan di wilayah Republik Indonesia ?",
//            "2. Apakah dilakukan oleh perseorangan dan atau suatu korporasi ?",
//            "3. Apakah perbuatan tersebut termasuk suap menyuap ?",
//            "4. Apakah perbuatan yang dilakukan melanggar atau bertentangan dengan Undang-Undang ?",
//            "5. Apakah hasil tersebut dilakukan untuk memperkaya diri sendiri atau orang lain atau suatu korporasi yang merugikan keuangan negara ?",
//            "6. Apakah dilakukan untuk mempengaruhi putusan perkara yang diserahkan kepadanya untuk diadili ?",
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
//        setContentView(R.layout.activity_p02);
//
//        getSupportActionBar().setTitle("Jawab pertanyaan berikut !");
//
//        pertanyaan_perkara = (TextView) findViewById(R.id.textView10);
//        rg = (RadioGroup) findViewById(R.id.radioGroup2);
//        PilihanA = (RadioButton) findViewById(R.id.radioButton3);
//        PilihanB = (RadioButton) findViewById(R.id.radioButton4);
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
//                if ((ambil_jawaban_user.equalsIgnoreCase(jawaban_benar[nomor])))benar++;
//                else salah++;
//            } else {
//                hasil = benar * 20;
//                Intent selesai = new Intent(getApplicationContext(), hasil02Activity.class);
//                startActivity(selesai);
//            }
//        }
//        else {
//            Toast.makeText(this,"Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
//        }
//    }
//}

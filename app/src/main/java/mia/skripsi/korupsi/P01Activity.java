//package mia.skripsi.korupsi;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//public class P01Activity extends AppCompatActivity {
//
//    String jawabans;
//    TextView pertanyaan_perkara;
//    RadioGroup rg;
//    RadioButton PilihanA, PilihanB;
//    int nomor = 0;
//    int hasil, benar, salah;
//
//    //pertanyaan
//    String[] pertanyaan = new String[]{
//            "1. Apakah tindak pidana tersebut dilakukan di wilayah Republik Indonesia ?",
//            "2. Apakah dilakukan oleh perseorangan dan atau suatu korporasi ?",
//            "3. Apakah perbuatan tersebut merugikan keuangan negara atau perekonomian negara ?",
//            "4. Apakah dilakukan dengan menyalahgunakan kekuasaan dalam kedudukan jabatan ?",
//            "5. Apakah perbuatan yang dilakukan melanggar atau bertentangan dengan Undang-Undang ?",
//            "6. Apakah hasil tersebut dilakukan untuk memperkaya diri sendiri atau orang lain atau suatu korporasi yang merugikan keuangan negara ?",
//    };
//
//    //pilihan jawaban a, b
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
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_p01);
//
//        getSupportActionBar().setTitle("Jawab pertanyaan berikut !");
//
//        pertanyaan_perkara = (TextView) findViewById(R.id.textView9);
//        rg = (RadioGroup) findViewById(R.id.radioGroup);
//        PilihanA = (RadioButton) findViewById(R.id.radioButton);
//        PilihanB = (RadioButton) findViewById(R.id.radioButton2);
//
//        pertanyaan_perkara.setText(pertanyaan[nomor]);
//        PilihanA.setText(pilihan_jawaban[0]);
//        PilihanB.setText(pilihan_jawaban[1]);
//        rg.check(0);
//    }
//
//    public void check(){
//        if(PilihanA.getText().toString().equals(jawabans)){
//            benar = benar +1;
//        } else {
//            benar = benar + 0;
//        }
//    }
//
//    public void next(View view) {
//        if (PilihanA.isChecked() || PilihanB.isChecked()) {
//
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
//                hasil = (benar  * 20);
//                String hasilx = String.valueOf(hasil);
//                Intent selesai = new Intent(getApplicationContext(), hasil01Activity.class);
//                selesai.putExtra("hasilnya",hasilx);
//                startActivity(selesai);
//            }
//        }
//        else {
//            Toast.makeText(this, "Pilih Jawaban Dulu", Toast.LENGTH_SHORT).show();
//        }
//    }
//}

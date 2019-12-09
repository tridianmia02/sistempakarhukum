package mia.skripsi.korupsi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class analisaActivity extends AppCompatActivity {

    CheckBox ChckF01,
            ChckF02,
            ChckF03,
            ChckF04,
            ChckF05,
            ChckF06,
            ChckF07,
            ChckF08,
            ChckF09,
            ChckF10,
            ChckF11,
            ChckF12,
            ChckF13,
            ChckF14,
            ChckF15,
            ChckF16,
            ChckF17,
            ChckF18,
            ChckF19;

    Button btnMulaiAnalisis;
//    TextView tvOutputJenisPelanggaran1,
//            tvOutputJenisPelanggaran2,
//            tvOutputJenisPelanggaran3,
//            tvOutputJenisPelanggaran4,
//            tvOutputJenisPelanggaran5,
//            tvOutputJenisPelanggaran6,
//            tvOutputJenisPelanggaran7;


    double mb1=0;
    double md1=0;
    double mb2=0;
    double md2=0;
    double mb3=0;
    double md3=0;
    double mb4=0;
    double md4=0;
    double mb5=0;
    double md5=0;
    double mb6=0;
    double md6=0;
    double mb7=0;
    double md7=0;

    double skor1=0;
    double skor2=0;
    double skor3=0;
    double skor4=0;
    double skor5=0;
    double skor6=0;
    double skor7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_analisa);
        getSupportActionBar().setTitle(" Pilih tindakan yang dilakukan !!!");

        ChckF01 = (CheckBox) findViewById(R.id.checkBox);
        ChckF02 = (CheckBox) findViewById(R.id.checkBox2);
        ChckF03 = (CheckBox) findViewById(R.id.checkBox3);
        ChckF04 = (CheckBox) findViewById(R.id.checkBox4);
        ChckF05 = (CheckBox) findViewById(R.id.checkBox5);
        ChckF06 = (CheckBox) findViewById(R.id.checkBox6);
        ChckF07 = (CheckBox) findViewById(R.id.checkBox7);
        ChckF08 = (CheckBox) findViewById(R.id.checkBox8);
        ChckF09 = (CheckBox) findViewById(R.id.checkBox9);
        ChckF10 = (CheckBox) findViewById(R.id.checkBox10);
        ChckF11 = (CheckBox) findViewById(R.id.checkBox11);
        ChckF12 = (CheckBox) findViewById(R.id.checkBox12);
        ChckF13 = (CheckBox) findViewById(R.id.checkBox13);
        ChckF14 = (CheckBox) findViewById(R.id.checkBox14);
        ChckF15 = (CheckBox) findViewById(R.id.checkBox15);
        ChckF16 = (CheckBox) findViewById(R.id.checkBox16);
        ChckF17 = (CheckBox) findViewById(R.id.checkBox17);
        ChckF18 = (CheckBox) findViewById(R.id.checkBox18);
        ChckF19 = (CheckBox) findViewById(R.id.checkBox19);

        btnMulaiAnalisis = (Button) findViewById(R.id.button80);
//        tvOutputJenisPelanggaran1 = (TextView) findViewById(R.id.textView76);
//        tvOutputJenisPelanggaran2 = (TextView) findViewById(R.id.textView77);
//        tvOutputJenisPelanggaran3 = (TextView) findViewById(R.id.textView78);
//        tvOutputJenisPelanggaran4 = (TextView) findViewById(R.id.textView95);
//        tvOutputJenisPelanggaran5 = (TextView) findViewById(R.id.textView96);
//        tvOutputJenisPelanggaran6 = (TextView) findViewById(R.id.textView97);
//        tvOutputJenisPelanggaran7 = (TextView) findViewById(R.id.textView98);
//
//
//        tvOutputJenisPelanggaran1.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar
//        tvOutputJenisPelanggaran2.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Siitem Pakar
//        tvOutputJenisPelanggaran3.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar
//        tvOutputJenisPelanggaran4.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar
//        tvOutputJenisPelanggaran5.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar
//        tvOutputJenisPelanggaran6.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar
//        tvOutputJenisPelanggaran7.setText(""); // Kosongkan textView / Jenis Pelanggaran Saat membuka program Sistem Pakar

        btnMulaiAnalisis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String JenisPelanggaran = "Melanggar Tindak Pidana Korupsi Jenis :";

                if (ChckF01.isChecked() ){
                    mb1=mb1+0.9;
                    md1=md1+0.1;
                    mb2=mb2+0.9;
                    md2=md2+0.1;
                    mb3=mb3+0.9;
                    md3=md3+0.1;
                    mb4=mb4+0.9;
                    md4=md4+0.1;
                    mb5=mb5+0.9;
                    md5=md5+0.1;
                    mb6=mb6+0.9;
                    md6=md6+0.1;
                    mb7=mb7+0.9;
                    md7=md7+0.1;
                }

                if (ChckF02.isChecked() ){
                    mb1=mb1+0.6;
                    md1=md1+0.2;
                    mb2=mb2+0.6;
                    md2=md2+0.2;
                    mb3=mb3+0.6;
                    md3=md3+0.2;
                    mb4=mb4+0.6;
                    md4=md4+0.2;
                    mb5=mb5+0.6;
                    md5=md5+0.2;
                    mb6=mb6+0.6;
                    md6=md6+0.2;
                    mb7=mb7+0.6;
                    md7=md7+0.2;
                }

                if (ChckF03.isChecked() ){
                    mb1=mb1+0.8;
                    md1=md1+0.1;
                }

                if (ChckF04.isChecked() ){
                    mb2=mb2+0.8;
                    md2=md2+0.2;
                }

                if (ChckF05.isChecked() ){
                    mb4=mb4+0.6;
                    md4=md4+0.4;
                }

                if (ChckF06.isChecked() ){
                    mb7=mb7+0.8;
                    md7=md7+0.1;
                }

                if (ChckF07.isChecked() ){
                    mb6=mb6+0.8;
                    md6=md6+0.1;
                }

                if (ChckF08.isChecked() ){
                    mb5=mb5+0.6;
                    md5=md5+0.4;
                }

                if (ChckF09.isChecked() ){
                    mb3=mb3+0.8;
                    md3=md3+0.1;
                }

                if (ChckF10.isChecked() ){
                    mb1=mb1+0.7;
                    md1=md1+0.2;
                }

                if (ChckF11.isChecked() ){
                    mb1=mb1+0.7;
                    md1=md1+0.2;
                    mb2=mb2+0.9;
                    md2=md2+0.1;
                    mb3=mb3+0.9;
                    md3=md3+0.1;
                    mb4=mb4+0.9;
                    md4=md4+0.1;
                    mb5=mb5+0.9;
                    md5=md5+0.1;
                    mb6=mb6+0.9;
                    md6=md6+0.1;
                    mb7=mb7+0.9;
                    md7=md7+0.1;
                }

                if (ChckF12.isChecked() ){
                    mb1=mb1+0.8;
                    md1=md1+0.1;
                }

                if (ChckF13.isChecked() ){
                    mb2=mb2+0.8;
                    md2=md2+0.1;
                }

                if (ChckF14.isChecked() ){
                    mb2=mb2+0.7;
                    md2=md2+0.2;
                }

                if (ChckF15.isChecked() ){
                    mb3=mb3+0.6;
                    md3=md3+0.2;
                }

                if (ChckF16.isChecked() ){
                    mb4=mb4+0.7;
                    md4=md4+0.2;
                }

                if (ChckF17.isChecked() ){
                    mb6=mb6+0.7;
                    md6=md6+0.2;
                }

                if (ChckF18.isChecked() ){
                    mb7=mb7+0.6;
                    md7=md7+0.2;
                }

                if (ChckF19.isChecked() ){
                    mb7=mb7+0.7;
                    md7=md7+0.2;
                }else{

                    JenisPelanggaran += "\nTidak terdeteksi";
//                    tvOutputJenisPelanggaran1.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran2.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran3.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran4.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran5.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran6.setText("" + JenisPelanggaran);
//                    tvOutputJenisPelanggaran7.setText("" + JenisPelanggaran);

                }
                skor1=mb1-md1;
                skor2=mb2-md2;
                skor3=mb3-md3;
                skor4=mb4-md4;
                skor5=mb5-md5;
                skor6=mb6-md6;
                skor7=mb7-md7;

                String kasus1 = String.valueOf(skor1);
                String kasus2 = String.valueOf(skor2);
                String kasus3 = String.valueOf(skor3);
                String kasus4 = String.valueOf(skor4);
                String kasus5 = String.valueOf(skor5);
                String kasus6 = String.valueOf(skor6);
                String kasus7 = String.valueOf(skor7);

                Intent s = new Intent(analisaActivity.this,hasilActivity.class);
                s.putExtra("kasus1",kasus1);
                s.putExtra("kasus2",kasus2);
                s.putExtra("kasus3",kasus3);
                s.putExtra("kasus4",kasus4);
                s.putExtra("kasus5",kasus5);
                s.putExtra("kasus6",kasus6);
                s.putExtra("kasus7",kasus7);
                startActivity(s);

//                // Tampilkan Hasil Jenis Pelanggaran di textView
//                tvOutputJenisPelanggaran1.setText("Merugikan Keuangan Negara ="+String.valueOf(skor1));
//                tvOutputJenisPelanggaran2.setText("Penyuapan ="+String.valueOf(skor2));
//                tvOutputJenisPelanggaran3.setText("Penggelapan Dana Jabatan =" +String.valueOf(skor3));
//                tvOutputJenisPelanggaran4.setText("Pemerasan =" +String.valueOf(skor4));
//                tvOutputJenisPelanggaran5.setText("Perbuatan Curang ="+String.valueOf(skor5));
//                tvOutputJenisPelanggaran6.setText("Kepentingan Dalam Pengadaan =" +String.valueOf(skor6));
//                tvOutputJenisPelanggaran7.setText("Gratifikasi =" +String.valueOf(skor7));

            }

        });
    }

}
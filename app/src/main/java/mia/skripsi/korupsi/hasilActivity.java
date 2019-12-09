package mia.skripsi.korupsi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class hasilActivity extends AppCompatActivity {

    TextView tvOutputJenisPelanggaran1,
            tvOutputJenisPelanggaran2,
            tvOutputJenisPelanggaran3,
            tvOutputJenisPelanggaran4,
            tvOutputJenisPelanggaran5,
            tvOutputJenisPelanggaran6,
            tvOutputJenisPelanggaran7;

    String hasilkasus1,
        hasilkasus2,
        hasilkasus3,
        hasilkasus4,
        hasilkasus5,
        hasilkasus6,
        hasilkasus7;

//    public static final String EXTRA_KAS1 = "extra_kas1";
//    public static final String EXTRA_KAS2 = "extra_kas2";
//    public static final String EXTRA_KAS3 = "extra_kas3";
//    public static final String EXTRA_KAS4 = "extra_kas4";
//    public static final String EXTRA_KAS5 = "extra_kas5";
//    public static final String EXTRA_KAS6 = "extra_kas6";
//    public static final String EXTRA_KAS7 = "extra_kas7";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);
        getSupportActionBar().setTitle(" Melanggaar Tindak Pidana Korupsi Jenis ");

        tvOutputJenisPelanggaran1 = (TextView) findViewById(R.id.textView99);
        hasilkasus1=getIntent().getStringExtra("kasus1");
        tvOutputJenisPelanggaran1.setText("hasilkasus1");

        tvOutputJenisPelanggaran2 = (TextView) findViewById(R.id.textView100);
        hasilkasus2=getIntent().getStringExtra("kasus2");
        tvOutputJenisPelanggaran2.setText("hasilkasus2");

        tvOutputJenisPelanggaran3 = (TextView) findViewById(R.id.textView101);
        hasilkasus3=getIntent().getStringExtra("kasus3");
        tvOutputJenisPelanggaran3.setText("hasilkasus3");

        tvOutputJenisPelanggaran4 = (TextView) findViewById(R.id.textView102);
        hasilkasus4=getIntent().getStringExtra("kasus4");
        tvOutputJenisPelanggaran4.setText("hasilkasus4");

        tvOutputJenisPelanggaran5 = (TextView) findViewById(R.id.textView103);
        hasilkasus5=getIntent().getStringExtra("kasus5");
        tvOutputJenisPelanggaran5.setText("hasilkasus5");

        tvOutputJenisPelanggaran6 = (TextView) findViewById(R.id.textView104);
        hasilkasus6=getIntent().getStringExtra("kasus6");
        tvOutputJenisPelanggaran6.setText("hasilkasus6");

        tvOutputJenisPelanggaran7 = (TextView) findViewById(R.id.textView105);
        hasilkasus7=getIntent().getStringExtra("kasus7");
        tvOutputJenisPelanggaran7.setText("hasilkasus7");

    }
}

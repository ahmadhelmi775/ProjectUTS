package org.ahmadhelmiyahya775.MathForFun;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class HasilKuis extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_kuis);

        TextView hasil = (TextView) findViewById(R.id.hasil);
        TextView nilai = (TextView) findViewById(R.id.nilai);

        hasil.setText("Jawaban Benar :" + KuisMain.benar + "\nJawaban Salah :" + KuisMain.salah);
        nilai.setText("" + KuisMain.hasil);
    }

    public void ulangi(View view) {
        finish();
        Intent a = new Intent(getApplicationContext(), KuisMain.class);
        startActivity(a);
    }
}


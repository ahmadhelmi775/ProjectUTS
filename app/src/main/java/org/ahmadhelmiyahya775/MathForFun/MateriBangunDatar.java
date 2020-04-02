package org.ahmadhelmiyahya775.MathForFun;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MateriBangunDatar extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_bangun_datar);

        Intent intent = getIntent();
        final String namaBangunDatar = intent.getExtras().getString("namaBangunDatar");
        final String descBangunDatar = intent.getExtras().getString("descBangunDatar");
        final int whiteThumbBangunDatar = intent.getExtras().getInt("whiteThumbBangunDatar");
        final String luasBangunDatar = intent.getExtras().getString("luasBangunDatar");
        final String kelilingBangunDatar = intent.getExtras().getString("kelilingBangunDatar");
        final int imageRumusBangunDatar = intent.getExtras().getInt("rumusBangunDatar");

        TextView namaMateriBangunDatar = (TextView)findViewById(R.id.namaMateriBangunDatar);
        ImageView thumbMateriBangunDatar = (ImageView)findViewById(R.id.imageMateriBangunDatar);
        TextView descMateriBangunDatar = (TextView)findViewById(R.id.descBangunDatar);
        TextView materiLuasBangunDatar = (TextView)findViewById(R.id.textLuasBangunDatar);
        TextView materiKelilingBangunDatar = (TextView)findViewById(R.id.textKelilingBangunDatar);
        ImageView materiRumusBangunDatar = (ImageView)findViewById(R.id.imageRumusBangunDatar);

        namaMateriBangunDatar.setText(namaBangunDatar);
        thumbMateriBangunDatar.setImageResource(whiteThumbBangunDatar);
        descMateriBangunDatar.setText(descBangunDatar);
        materiKelilingBangunDatar.setText(kelilingBangunDatar);
        materiLuasBangunDatar.setText(luasBangunDatar);
        materiRumusBangunDatar.setImageResource(imageRumusBangunDatar);

        FloatingActionButton fabback = findViewById(R.id.fabBack);
        fabback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(getApplicationContext(), BangunDatar.class);
                startActivity(intent2);
            }
        });
        FloatingActionButton fabcalc = findViewById(R.id.fabKalkulator);
        fabcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), KalkulatorBangunDatar.class);
                intent.putExtra("namaBangunDatar", namaBangunDatar);
                intent.putExtra("whiteThumbBangunDatar", whiteThumbBangunDatar);
                intent.putExtra("descBangunDatar", descBangunDatar);
                intent.putExtra("kelilingBangunDatar", kelilingBangunDatar);
                intent.putExtra("luasBangunDatar", luasBangunDatar);
                intent.putExtra("rumusBangunDatar", imageRumusBangunDatar);

                startActivity(intent);

            }
        });
    }
}

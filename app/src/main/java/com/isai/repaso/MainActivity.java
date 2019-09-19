package com.isai.repaso;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String colorHex = "#000080";
    View colorSample;
    TextView color_textView;

    private SeekBar rColor;
    private SeekBar gColor;
    private SeekBar bColor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colorSample = findViewById(R.id.colorSample);
        colorSample.setBackgroundColor(Color.parseColor(colorHex));
        color_textView = findViewById(R.id.color_textView);

        rColor = findViewById(R.id.rColor);
        gColor = findViewById(R.id.gColor);
        bColor = findViewById(R.id.bColor);


        this.rColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String Hex = "#" +
                        ColorUtils.decimalToHex(rColor.getProgress()) +
                        ColorUtils.decimalToHex(gColor.getProgress()) +
                        ColorUtils.decimalToHex(bColor.getProgress());

                colorSample.setBackgroundColor(Color.parseColor(Hex));
                color_textView.setText(Hex);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        this.gColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String Hex = "#" +
                        ColorUtils.decimalToHex(rColor.getProgress()) +
                        ColorUtils.decimalToHex(gColor.getProgress()) +
                        ColorUtils.decimalToHex(bColor.getProgress());

                colorSample.setBackgroundColor(Color.parseColor(Hex));
                color_textView.setText(Hex);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        this.bColor.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                String Hex = "#" +
                        ColorUtils.decimalToHex(rColor.getProgress()) +
                        ColorUtils.decimalToHex(gColor.getProgress()) +
                        ColorUtils.decimalToHex(bColor.getProgress());

                colorSample.setBackgroundColor(Color.parseColor(Hex));
                color_textView.setText(Hex);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    this.rColor.setMax(255);
    this.rColor.setMax(255);
    this.rColor.setMax(255);





    }
}

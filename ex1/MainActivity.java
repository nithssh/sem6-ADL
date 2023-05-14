package com.example.myapplication1;

import android.graphics.Color;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    protected EditTexturtext;
    protected Button urfont;
    protected Button urcolor;
    int i = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        urtext = (EditText) findViewById(R.id.editText);
        urfont = (Button) findViewById(R.id.button);
        urcolor = (Button) findViewById(R.id.button2);

        urfont.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                urtext.setTextSize(10);
            }
        });

        urcolor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 1:
                        urtext.setTextColor(Color.CYAN);
                        break;
                    case 2:
                        urtext.setTextColor(Color.BLUE);
                        break;
                    case 3:
                        urtext.setTextColor(Color.GREEN);
                        break;
                    case 4:
                        urtext.setTextColor(Color.RED);
                        break;
                    case 5:
                        urtext.setTextColor(Color.MAGENTA);
                        break;
                }
            }
        });
    }
}

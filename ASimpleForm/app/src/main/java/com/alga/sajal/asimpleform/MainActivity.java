package com.alga.sajal.asimpleform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

private EditText name,addr;
private Button save;
private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name=findViewById(R.id.name);
        addr=findViewById(R.id.addr);
        save=findViewById(R.id.save);
        show=findViewById(R.id.show);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String part1=name.getText().toString();
                String part2=addr.getText().toString();

                show.setText(part1+" lives in "+part2);
            }
        });
    }
}

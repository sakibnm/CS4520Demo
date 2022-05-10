package space.sakibnm.videodemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    Button buttonSecond;
    TextView textViewSecond;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonSecond = findViewById(R.id.button);
        setTitle("Second Activity");
        textViewSecond = findViewById(R.id.textView2);

        if(getIntent()!=null && getIntent().getExtras() != null){
            String name = getIntent().getStringExtra("from1to2");
            textViewSecond.setText(name);
        }

        buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
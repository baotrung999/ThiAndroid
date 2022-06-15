package thi.Bai1.thidd_bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtName;
    Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStart.setOnClickListener(this);
    }
    public void onClick(View v) {
        String sA = edtName.getText().toString();
        btnStart = (Button) findViewById(R.id.buttonstart);
        Toast toast=Toast.makeText(MainActivity.this,"edtName",Toast.LENGTH_LONG);
        toast.show();
    }
}
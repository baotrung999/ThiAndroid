package thi.bai2.thidd_bai2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{

    RadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    private String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        radioButton1 = (RadioButton)findViewById(R.id.radioButton);
        
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        
        radioButton4 = (RadioButton)findViewById(R.id.radioButton4);
        
    }


    private void GameOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(StartActivity.this);
        alertDialogBuilder
                .setMessage("Game Over")
                .setCancelable(false)
                .setPositiveButton("New Game", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    }
                })
                .setNegativeButton("Exit", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        System.exit(0);
                    }
                });
        alertDialogBuilder.show();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.radioButton:
                if(radioButton1.getText() == answer){
                    Toast.makeText(StartActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                }else{
                    GameOver();
                }

                break;

            case R.id.radioButton2:
                if(radioButton2.getText() == answer){
                    Toast.makeText(StartActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                    
                }else{
                    GameOver();
                }

                break;

            case R.id.radioButton3:
                if(radioButton3.getText() == answer){
                    Toast.makeText(StartActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                }else{
                    GameOver();
                }

                break;

            case R.id.radioButton4:
                if(radioButton4.getText() == answer){
                    Toast.makeText(StartActivity.this, "You Are Correct", Toast.LENGTH_SHORT).show();
                }else{
                    GameOver();
                }

                break;
        }
    }
}
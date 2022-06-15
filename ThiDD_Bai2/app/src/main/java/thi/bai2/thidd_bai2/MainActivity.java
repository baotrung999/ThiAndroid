package thi.bai2.thidd_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ChuyenManHinh (View v) {
        // Tạo một đối tượng Intent
        // Tham số thứ 2 của hàm tạo này, là tên Activity (màn hình) ta muốn chuyến
        Intent iManHinhkhac = new Intent(  this, StartActivity.class);
        // Thực hiện chuyến
        startActivity(iManHinhkhac);
    }
}
package thi.bai2.thidd_bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<BaiHat> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new MyArrayAdapter(this,image_details));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                BaiHat diadiem = (BaiHat) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + diadiem, Toast.LENGTH_LONG).show();
            }
        });
    }

    //tạo danh sách
    private  List<BaiHat> getListData() {
        List<BaiHat> list = new ArrayList<BaiHat>();
        BaiHat khanhhoa = new BaiHat("spa","star");
        BaiHat hanoi = new BaiHat("Hà Nội","earth");
        BaiHat vungtau = new BaiHat("Vũng Tàu","earth");
        BaiHat conson = new BaiHat("Côn Sơn","earth");
        BaiHat danang = new BaiHat("Đà Nẵng","earth");
        BaiHat hue = new BaiHat("Huế", "star");

        list.add(khanhhoa);
        list.add(hanoi);
        list.add(vungtau);
        list.add(conson);
        list.add(hue);
        list.add(danang);
        return list;
    }
}
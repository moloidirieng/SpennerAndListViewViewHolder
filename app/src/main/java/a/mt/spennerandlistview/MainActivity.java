package a.mt.spennerandlistview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner spnQuocgia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addControls();
        addEvents();
    }

    private void addEvents() {
    }

    private void addControls() {
        spnQuocgia=findViewById(R.id.spnQuocGia);

        ArrayList<QuocGia> dsQuocGia=new ArrayList();
        dsQuocGia.add(new QuocGia("Mỹ",1000,R.drawable.us));
        dsQuocGia.add(new QuocGia("Nhật",1001,R.drawable.jap));
        dsQuocGia.add(new QuocGia("China",1002,R.drawable.china));
        dsQuocGia.add(new QuocGia("Canada",1003,R.drawable.cad));
        dsQuocGia.add(new QuocGia("EU",1004,R.drawable.eur));
        dsQuocGia.add(new QuocGia("Autralia",1004,R.drawable.aud));


        AdapterQuocGia adapterQuocGia=new AdapterQuocGia(this,R.layout.dong_quoc_gia,dsQuocGia);
       //spnQuocgia.setDropDownView;
        spnQuocgia.setAdapter(adapterQuocGia);



    }
}

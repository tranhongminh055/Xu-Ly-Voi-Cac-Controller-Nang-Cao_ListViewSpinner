package com.example.xulygiaodienvoicaccontrolnangcaolistview_spinner;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends Activity {
    TextView txt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        txt1 = findViewById(R.id.selection);

        //1. khoi tao du lieu cho mang arr (con goi la data source)
        final String[] arr1 = {"Iphone 7", "SamSung Galaxy S7",
                "Nokia Lumia 730", "Sony Xperia XZ", "HTC One E9"};

        //2. Khai bao Adapter va gan Data Source vao ArrayAdapter
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, arr1);

        //3. khai bao ListView va dua Adapter vao ListView
        ListView lv1 = findViewById(R.id.lv1);
        lv1.setAdapter(adapter1);

        //4. Viet su kien khi click vao 1 dong tren ListView
        lv1.setOnItemClickListener((parent, view, position, id) -> {
            // Use translatable string resource with placeholders instead of concatenation
            txt1.setText(getString(R.string.vi_tri_format, position, arr1[position]));
        });

    }
}
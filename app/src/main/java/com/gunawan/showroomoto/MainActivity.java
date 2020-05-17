package com.gunawan.showroomoto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvOto;
    private ArrayList<Oto> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvOto = findViewById(R.id.rv_otoes);
        rvOto.setHasFixedSize(true);

        list.addAll(OtoesData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvOto.setLayoutManager(new LinearLayoutManager(this));
        ListOtoAdapter listOtoAdapter = new ListOtoAdapter(list);
        rvOto.setAdapter(listOtoAdapter);
    }

}

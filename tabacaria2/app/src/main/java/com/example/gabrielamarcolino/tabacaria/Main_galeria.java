package com.example.gabrielamarcolino.tabacaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class Main_galeria extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_galeria);

        //definir o plano de fundo da barra de status para transparente

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        //reciclagem de instalação com o adaptador

        RecyclerView recyclerView =findViewById(R.id.rv_list);
        List<Item_galeria> mlist = new ArrayList<>();

        mlist.add(new Item_galeria(R.drawable.minafumando));
        mlist.add(new Item_galeria(R.drawable.ambiente));
        mlist.add(new Item_galeria(R.drawable.fuma));
        mlist.add(new Item_galeria(R.drawable.galeria));
        mlist.add(new Item_galeria(R.drawable.minafumaca));
        mlist.add(new Item_galeria(R.drawable.ambiente2));
        mlist.add(new Item_galeria(R.drawable.povo));
        mlist.add(new Item_galeria(R.drawable.minafumaca2));

        Adapter_galeria adapter = new Adapter_galeria(this,mlist);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}

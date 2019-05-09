package com.example.gabrielamarcolino.intro;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class introActivity extends AppCompatActivity {

    private ViewPager screenPager;
    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;
    Button btnProximo;
    int position = 0;
    Button btnGetStarted;
    Animation btnAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        // INICIALIZANDO AS VIEWS
            btnProximo = findViewById(R.id.btn_proximo);
            btnGetStarted = findViewById(R.id.btn_getStarted);
            tabIndicator = findViewById(R.id.tab_indicator);
            btnAnim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_animation);

            //PREENCHENDO A LISTA
        final List<ScreenItem>  mList = new ArrayList<>();
        mList.add(new ScreenItem("Comida fresca","Do mesmo modo, a crescente influência da mídia auxilia a preparação e a composição do remanejamento dos quadros funcionais.", R.drawable.img1));
        mList.add(new ScreenItem("Entrega","Ainda assim, existem dúvidas a respeito de como a mobilidade dos capitais internacionais oferece uma interessante oportunidade para verificação do retorno esperado a longo prazo.", R.drawable.img2));
        mList.add(new ScreenItem("Pagamento","Do mesmo modo, o surgimento do comércio virtual agrega valor ao estabelecimento das formas de ação.", R.drawable.img3));
        mList.add(new ScreenItem("Acessar","Clique no botão Começar para as funcionalidades", R.drawable.img1));

        // SETANDO O VIEW PAGER
        screenPager = findViewById(R.id.screen_viewpager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, mList);
        screenPager.setAdapter(introViewPagerAdapter);

        //SETANDO O TABLAYOUT COM O VIEWPAGER
        tabIndicator.setupWithViewPager(screenPager);

        //CONFIGURANDO O BOTÃO PRÓXIMO
        btnProximo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                position = screenPager.getCurrentItem();
                if (position < mList.size()) {

                    position++;
                    screenPager.setCurrentItem(position);
                }

                if (position == mList.size() - 1) {
                    //loadLastScreen();
                }
            }
        });

        //TABLAYOUT CHANGE LISTENER
        tabIndicator.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (tab.getPosition() == mList.size() -1){
                    //loadLastScreen();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {}

            @Override
            public void onTabReselected(TabLayout.Tab tab) {}
        });



    }
}

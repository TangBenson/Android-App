package com.example.hibenson;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Dictionary;
import java.util.HashSet;
import java.util.Hashtable;

public class MainActivity extends AppCompatActivity {
    private TextView num1,num2,num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.n1);
        num2 = findViewById(R.id.n2);
        num3 = findViewById(R.id.n3);
    }


    public void lunch(View view) {
        HashSet<Integer> set = new HashSet<>();
        Dictionary<Integer,String> dict = new Hashtable<>();
        dict.put(1,"宜亨齋");
        dict.put(2,"subway");
        dict.put(3,"郵局對面便當店");
        dict.put(4,"初一食五");
        dict.put(5,"長榮對面自助餐");
        dict.put(6,"長榮旁早餐店");
        dict.put(7,"阿英越南");
        dict.put(8,"遠遠的自助餐");
        dict.put(9,"髒麵攤");
        dict.put(10,"摩斯");
        dict.put(11,"麥味登");
        dict.put(12,"遠遠的雞肉飯");
        dict.put(13,"高麗菜飯");
        dict.put(14,"永和豆漿");
        dict.put(15,"不吃減肥");
        while (set.size()<3){
            set.add((int)(Math.random()*15+1));
        }
        int i=0;
        String[] lunches = new String[3];
        for(Integer num:set){
            lunches[i] = dict.get(num);
            i++;
        }
        num1.setText(lunches[0]);
        num2.setText(lunches[1]);
        num3.setText(lunches[2]);
    }
}
package com.fabiosilva.ideuidesigner;

import android.os.Bundle;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.os.Vibrator;
import android.content.Context;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;
import android.graphics.Color;
import android.os.Build;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class StudioActivity extends AppCompatActivity
{
    private Toolbar toolbar;
    private LinearLayout linear3;
    private LinearLayout linear_de_baixo;
    private LinearLayout linear5;
    private LinearLayout linear6;
    private LinearLayout linear9;
    private ScrollView vscroll1;
    private LinearLayout linear10;
    private LinearLayout linear11;
    private LinearLayout linear99;
    private LinearLayout linear66;
    private LinearLayout linear67;
    private LinearLayout linear68;
    private LinearLayout linear70;
    private LinearLayout linear100;
    private LinearLayout linear101;
    private LinearLayout linear141;
    private LinearLayout linear142;
    private LinearLayout linear28;
    private TextView textview72;
    private LinearLayout linear145;
    private LinearLayout linear146;
    private LinearLayout linear147;
    private LinearLayout linear148;
    private ImageView imageview104;
    private TextView textview116;
    private ImageView imageview105;
    private TextView textview117;
    private ImageView imageview106;
    private TextView textview118;
    private ImageView imageview107;
    private TextView textview119;
    private TextView apagar;
    private LinearLayout linear29;
    private LinearLayout linear30;
    private LinearLayout linear31;
    private LinearLayout linear32;
    private ImageView imageview1;
    private TextView textview1;
    private ImageView imageview2;
    private TextView textview2;
    private ImageView imageview3;
    private TextView textview3;
    private ImageView imageview4;
    private TextView textview4;
    private TextView textview21;
    private LinearLayout linear34;
    private LinearLayout linear35;
    private LinearLayout linear36;
    private LinearLayout linear37;
    private LinearLayout linear38;
    private LinearLayout linear39;
    private LinearLayout linear46;
    private ImageView imageview6;
    private TextView textview6;
    private ImageView imageview7;
    private TextView textview7;
    private ImageView imageview8;
    private TextView textview8;
    private ImageView imageview9;
    private TextView textview9;
    private ImageView imageview10;
    private TextView textview10;
    private ImageView imageview11;
    private TextView textview11;
    private ImageView imageview18;
    private TextView textview18;
    private TextView textview24;
    private LinearLayout linear40;
    private LinearLayout linear41;
    private LinearLayout linear42;
    private LinearLayout linear43;
    private LinearLayout linear44;
    private LinearLayout linear45;
    private LinearLayout linear47;
    private LinearLayout linear48;
    private LinearLayout linear51;
    private LinearLayout linear52;
    private LinearLayout linear53;
    private LinearLayout linear54;
    private LinearLayout linear55;
    private LinearLayout linear56;
    private LinearLayout linear57;
    private LinearLayout linear71;
    private LinearLayout linear72;
    private ImageView imageview12;
    private TextView textview12;
    private ImageView imageview13;
    private TextView textview13;
    private ImageView imageview14;
    private TextView textview14;
    private ImageView imageview15;
    private TextView textview15;
    private ImageView imageview16;
    private TextView textview16;
    private ImageView imageview17;
    private TextView textview17;
    private ImageView imageview19;
    private TextView textview19;
    private ImageView imageview20;
    private TextView textview20;
    private ImageView imageview23;
    private TextView textview25;
    private ImageView imageview24;
    private TextView textview26;
    private ImageView imageview25;
    private TextView textview27;
    private ImageView imageview26;
    private TextView textview28;
    private ImageView imageview27;
    private TextView textview29;
    private ImageView imageview28;
    private TextView textview30;
    private ImageView imageview29;
    private TextView textview31;
    private ImageView imageview36;
    private TextView textview40;
    private ImageView imageview37;
    private TextView textview41;
    private TextView textview53;
    private LinearLayout linear81;
    private LinearLayout linear82;
    private LinearLayout linear83;
    private LinearLayout linear84;
    private LinearLayout linear85;
    private LinearLayout linear86;
    private LinearLayout linear87;
    private LinearLayout linear88;
    private LinearLayout linear89;
    private LinearLayout linear90;
    private LinearLayout linear91;
    private LinearLayout linear92;
    private ImageView imageview46;
    private TextView textview51;
    private ImageView imageview47;
    private TextView textview52;
    private ImageView imageview48;
    private TextView textview55;
    private ImageView imageview49;
    private TextView textview56;
    private ImageView imageview50;
    private TextView textview57;
    private ImageView imageview51;
    private TextView textview58;
    private ImageView imageview52;
    private TextView textview59;
    private ImageView imageview53;
    private TextView textview60;
    private ImageView imageview54;
    private TextView textview61;
    private ImageView imageview55;
    private TextView textview62;
    private ImageView imageview56;
    private TextView textview63;
    private ImageView imageview57;
    private TextView textview64;
    private TextView textview68;
    private LinearLayout linear93;
    private LinearLayout linear94;
    private LinearLayout linear95;
    private LinearLayout linear96;
    private ImageView imageview58;
    private TextView textview65;
    private ImageView imageview59;
    private TextView textview66;
    private ImageView imageview60;
    private TextView textview67;
    private ImageView imageview61;
    private TextView textview69;
    private TextView textview54;
    private LinearLayout linear97;
    private LinearLayout linear98;
    private LinearLayout linear102;
    private LinearLayout linear103;
    private LinearLayout linear104;
    private LinearLayout linear105;
    private LinearLayout linear106;
    private LinearLayout linear107;
    private LinearLayout linear108;
    private LinearLayout linear109;
    private LinearLayout linear110;
    private LinearLayout linear111;
    private LinearLayout linear125;
    private LinearLayout linear126;
    private LinearLayout linear127;
    private LinearLayout linear128;
    private LinearLayout linear129;
    private LinearLayout linear130;
    private ImageView imageview62;
    private TextView textview70;
    private ImageView imageview63;
    private TextView textview71;
    private ImageView imageview64;
    private TextView textview73;
    private ImageView imageview65;
    private TextView textview74;
    private ImageView imageview66;
    private TextView textview75;
    private ImageView imageview67;
    private TextView textview76;
    private ImageView imageview68;
    private TextView textview77;
    private ImageView imageview69;
    private TextView textview78;
    private ImageView imageview70;
    private TextView textview79;
    private ImageView imageview71;
    private TextView textview80;
    private ImageView imageview72;
    private TextView textview81;
    private ImageView imageview73;
    private TextView textview82;
    private ImageView imageview86;
    private TextView textview96;
    private ImageView imageview87;
    private TextView textview97;
    private ImageView imageview88;
    private TextView textview98;
    private ImageView imageview89;
    private TextView textview99;
    private ImageView imageview90;
    private TextView textview100;
    private ImageView imageview91;
    private TextView textview101;
    private TextView textview102;
    private LinearLayout linear131;
    private LinearLayout linear132;
    private LinearLayout linear133;
    private LinearLayout linear134;
    private LinearLayout linear135;
    private LinearLayout linear136;
    private LinearLayout linear137;
    private LinearLayout linear138;
    private LinearLayout linear139;
    private LinearLayout linear140;
    private ImageView imageview92;
    private TextView textview103;
    private ImageView imageview93;
    private TextView textview104;
    private ImageView imageview94;
    private TextView textview105;
    private ImageView imageview95;
    private TextView textview106;
    private ImageView imageview96;
    private TextView textview107;
    private ImageView imageview97;
    private TextView textview108;
    private ImageView imageview98;
    private TextView textview109;
    private ImageView imageview99;
    private TextView textview110;
    private ImageView imageview100;
    private TextView textview111;
    private ImageView imageview101;
    private TextView textview112;
    private TextView textview113;
    private LinearLayout linear143;
    private LinearLayout linear144;
    private ImageView imageview102;
    private TextView textview114;
    private ImageView imageview103;
    private TextView textview115;
    private LinearLayout edition_area;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studio);


        findViewById(R.id.linear29).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear30).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear31).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear32).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear34).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear35).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear36).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear37).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear38).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear39).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear46).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear40).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear41).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear42).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear43).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear44).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear45).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear47).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear48).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear51).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear52).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear53).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear54).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear55).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear56).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear57).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear71).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear72).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear81).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear82).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear83).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear84).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear85).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear86).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear87).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear88).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear89).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear90).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear91).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear92).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear93).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear94).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear95).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear96).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear97).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear98).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear102).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear103).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear104).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear105).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear106).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear107).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear108).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear109).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear110).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear111).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear125).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear126).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear127).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear128).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear129).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear130).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear131).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear132).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear133).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear134).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear135).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear136).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear137).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear138).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear139).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear140).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear143).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear144).setOnTouchListener(new MyTouchListener());

        findViewById(R.id.linear145).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear146).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear147).setOnTouchListener(new MyTouchListener());
        findViewById(R.id.linear148).setOnTouchListener(new MyTouchListener());




        //Area de edicão
        findViewById(R.id.edition_area).setOnDragListener(new MyDragListener());
        //area de descarte

        linear3 = (LinearLayout) findViewById(R.id.linear3);
        linear_de_baixo = (LinearLayout) findViewById(R.id.linear_de_baixo);
        linear5 = (LinearLayout) findViewById(R.id.linear5);
        linear6 = (LinearLayout) findViewById(R.id.linear6);
        linear9 = (LinearLayout) findViewById(R.id.linear9);
        vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
        linear10 = (LinearLayout) findViewById(R.id.linear10);
        linear11 = (LinearLayout) findViewById(R.id.linear11);
        linear99 = (LinearLayout) findViewById(R.id.linear99);
        linear66 = (LinearLayout) findViewById(R.id.linear66);
        linear67 = (LinearLayout) findViewById(R.id.linear67);
        linear68 = (LinearLayout) findViewById(R.id.linear68);
        linear70 = (LinearLayout) findViewById(R.id.linear70);
        linear100 = (LinearLayout) findViewById(R.id.linear100);
        linear101 = (LinearLayout) findViewById(R.id.linear101);
        linear141 = (LinearLayout) findViewById(R.id.linear141);
        linear142 = (LinearLayout) findViewById(R.id.linear142);
        linear28 = (LinearLayout) findViewById(R.id.linear28);
        textview72 = (TextView) findViewById(R.id.textview72);
        linear145 = (LinearLayout) findViewById(R.id.linear145);
        linear146 = (LinearLayout) findViewById(R.id.linear146);
        linear147 = (LinearLayout) findViewById(R.id.linear147);
        linear148 = (LinearLayout) findViewById(R.id.linear148);
        imageview104 = (ImageView) findViewById(R.id.imageview104);
        textview116 = (TextView) findViewById(R.id.textview116);
        imageview105 = (ImageView) findViewById(R.id.imageview105);
        textview117 = (TextView) findViewById(R.id.textview117);
        imageview106 = (ImageView) findViewById(R.id.imageview106);
        textview118 = (TextView) findViewById(R.id.textview118);
        imageview107 = (ImageView) findViewById(R.id.imageview107);
        textview119 = (TextView) findViewById(R.id.textview119);
        apagar = (TextView) findViewById(R.id.apagar);
        linear29 = (LinearLayout) findViewById(R.id.linear29);
        linear30 = (LinearLayout) findViewById(R.id.linear30);
        linear31 = (LinearLayout) findViewById(R.id.linear31);
        linear32 = (LinearLayout) findViewById(R.id.linear32);
        imageview1 = (ImageView) findViewById(R.id.imageview1);
        textview1 = (TextView) findViewById(R.id.textview1);
        imageview2 = (ImageView) findViewById(R.id.imageview2);
        textview2 = (TextView) findViewById(R.id.textview2);
        imageview3 = (ImageView) findViewById(R.id.imageview3);
        textview3 = (TextView) findViewById(R.id.androidName);
        imageview4 = (ImageView) findViewById(R.id.imageview4);
        textview4 = (TextView) findViewById(R.id.textview4);
        textview21 = (TextView) findViewById(R.id.textview21);
        linear34 = (LinearLayout) findViewById(R.id.linear34);
        linear35 = (LinearLayout) findViewById(R.id.linear35);
        linear36 = (LinearLayout) findViewById(R.id.linear36);
        linear37 = (LinearLayout) findViewById(R.id.linear37);
        linear38 = (LinearLayout) findViewById(R.id.linear38);
        linear39 = (LinearLayout) findViewById(R.id.linear39);
        linear46 = (LinearLayout) findViewById(R.id.linear46);
        imageview6 = (ImageView) findViewById(R.id.imageview6);
        textview6 = (TextView) findViewById(R.id.textview6);
        imageview7 = (ImageView) findViewById(R.id.imageview7);
        textview7 = (TextView) findViewById(R.id.textview7);
        imageview8 = (ImageView) findViewById(R.id.imageview8);
        textview8 = (TextView) findViewById(R.id.textview8);
        imageview9 = (ImageView) findViewById(R.id.imageview9);
        textview9 = (TextView) findViewById(R.id.textview9);
        imageview10 = (ImageView) findViewById(R.id.imageview10);
        textview10 = (TextView) findViewById(R.id.textview10);
        imageview11 = (ImageView) findViewById(R.id.imageview11);
        textview11 = (TextView) findViewById(R.id.textview11);
        imageview18 = (ImageView) findViewById(R.id.imageview18);
        textview18 = (TextView) findViewById(R.id.textview18);
        textview24 = (TextView) findViewById(R.id.textview24);
        linear40 = (LinearLayout) findViewById(R.id.linear40);
        linear41 = (LinearLayout) findViewById(R.id.linear41);
        linear42 = (LinearLayout) findViewById(R.id.linear42);
        linear43 = (LinearLayout) findViewById(R.id.linear43);
        linear44 = (LinearLayout) findViewById(R.id.linear44);
        linear45 = (LinearLayout) findViewById(R.id.linear45);
        linear47 = (LinearLayout) findViewById(R.id.linear47);
        linear48 = (LinearLayout) findViewById(R.id.linear48);
        linear51 = (LinearLayout) findViewById(R.id.linear51);
        linear52 = (LinearLayout) findViewById(R.id.linear52);
        linear53 = (LinearLayout) findViewById(R.id.linear53);
        linear54 = (LinearLayout) findViewById(R.id.linear54);
        linear55 = (LinearLayout) findViewById(R.id.linear55);
        linear56 = (LinearLayout) findViewById(R.id.linear56);
        linear57 = (LinearLayout) findViewById(R.id.linear57);
        linear71 = (LinearLayout) findViewById(R.id.linear71);
        linear72 = (LinearLayout) findViewById(R.id.linear72);
        imageview12 = (ImageView) findViewById(R.id.imageview12);
        textview12 = (TextView) findViewById(R.id.textview12);
        imageview13 = (ImageView) findViewById(R.id.imageview13);
        textview13 = (TextView) findViewById(R.id.textview13);
        imageview14 = (ImageView) findViewById(R.id.imageview14);
        textview14 = (TextView) findViewById(R.id.textview14);
        imageview15 = (ImageView) findViewById(R.id.imageview15);
        textview15 = (TextView) findViewById(R.id.textview15);
        imageview16 = (ImageView) findViewById(R.id.imageview16);
        textview16 = (TextView) findViewById(R.id.textview16);
        imageview17 = (ImageView) findViewById(R.id.imageview17);
        textview17 = (TextView) findViewById(R.id.textview17);
        imageview19 = (ImageView) findViewById(R.id.imageview19);
        textview19 = (TextView) findViewById(R.id.textview19);
        imageview20 = (ImageView) findViewById(R.id.imageview20);
        textview20 = (TextView) findViewById(R.id.textview20);
        imageview23 = (ImageView) findViewById(R.id.imageview23);
        textview25 = (TextView) findViewById(R.id.textview25);
        imageview24 = (ImageView) findViewById(R.id.imageview24);
        textview26 = (TextView) findViewById(R.id.textview26);
        imageview25 = (ImageView) findViewById(R.id.imageview25);
        textview27 = (TextView) findViewById(R.id.textview27);
        imageview26 = (ImageView) findViewById(R.id.imageview26);
        textview28 = (TextView) findViewById(R.id.textview28);
        imageview27 = (ImageView) findViewById(R.id.imageview27);
        textview29 = (TextView) findViewById(R.id.textview29);
        imageview28 = (ImageView) findViewById(R.id.imageview28);
        textview30 = (TextView) findViewById(R.id.textview30);
        imageview29 = (ImageView) findViewById(R.id.imageview29);
        textview31 = (TextView) findViewById(R.id.textview31);
        imageview36 = (ImageView) findViewById(R.id.imageview36);
        textview40 = (TextView) findViewById(R.id.textview40);
        imageview37 = (ImageView) findViewById(R.id.imageview37);
        textview41 = (TextView) findViewById(R.id.textview41);
        textview53 = (TextView) findViewById(R.id.textview53);
        linear81 = (LinearLayout) findViewById(R.id.linear81);
        linear82 = (LinearLayout) findViewById(R.id.linear82);
        linear83 = (LinearLayout) findViewById(R.id.linear83);
        linear84 = (LinearLayout) findViewById(R.id.linear84);
        linear85 = (LinearLayout) findViewById(R.id.linear85);
        linear86 = (LinearLayout) findViewById(R.id.linear86);
        linear87 = (LinearLayout) findViewById(R.id.linear87);
        linear88 = (LinearLayout) findViewById(R.id.linear88);
        linear89 = (LinearLayout) findViewById(R.id.linear89);
        linear90 = (LinearLayout) findViewById(R.id.linear90);
        linear91 = (LinearLayout) findViewById(R.id.linear91);
        linear92 = (LinearLayout) findViewById(R.id.linear92);
        imageview46 = (ImageView) findViewById(R.id.imageview46);
        textview51 = (TextView) findViewById(R.id.textview51);
        imageview47 = (ImageView) findViewById(R.id.imageview47);
        textview52 = (TextView) findViewById(R.id.textview52);
        imageview48 = (ImageView) findViewById(R.id.imageview48);
        textview55 = (TextView) findViewById(R.id.textview55);
        imageview49 = (ImageView) findViewById(R.id.imageview49);
        textview56 = (TextView) findViewById(R.id.textview56);
        imageview50 = (ImageView) findViewById(R.id.imageview50);
        textview57 = (TextView) findViewById(R.id.textview57);
        imageview51 = (ImageView) findViewById(R.id.imageview51);
        textview58 = (TextView) findViewById(R.id.textview58);
        imageview52 = (ImageView) findViewById(R.id.imageview52);
        textview59 = (TextView) findViewById(R.id.textview59);
        imageview53 = (ImageView) findViewById(R.id.imageview53);
        textview60 = (TextView) findViewById(R.id.textview60);
        imageview54 = (ImageView) findViewById(R.id.imageview54);
        textview61 = (TextView) findViewById(R.id.textview61);
        imageview55 = (ImageView) findViewById(R.id.imageview55);
        textview62 = (TextView) findViewById(R.id.textview62);
        imageview56 = (ImageView) findViewById(R.id.imageview56);
        textview63 = (TextView) findViewById(R.id.textview63);
        imageview57 = (ImageView) findViewById(R.id.imageview57);
        textview64 = (TextView) findViewById(R.id.textview64);
        textview68 = (TextView) findViewById(R.id.textview68);
        linear93 = (LinearLayout) findViewById(R.id.linear93);
        linear94 = (LinearLayout) findViewById(R.id.linear94);
        linear95 = (LinearLayout) findViewById(R.id.linear95);
        linear96 = (LinearLayout) findViewById(R.id.linear96);
        imageview58 = (ImageView) findViewById(R.id.imageview58);
        textview65 = (TextView) findViewById(R.id.textview65);
        imageview59 = (ImageView) findViewById(R.id.imageview59);
        textview66 = (TextView) findViewById(R.id.textview66);
        imageview60 = (ImageView) findViewById(R.id.imageview60);
        textview67 = (TextView) findViewById(R.id.textview67);
        imageview61 = (ImageView) findViewById(R.id.imageview61);
        textview69 = (TextView) findViewById(R.id.textview69);
        textview54 = (TextView) findViewById(R.id.textview54);
        linear97 = (LinearLayout) findViewById(R.id.linear97);
        linear98 = (LinearLayout) findViewById(R.id.linear98);
        linear102 = (LinearLayout) findViewById(R.id.linear102);
        linear103 = (LinearLayout) findViewById(R.id.linear103);
        linear104 = (LinearLayout) findViewById(R.id.linear104);
        linear105 = (LinearLayout) findViewById(R.id.linear105);
        linear106 = (LinearLayout) findViewById(R.id.linear106);
        linear107 = (LinearLayout) findViewById(R.id.linear107);
        linear108 = (LinearLayout) findViewById(R.id.linear108);
        linear109 = (LinearLayout) findViewById(R.id.linear109);
        linear110 = (LinearLayout) findViewById(R.id.linear110);
        linear111 = (LinearLayout) findViewById(R.id.linear111);
        linear125 = (LinearLayout) findViewById(R.id.linear125);
        linear126 = (LinearLayout) findViewById(R.id.linear126);
        linear127 = (LinearLayout) findViewById(R.id.linear127);
        linear128 = (LinearLayout) findViewById(R.id.linear128);
        linear129 = (LinearLayout) findViewById(R.id.linear129);
        linear130 = (LinearLayout) findViewById(R.id.linear130);
        imageview62 = (ImageView) findViewById(R.id.imageview62);
        textview70 = (TextView) findViewById(R.id.textview70);
        imageview63 = (ImageView) findViewById(R.id.imageview63);
        textview71 = (TextView) findViewById(R.id.textview71);
        imageview64 = (ImageView) findViewById(R.id.imageview64);
        textview73 = (TextView) findViewById(R.id.textview73);
        imageview65 = (ImageView) findViewById(R.id.imageview65);
        textview74 = (TextView) findViewById(R.id.textview74);
        imageview66 = (ImageView) findViewById(R.id.imageview66);
        textview75 = (TextView) findViewById(R.id.textview75);
        imageview67 = (ImageView) findViewById(R.id.imageview67);
        textview76 = (TextView) findViewById(R.id.textview76);
        imageview68 = (ImageView) findViewById(R.id.imageview68);
        textview77 = (TextView) findViewById(R.id.textview77);
        imageview69 = (ImageView) findViewById(R.id.imageview69);
        textview78 = (TextView) findViewById(R.id.textview78);
        imageview70 = (ImageView) findViewById(R.id.imageview70);
        textview79 = (TextView) findViewById(R.id.textview79);
        imageview71 = (ImageView) findViewById(R.id.imageview71);
        textview80 = (TextView) findViewById(R.id.textview80);
        imageview72 = (ImageView) findViewById(R.id.imageview72);
        textview81 = (TextView) findViewById(R.id.textview81);
        imageview73 = (ImageView) findViewById(R.id.imageview73);
        textview82 = (TextView) findViewById(R.id.textview82);
        imageview86 = (ImageView) findViewById(R.id.imageview86);
        textview96 = (TextView) findViewById(R.id.textview96);
        imageview87 = (ImageView) findViewById(R.id.imageview87);
        textview97 = (TextView) findViewById(R.id.textview97);
        imageview88 = (ImageView) findViewById(R.id.imageview88);
        textview98 = (TextView) findViewById(R.id.textview98);
        imageview89 = (ImageView) findViewById(R.id.imageview89);
        textview99 = (TextView) findViewById(R.id.textview99);
        imageview90 = (ImageView) findViewById(R.id.imageview90);
        textview100 = (TextView) findViewById(R.id.textview100);
        imageview91 = (ImageView) findViewById(R.id.imageview91);
        textview101 = (TextView) findViewById(R.id.textview101);
        textview102 = (TextView) findViewById(R.id.textview102);
        linear131 = (LinearLayout) findViewById(R.id.linear131);
        linear132 = (LinearLayout) findViewById(R.id.linear132);
        linear133 = (LinearLayout) findViewById(R.id.linear133);
        linear134 = (LinearLayout) findViewById(R.id.linear134);
        linear135 = (LinearLayout) findViewById(R.id.linear135);
        linear136 = (LinearLayout) findViewById(R.id.linear136);
        linear137 = (LinearLayout) findViewById(R.id.linear137);
        linear138 = (LinearLayout) findViewById(R.id.linear138);
        linear139 = (LinearLayout) findViewById(R.id.linear139);
        linear140 = (LinearLayout) findViewById(R.id.linear140);
        imageview92 = (ImageView) findViewById(R.id.imageview92);
        textview103 = (TextView) findViewById(R.id.textview103);
        imageview93 = (ImageView) findViewById(R.id.imageview93);
        textview104 = (TextView) findViewById(R.id.textview104);
        imageview94 = (ImageView) findViewById(R.id.imageview94);
        textview105 = (TextView) findViewById(R.id.textview105);
        imageview95 = (ImageView) findViewById(R.id.imageview95);
        textview106 = (TextView) findViewById(R.id.textview106);
        imageview96 = (ImageView) findViewById(R.id.imageview96);
        textview107 = (TextView) findViewById(R.id.textview107);
        imageview97 = (ImageView) findViewById(R.id.imageview97);
        textview108 = (TextView) findViewById(R.id.textview108);
        imageview98 = (ImageView) findViewById(R.id.imageview98);
        textview109 = (TextView) findViewById(R.id.textview109);
        imageview99 = (ImageView) findViewById(R.id.imageview99);
        textview110 = (TextView) findViewById(R.id.textview110);
        imageview100 = (ImageView) findViewById(R.id.imageview100);
        textview111 = (TextView) findViewById(R.id.textview111);
        imageview101 = (ImageView) findViewById(R.id.imageview101);
        textview112 = (TextView) findViewById(R.id.textview112);
        textview113 = (TextView) findViewById(R.id.textview113);
        linear143 = (LinearLayout) findViewById(R.id.linear143);
        linear144 = (LinearLayout) findViewById(R.id.linear144);
        imageview102 = (ImageView) findViewById(R.id.imageview102);
        textview114 = (TextView) findViewById(R.id.textview114);
        imageview103 = (ImageView) findViewById(R.id.imageview103);
        textview115 = (TextView) findViewById(R.id.textview115);
        edition_area = (LinearLayout) findViewById(R.id.edition_area);

        //area de customizacão
        _custom(linear29);
        _custom(linear30);
        _custom(linear31);
        _custom(linear32);

        _custom(linear34);
        _custom(linear35);
        _custom(linear36);
        _custom(linear37);
        _custom(linear38);
        _custom(linear39);
        _custom(linear46);

        _custom(linear40);
        _custom(linear41);
        _custom(linear42);
        _custom(linear43);
        _custom(linear44);
        _custom(linear45);
        _custom(linear47);
        _custom(linear48);
        _custom(linear51);
        _custom(linear52);
        _custom(linear53);
        _custom(linear54);
        _custom(linear55);
        _custom(linear56);
        _custom(linear57);
        _custom(linear71);
        _custom(linear72);

        _custom(linear81);
        _custom(linear82);
        _custom(linear83);
        _custom(linear84);
        _custom(linear85);
        _custom(linear86);
        _custom(linear87);
        _custom(linear88);
        _custom(linear89);
        _custom(linear90);
        _custom(linear91);
        _custom(linear92);

        _custom(linear93);
        _custom(linear94);
        _custom(linear95);
        _custom(linear96);

        _custom(linear97);
        _custom(linear98);
        _custom(linear102);
        _custom(linear103);
        _custom(linear104);
        _custom(linear105);
        _custom(linear106);
        _custom(linear107);
        _custom(linear108);
        _custom(linear109);
        _custom(linear110);
        _custom(linear111);
        _custom(linear125);
        _custom(linear126);
        _custom(linear127);
        _custom(linear128);
        _custom(linear129);
        _custom(linear130);

        _custom(linear131);
        _custom(linear132);
        _custom(linear133);
        _custom(linear134);
        _custom(linear135);
        _custom(linear136);
        _custom(linear137);
        _custom(linear138);
        _custom(linear139);
        _custom(linear140);

        _custom(linear143);
        _custom(linear144);

        _custom(linear145);
        _custom(linear146);
        _custom(linear147);
        _custom(linear148);
    }
    private final class MyTouchListener implements View.OnTouchListener {
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN) {
                ClipData data = ClipData.newPlainText("", "");
                View.DragShadowBuilder shadowBuilder = new View.DragShadowBuilder(view);
                view.startDrag(data, shadowBuilder, view, 0);
                view.setVisibility(View.VISIBLE);

                return true;
            } else {
                return false;
            }
        }
    }

    class MyDragListener implements View.OnDragListener {

        private CharSequence dragData;

        @Override
        public boolean onDrag(View v, DragEvent event) {
            switch (event.getAction()) {
                case DragEvent.ACTION_DRAG_STARTED:
                    //atva quando o widget e selecionado
                    Vibrator vibrator=(Vibrator)getApplicationContext().getSystemService(Context.VIBRATOR_SERVICE);
                    vibrator.vibrate(100);
                    break;
                case DragEvent.ACTION_DRAG_ENTERED:
                    //ativa quando o widgets esta na area de soltura
                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    //Não se ativa
                    break;
                case DragEvent.ACTION_DROP:
                    ClipData.Item iten = event.getClipData().getItemAt(0);
                    dragData = iten.getText();
                    View view = (View) event.getLocalState();
                    view.setVisibility(view.VISIBLE);
                    LinearLayout Container = (LinearLayout) v;
                    //widgets customizados
                    //if(view.getId() == R.id.linear_h){
                        //LIMEAR H WIDGET
                        Toast.makeText(StudioActivity.this,"oi", Toast.LENGTH_LONG).show();
                    //}
                    break;
                case DragEvent.ACTION_DRAG_ENDED:
                    //ativa quando solta o widget
                    //ativa quando drag existed não contem widgts cadastrados
                default:
                    break;
            }
            return true;
        }

        private ViewGroup getChildAt(int i) {
            return null;
        }

        private int getChildCount() {
            return 0;
        }
    }
    public void _custom (final View _widgets) {
        android.graphics.drawable.GradientDrawable GIEFCJI = new android.graphics.drawable.GradientDrawable();
        GIEFCJI.setColor(Color.parseColor("#FFFFFFFF"));
        GIEFCJI.setCornerRadii(new float[] { 5, 5, 5, 5, 5, 5, 5, 5 });
        GIEFCJI.setStroke(4, Color.parseColor("#FFECEFF1"));
        _widgets.setBackground(GIEFCJI);
        if(Build.VERSION.SDK_INT >= 21) { _widgets.setElevation(6f); }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toobar_spiner, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.menu1) {
            //exportar
        } else if (item.getItemId() == R.id.menu2) {
            //publicar
        } else if (item.getItemId() == R.id.smenu1) {
            //telegram
        } else if (item.getItemId() == R.id.smenu2) {
            //youtube
        }
        return true;
    }
}
// daqui pra baixo codigo extra
package com.fabiosilva.ideuidesigner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager.widget.ViewPager;
import android.Manifest;
import android.animation.ArgbEvaluator;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.material.snackbar.Snackbar;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Projeto> list;
    RecyclerView recyclerView;
    private double nuner = 0;
    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;
    ArgbEvaluator argbEvaluator = new ArgbEvaluator();
    private ArrayList<String> repity = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (Build.VERSION.SDK_INT >= 23) {
            if (checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED
                    || checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_DENIED) {
                requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE, Manifest.permission.WRITE_EXTERNAL_STORAGE}, 1000);
            } else {
                initializeLogic();
            }
        } else {
            initializeLogic();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == 1000) {
            initializeLogic();
        }
    }

    private void initializeLogic() {
        if (FileUtil.isExistFile(FileUtil.getExternalStorageDir().concat("/IDE UI DESIGNER"))) {
            // O CODIGO A BAIXO CRIA UM ARQUIVO
            FileUtil.writeFile(FileUtil.getExternalStorageDir().concat("/IDE UI DESIGNER/ex.txt"), FileUtil.getExternalStorageDir());
        } else {
            //O CODIGO A BAIXO CRIA UMA PASTA
            FileUtil.makeDir(FileUtil.getExternalStorageDir().concat("/IDE UI DESIGNER"));
        }


        final SwipeRefreshLayout refresh = (SwipeRefreshLayout) findViewById(R.id.refresh);
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                /**Set Refreshing to True**/
                refresh.setRefreshing(true);

                //Write Your Code to Refresh any View

                /**Below Code will not execute for 2000 Millisecond (i.e 2 seconds)**/
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Toast.makeText(MainActivity.this, "Refresh Completed", Toast.LENGTH_SHORT).show();

                        /**Set Refreshing to False**/
                        refresh.setRefreshing(false);
                    }
                }, 2000);
            }
        });


        recyclerView = (RecyclerView) findViewById(R.id.listview1);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));

        //carrega os arquivos da lista
        addData();

        final ProjetoAdaptador adaptor = new ProjetoAdaptador(getApplicationContext(), list);
        recyclerView.setAdapter(adaptor);
        adaptor.setClickListener(new ProjetoAdaptador.RecyclerTouchListener() {
            @Override
            public void onClickItem(View v, int position) {
                String androidName = list.get(position).getName();
                Snackbar.make(v, androidName, Snackbar.LENGTH_SHORT).show();
            }
        });

        models = new ArrayList<>();
        models.add(new Model(R.drawable.canvas, "Brochure", "Brochure is an informative paper document (often also used for advertising) that can be folded into a template"));
        models.add(new Model(R.drawable.canvas, "Sticker", "Sticker is a type of label: a piece of printed paper, plastic, vinyl, or other material with pressure sensitive adhesive on one side"));
        models.add(new Model(R.drawable.canvas, "Poster", "Poster is any piece of printed paper designed to be attached to a wall or vertical surface."));
        models.add(new Model(R.drawable.canvas, "Namecard", "Business cards are cards bearing business information about a company or individual."));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(5, 0, 5, 0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };

        colors = colors_temp;

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

                if (position < (adapter.getCount() - 1) && position < (colors.length - 1)) {
                    viewPager.setBackgroundColor(

                            (Integer) argbEvaluator.evaluate(
                                    positionOffset,
                                    colors[position],
                                    colors[position + 1]
                            )
                    );
                } else {
                    viewPager.setBackgroundColor(colors[colors.length - 1]);
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

  private void addData() {
      //FileUtil.listDir(FileUtil.getExternalStorageDir().concat("/IDE UI DESIGNER/"), repity);
      // nuner = 0;
      list = new ArrayList<Projeto>();
      ////for(int _repeat33 = 0; _repeat33 < (int)(repity.size()); _repeat33++) {
      list.add(new Projeto("Versão, " + "1.0", "Nome, " + "repity.get((int) (nuner))", "Sobre, " + "UI Designer Profile", "Criação, " + "08/04/2022"));
      // nuner++;
      //}
      //repity.clear();
      //}

  }
}
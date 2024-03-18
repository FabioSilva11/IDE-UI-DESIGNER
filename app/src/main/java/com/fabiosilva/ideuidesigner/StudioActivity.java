package com.project.incrysy;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.UUID;
import java.util.Arrays;
import java.util.List;

public class StudioActivity extends AppCompatActivity {

    private LinearLayout linear_h, linear_v, scroll_h, scroll_v;
    private LinearLayout[] textViews = new LinearLayout[15];
    private LinearLayout[] widgets = new LinearLayout[12];
    private LinearLayout[] layouts = new LinearLayout[6];
    private LinearLayout[] helpers = new LinearLayout[8];
    private LinearLayout[] googleWidgets = new LinearLayout[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_editor);

        initializeWidgets();
        applyCustomStyleToWidgets();
    }

    private void initializeWidgets() {
        linear_h = findViewById(R.id.linear_h);
        linear_v = findViewById(R.id.linear_v);
        scroll_h = findViewById(R.id.scroll_h);
        scroll_v = findViewById(R.id.scroll_v);

        int id = R.id.linear_textview;
        for (int i = 0; i < textViews.length; i++) {
            textViews[i] = findViewById(id + i);
        }

        id = R.id.linear_widgets;
        for (int i = 0; i < widgets.length; i++) {
            widgets[i] = findViewById(id + i);
        }

        id = R.id.linear_layouts;
        for (int i = 0; i < layouts.length; i++) {
            layouts[i] = findViewById(id + i);
        }

        id = R.id.linear_helpers;
        for (int i = 0; i < helpers.length; i++) {
            helpers[i] = findViewById(id + i);
        }

        id = R.id.linear_google;
        for (int i = 0; i < googleWidgets.length; i++) {
            googleWidgets[i] = findViewById(id + i);
        }
    }

    private void applyCustomStyleToWidgets() {
        _custom(linear_h, 5, 6, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(linear_v, 5, 6, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(scroll_h, 5, 6, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(scroll_v, 5, 6, 0xFFFFFFFF, 0xFFECEFF1);

        _custom(textViews, 5, 5, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(widgets, 5, 5, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(layouts, 5, 5, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(helpers, 5, 5, 0xFFFFFFFF, 0xFFECEFF1);
        _custom(googleWidgets, 5, 5, 0xFFFFFFFF, 0xFFECEFF1);
    }

    public void _custom(View view, int cornerRadius, int strokeWidth, int backgroundColor, int strokeColor) {
        android.graphics.drawable.GradientDrawable GIEFCJI = new android.graphics.drawable.GradientDrawable();
        GIEFCJI.setColor(backgroundColor);
        GIEFCJI.setCornerRadii(new float[8]);
        for (int i = 0; i < 8; i++) {
            GIEFCJI.setCornerRadius(cornerRadius);
        }
        GIEFCJI.setStroke(strokeWidth, strokeColor);
        view.setBackground(GIEFCJI);
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(6f);
        }
    }

    public void _custom(View[] views, int cornerRadius, int strokeWidth, int backgroundColor, int strokeColor) {
        for (View view : views) {
            _custom(view, cornerRadius, strokeWidth, backgroundColor, strokeColor);
        }
    }
}

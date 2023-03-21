package com.project.incrysy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
import android.content.ClipData;
import android.view.DragEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.os.Vibrator;
import android.content.Context;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ImageView;
import android.graphics.Color;
import android.os.Build;
import android.widget.Button;
import java.util.UUID;
public class StudioActivity extends AppCompatActivity 
{
    private LinearLayout linear_h,linear_v,scroll_h,scroll_v,linear_textview,linear_button,linear_imageview;
    private LinearLayout linear_recicleview,linear_fragment_conteiner,linear_switch,linear_text_plain_text;
    private LinearLayout linear_text_password,linear_text_password_numerico,linear_text_email,linear_text_telefone;
    private LinearLayout linear_text_cep,linear_text_multilinha,linear_text_tempo,linear_text_data,linear_text_numero_signed;
    private LinearLayout linear_text_numero_decimal,linear_text_alto_completar,linear_text_mult_completar;
    private LinearLayout linear_text_verificado,linear_text_imput_layout,linear_widgets_view,linear_widgets_web_view;
    private LinearLayout linear_widgets_video_view,linear_widgets_calendario,linear_widgets_progressbar,linear_widgets_progressbar_horizontal;
    private LinearLayout linear_widgets_seekbar,linear_widgets_ratingbar,linear_widgets_search_view,linear_widgets_texture_view,linear_widgets_surface_view;
    private LinearLayout linear_layouts_contraint_layout,linear_layouts_frame_layout,linear_layouts_tab_layout,linear_layouts_table_row;
    private LinearLayout linear_conteiners_spiner,linear_conteiners_view_pege,linear_conteiners_cardview,linear_conteiners_appbarlayout;
    private LinearLayout linear_conteiners_buttonappbar,linear_conteiners_navigation_view,linear_conteiners_button_navigation,linear_conteiners_toobar;
    private LinearLayout linear_conteiners_material_toobar,linear_conteiners_tablayout,linear_conteiner_tab_item,linear_conteiner_view_stub;
    private LinearLayout linear_conteiner_include,linear_conteiner_fragmente_conteiner,linear_conteiner_nav_host_fragment;
    private LinearLayout linear_conteiner_view,linear_conteiner_requerest_focus;
    private LinearLayout linear_helpers_grup,linear_helpers_barris_horizontal,linear_helpers_barrie_vertical,linear_helpers_flow;
    private LinearLayout linear_helpers_glideline_horizontal,linear_helpers_glideline_vertical,linear_helpers_layer,linear_helpers_imagem_filter;
    private LinearLayout linear_helpers_imagem_filter_button,linear_helpers_mock_view,linear_google_adview,linear_google_mapview;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_editor);

        //style dos widgets mais usados
        _custom(linear_h);
        _custom(linear_v);
        _custom(scroll_h);
        _custom(scroll_v);
        //style dos widgets mais comuns
        _custom(linear_textview);
        _custom(linear_button);
        _custom(linear_imageview);
        _custom(linear_recicleview);
        _custom(linear_fragment_conteiner);
        _custom(linear_switch);
        //style dos widgets de textos
        _custom(linear_text_plain_text);
        _custom(linear_text_password);
        _custom(linear_text_password_numerico);
        _custom(linear_text_email);
        _custom(linear_text_telefone);
        _custom(linear_text_cep);
        _custom(linear_text_multilinha);
        _custom(linear_text_tempo);
        _custom(linear_text_data);
        _custom(linear_text_numero_signed);
        _custom(linear_text_numero_decimal);
        _custom(linear_text_alto_completar);
        _custom(linear_text_mult_completar);
        _custom(linear_text_verificado);
        _custom(linear_text_imput_layout);
        //style dos widgets de textos
        _custom(linear_widgets_view);
        _custom(linear_widgets_web_view);
        _custom(linear_widgets_video_view);
        _custom(linear_widgets_calendario);
        _custom(linear_widgets_progressbar);
        _custom(linear_widgets_progressbar_horizontal);
        _custom(linear_widgets_seekbar);
        _custom(linear_widgets_ratingbar);
        _custom(linear_widgets_search_view);
        _custom(linear_widgets_texture_view);
        _custom(linear_widgets_surface_view);
        //style dos widgets de layout
        _custom(linear_layouts_contraint_layout);
        _custom(linear_layouts_frame_layout);
        _custom(linear_layouts_tab_layout);
        _custom(linear_layouts_table_row);
        //style dos widgets de conteiner
        _custom(linear_conteiners_spiner);
        _custom(linear_conteiners_view_pege);
        _custom(linear_conteiners_cardview);
        _custom(linear_conteiners_appbarlayout);
        _custom(linear_conteiners_buttonappbar);
        _custom(linear_conteiners_navigation_view);
        _custom(linear_conteiners_button_navigation);
        _custom(linear_conteiners_toobar);
        _custom(linear_conteiners_material_toobar);
        _custom(linear_conteiners_tablayout);
        _custom(linear_conteiner_tab_item);
        _custom(linear_conteiner_view_stub);
        _custom(linear_conteiner_include);
        _custom(linear_conteiner_fragmente_conteiner);
        _custom(linear_conteiner_nav_host_fragment);
        _custom(linear_conteiner_view);
        _custom(linear_conteiner_requerest_focus);
        //style dos widgets Helpers
        _custom(linear_helpers_grup);
        _custom(linear_helpers_barris_horizontal);
        _custom(linear_helpers_barrie_vertical);
        _custom(linear_helpers_flow);
        _custom(linear_helpers_glideline_horizontal);
        _custom(linear_helpers_glideline_vertical);
        _custom(linear_helpers_layer);
        _custom(linear_helpers_imagem_filter);
        _custom(linear_helpers_imagem_filter_button);
        _custom(linear_helpers_mock_view);
        //style dos widgets do doogle
        _custom(linear_google_adview);
        _custom(linear_google_mapview);
    }
    public void _custom (final View _widgets) {
        android.graphics.drawable.GradientDrawable GIEFCJI = new android.graphics.drawable.GradientDrawable();
        GIEFCJI.setColor(Color.parseColor("#FFFFFFFF"));
        GIEFCJI.setCornerRadii(new float[] { 5, 5, 5, 5, 5, 5, 5, 5 });
        GIEFCJI.setStroke(4, Color.parseColor("#FFECEFF1"));
        _widgets.setBackground(GIEFCJI);
        if(Build.VERSION.SDK_INT >= 21) {
            _widgets.setElevation(6f);
        }
    }
	
}
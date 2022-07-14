package com.fabiosilva.ideuidesigner;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ProjetoAdaptador extends RecyclerView.Adapter<ProjetoAdaptador.MyHolder> {

    RecyclerTouchListener listener;
    /**Interface for OnClickListener of RecyclerView**/
    public interface RecyclerTouchListener {
        void onClickItem(View v, int position);
    }

    Context context;
    LayoutInflater inflater;
    ArrayList<Projeto> model;

    public ProjetoAdaptador(Context context, ArrayList<Projeto> model) {
        inflater = LayoutInflater.from(context);
        this.context = context;
        this.model = model;
    }

    public int getItemCount() {
        return model.size();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.list, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        /**Bind Text in the TextView**/
        holder.version.setText(model.get(position).getVersion());
        holder.name.setText(model.get(position).getName());
        holder.release.setText(model.get(position).getRelease());
        holder.data.setText(model.get(position).getData());
    }

    public void setClickListener(RecyclerTouchListener listener) {
        this.listener = listener;
    }

    /**Holder Class for Row Items**/
    public class MyHolder extends RecyclerView.ViewHolder {
        TextView version;
        TextView name;
        TextView release;
        TextView data;

        public MyHolder(final View view) {
            super(view);

            version = (TextView) view.findViewById(R.id.version);
            name = (TextView) view.findViewById(R.id.androidName);
            release = (TextView) view.findViewById(R.id.release);
            data = (TextView) view.findViewById(R.id.data);

            version.setTextColor(Color.parseColor("#181830"));
            name.setTextColor(Color.parseColor("#181830"));
            release.setTextColor(Color.parseColor("#181830"));
            data.setTextColor(Color.parseColor("#181830"));
            view.setTag(view);



            /**OnClick Listener on Row Items**/
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null) listener.onClickItem(view, getAdapterPosition());
                }
            });
        }
    }
}
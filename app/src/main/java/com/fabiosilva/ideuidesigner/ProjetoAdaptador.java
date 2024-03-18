package com.fabiosilva.ideuidesigner;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.SparseArray;

public class ProjetoAdaptador extends RecyclerView.Adapter<ProjetoAdaptador.MyHolder> {

    public interface RecyclerTouchListener {
        void onClickItem(View v, int position);
    }

    private SparseArray<Projeto> model;
    private RecyclerTouchListener listener;

    public ProjetoAdaptador(SparseArray<Projeto> model) {
        this.model = model;
    }

    @Override
    public int getItemViewType(int position) {
        // Add code here to return a different view type for different layouts
        return 0;
    }

    @Override
    public int getItemCount() {
        return model.size();
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list, parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, final int position) {
        Projeto projeto = model.get(position);
        holder.bind(projeto);
    }

    public void setClickListener(RecyclerTouchListener listener) {
        this.listener = listener;
    }

    public SparseArray<Projeto> getModel() {
        return model;
    }

    public static class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final TextView version;
        private final TextView name;
        private final TextView release;
        private final TextView data;

        public MyHolder(View view) {
            super(view);
            version = view.findViewById(R.id.version);
            name = view.findViewById(R.id.androidName);
            release = view.findViewById(R.id.release);
            data = view.findViewById(R.id.data);
            view.setOnClickListener(this);
            setTextColors();
        }

        public void bind(Projeto projeto) {
            version.setText(projeto.getVersion());
            name.setText(projeto.getName());
            release.setText(projeto.getRelease());
            data.setText(projeto.getData());
        }

        @Override
        public void onClick(View v) {
            if (listener != null) {
                listener.onClickItem(v, getAdapterPosition());
            }
        }

        private void setTextColors() {
            version.setTextColor(Color.parseColor("#181830"));
            name.setTextColor(Color.parseColor("#181830"));
            release.setTextColor(Color.parseColor("#181830"));
            data.setTextColor(Color.parseColor("#181830"));
        }
    }
}

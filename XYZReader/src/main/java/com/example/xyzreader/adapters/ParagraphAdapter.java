package com.example.xyzreader.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.xyzreader.R;

public class ParagraphAdapter extends RecyclerView.Adapter<ParagraphAdapter.ViewHolder> {

    private String[] mParagraphs;

    public ParagraphAdapter(String[] paragraphs) {
        this.mParagraphs = paragraphs;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_paragraph, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String paragraph = mParagraphs[position];

        holder.paragraphTextView.setText(paragraph);
    }

    @Override
    public int getItemCount() {
        return mParagraphs.length;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView paragraphTextView;

        ViewHolder(View itemView) {
            super(itemView);

            paragraphTextView = itemView.findViewById(R.id.tv_paragraph);
        }

    }

}
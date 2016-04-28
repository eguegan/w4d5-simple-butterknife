package com.example.simplebutterknife;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnItemClick;

/**
 * Created by admin on 4/28/2016.
 */
public class ListViewAdapter extends BaseAdapter {

    LayoutInflater inflater;

    public ListViewAdapter(LayoutInflater inflater){
        this.inflater = inflater;
    }

    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        View view = inflater.inflate(R.layout.list_item, parent, false);
        holder = new ViewHolder(view);

        holder.text.setText("Hola" + position);

        return view;
    }

    @OnItemClick(R.id.list_txt)
    void onClickSimpleBtn(int pos){
        Log.d("TAG", "onClickSimpleBtn: " + pos);
    }

    static class ViewHolder{
        @BindView(R.id.list_txt) TextView text;

        public ViewHolder(View view){
            ButterKnife.bind(this, view);
        }
    }
}

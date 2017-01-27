package com.example.atul.demo_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.List;

/**
 * Created by Atul on 3/3/2016.
 */

public class CustomAdapter  extends BaseAdapter{


    private LayoutInflater lInflater;

    private List<ItemObjectClass> listStorage;

    public CustomAdapter(Context context, List<ItemObjectClass> customizedListView)
    {
        lInflater =(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        listStorage = customizedListView;
    }

    @Override

    public int getCount() {

        return listStorage.size();

    }

    @Override

    public Object getItem(int position) {

        return position;

    }

    @Override

    public long getItemId(int position) {

        return position;

    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder listViewHolder;

        if(convertView == null){

            listViewHolder = new ViewHolder();

            convertView = lInflater.inflate(R.layout.custom_dapter, parent, false);

            listViewHolder.songName = (TextView)convertView.findViewById(R.id.textView);

            listViewHolder.songYear = (TextView)convertView.findViewById(R.id.textView2);

            listViewHolder.songAuthor = (TextView)convertView.findViewById(R.id.textView3);

            convertView.setTag(listViewHolder);

        }else{

            listViewHolder = (ViewHolder)convertView.getTag();

        }

        listViewHolder.songName.setText("Song Name: " + listStorage.get(position).getSongName());

        listViewHolder.songYear.setText("Song Year: " + listStorage.get(position).getSongYear());

        listViewHolder.songAuthor.setText("Song Author: " + listStorage.get(position).getSongAuthor());

        return convertView;

    }
    static class ViewHolder{

        TextView songName;

        TextView songYear;

        TextView songAuthor;
    }
}

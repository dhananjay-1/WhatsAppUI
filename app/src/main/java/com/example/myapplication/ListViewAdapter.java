package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ListViewAdapter extends ArrayAdapter<ChatThread> {

    List<ChatThread> chatList;
    Context context;

    public ListViewAdapter(@NonNull Context context, List<ChatThread> chatList) {

        super(context, R.layout.custom_layout_listview, chatList);
        this.context = context;
        this.chatList = chatList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflator = LayoutInflater.from(context);
        View listViewItem = inflator.inflate(R.layout.custom_layout_listview, null, true);

        CircleImageView profile_image = listViewItem.findViewById(R.id.profile_image);
        TextView name = listViewItem.findViewById(R.id.name);
        TextView message = listViewItem.findViewById(R.id.message);

        profile_image.setImageResource(R.mipmap.ic_launcher);
        name.setText(chatList.get(position).getName());
        message.setText(chatList.get(position).getMsg());

        return listViewItem;
    }
}

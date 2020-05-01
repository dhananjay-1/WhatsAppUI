package com.example.myapplication.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.myapplication.ChatThread;
import com.example.myapplication.ListViewAdapter;
import com.example.myapplication.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ChatsFragment extends Fragment {

    ListView listView;
    ArrayList<ChatThread> chatList;

    public ChatsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        listView = view.findViewById(R.id.list_view);
        chatList = new ArrayList<>();

        chatList.add(new ChatThread("Iron Man", "I am Iron Man"));
        chatList.add(new ChatThread("Thor", "God of thunder, son of Odin"));
        chatList.add(new ChatThread("Hulk", "Smash, I am the strongest"));
        chatList.add(new ChatThread("Captain America", "We will face it together"));
        chatList.add(new ChatThread("Thanos", "I am inevitable"));
        chatList.add(new ChatThread("Iron Man", "I am Iron Man"));
        chatList.add(new ChatThread("Thor", "God of thunder, son of Odin"));
        chatList.add(new ChatThread("Hulk", "Smash, I am the strongest"));
        chatList.add(new ChatThread("Captain America", "We will face it together"));
        chatList.add(new ChatThread("Thanos", "I am inevitable"));

        assert getContext()!=null;
        ListViewAdapter listViewAdapter = new ListViewAdapter(getContext(), chatList);

        listView.setAdapter(listViewAdapter);

        return view;
    }
}

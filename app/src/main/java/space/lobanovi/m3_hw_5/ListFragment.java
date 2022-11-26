package space.lobanovi.m3_hw_5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;

public class ListFragment extends Fragment {
    private ArrayList<ChatModel> chatModels;
    RecyclerView myrecycler_view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        myrecycler_view = view.findViewById(R.id.chat_rv);
        chatModels = new ArrayList<>();
        setChats();
    }

    private void setChats() {
        chatModels.add(new ChatModel(R.drawable.a, "Pinterest", "Автор: Бен Зильберман"));
        chatModels.add(new ChatModel(R.drawable.h, "Tik Tok", "Основатели: Чжан Имин"));
        chatModels.add(new ChatModel(R.drawable.d, "WhatsApp", "Автор: Кум, Ян Борисович"));
        chatModels.add(new ChatModel(R.drawable.c, "Spotify", "Основатели: Дениэл Эк и др."));
        chatModels.add(new ChatModel(R.drawable.f, "Telegram", "Автор:Николай Валерьевич Дуров и др."));
        chatModels.add(new ChatModel(R.drawable.e, "WK", "Основатели: Павел Валерьевич Дуров и др."));
        chatModels.add(new ChatModel(R.drawable.u, "Facebook", "Основатели: Марк Цукерберг и др."));
        chatModels.add(new ChatModel(R.drawable.g, "Picsart", "Основатель: Оганнес Авоян"));
        chatModels.add(new ChatModel(R.drawable.in, "Instagram", "Автор:Кевин Систром и Майк Кригер"));
        ChatAdapter yy = new ChatAdapter(chatModels);
        myrecycler_view.setAdapter(yy);
    }
}
package space.lobanovi.m3_hw_5;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.View_holder> {
    private ArrayList <ChatModel> chatModels;
    private ChatModel [] data_list;

    public ChatAdapter (ArrayList <ChatModel> chatModels){
        this.chatModels = chatModels;
    }
   // public ChatAdapter(ChatModel[] data_list) {
     //   this.data_list = data_list;
    //}
    @NonNull
    @Override
    public View_holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());


        View lise_item = layoutInflater.inflate(R.layout.chat_item,null);

        View_holder view_holder = new View_holder(lise_item);


        return view_holder;
    }

    @Override
    public void onBindViewHolder(@NonNull View_holder holder, int position) {
        ChatModel data_model = chatModels.get(position);
        holder.my_img.setImageResource(data_model.getImage());
        holder.txt_title.setText(data_model.getTitle());
        holder.txt_description.setText(data_model.getMessage());

        holder.main_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = DetailFragment.newInstance(data_model.getTitle(),data_model.getMessage(),data_model.getImage());
                AppCompatActivity activity = (AppCompatActivity) view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack(null).commit();
            }
        });
    }
    @Override
    public int getItemCount() {
        return chatModels.size();
    }

    public class View_holder extends RecyclerView.ViewHolder {
        ImageView my_img;
        TextView txt_title,txt_description;
        CardView main_card;

        public View_holder(@NonNull View itemView) {
            super(itemView);
            txt_title = itemView.findViewById(R.id.title_tv);
            txt_description = itemView.findViewById(R.id.message_tv);
            my_img = itemView.findViewById(R.id.chat_iv);
            main_card = itemView.findViewById(R.id.chat_item);
        }
    }
}


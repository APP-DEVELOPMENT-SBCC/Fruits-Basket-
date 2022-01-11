package com.example.s.adapters;

import static java.lang.System.load;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.s.R;
import com.example.s.activities.fruitdb;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private  static final String Tag = "RecyclerView";
    private Context mContext;
    private ArrayList<fruitdb> fruitList;

    public RecyclerAdapter(Context mContext, ArrayList<fruitdb> fruitList) {
        this.mContext = mContext;
        this.fruitList = fruitList;
    }

    @NonNull
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fruit_item, parent, false);

        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        //TextView
        holder.text1.setText(fruitList.get(position).getfruit_type());

        //Imageview : Glide library
        Glide.with(this).load(fruitList.get(position).geturl()).into(holder.imagView);
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        //Widgets
        ImageView imagView;
        TextView text1;
        TextView text2;
        TextView text3;
        TextView text4;
        TextView text5;
        TextView text6;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagView = itemView.findViewById(R.id.imgView);
            text1 = itemView.findViewById(R.id.txtView11);
            text2 = itemView.findViewById(R.id.txtView12);
            text3 = itemView.findViewById(R.id.txtView13);
            text4 = itemView.findViewById(R.id.txtView14);
            text5 = itemView.findViewById(R.id.txtView15);
            text6 = itemView.findViewById(R.id.txtView16);

        }
    }
}

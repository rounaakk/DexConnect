package com.example.dexconnect;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class CardsAdapter extends FirebaseRecyclerAdapter<Cards,CardsAdapter.CardsViewHolder> {

    public CardsAdapter(@NonNull FirebaseRecyclerOptions options) {
        super(options);
    }


    @NonNull
    @Override
    public CardsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.dex_card, parent, false);

        return new CardsViewHolder(view);

    }

    @Override
    protected void onBindViewHolder(@NonNull CardsViewHolder holder, int position, @NonNull Cards model) {
        holder.title.setText(model.getTitle());
        holder.aud.setText(model.getAud());
        holder.dLine.setText(model.getdLine());
        holder.link.setText(model.getLink());
        holder.refLink1.setText(model.getRefLink1());
        holder.refLink2.setText(model.getRefLink2());
        holder.refTitle1.setText(model.getRefTitle1());
        holder.refTitle2.setText(model.getRefTitle2());
        holder.desc.setText(model.getDesc());


    }


    class CardsViewHolder extends RecyclerView.ViewHolder {

        TextView title,aud,dLine,link,refLink1,refTitle1,refLink2,refTitle2,desc;
        public CardsViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            aud=itemView.findViewById(R.id.audience);
            dLine=itemView.findViewById(R.id.deadline);
            link=itemView.findViewById(R.id.link);
            refLink1=itemView.findViewById(R.id.resLink1);
            refLink2=itemView.findViewById(R.id.resLink2);
            refTitle1=itemView.findViewById(R.id.resTitle1);
            refTitle2=itemView.findViewById(R.id.resTitle2);
            desc=itemView.findViewById(R.id.description);
        }
    }
}

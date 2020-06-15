package com.example.dexconnect;

import android.content.Intent;
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
    protected void onBindViewHolder(@NonNull final CardsViewHolder holder, final int position, final Cards model) {
        holder.title.setText(model.getTitle());
        holder.aud.setText(model.getAud());
        holder.dLine.setText(model.getdLine());
//        holder.link.setText(model.getLink());
//        holder.refLink1.setText(model.getRefLink1());
//        holder.refLink2.setText(model.getRefLink2());
//        holder.refTitle1.setText(model.getRefTitle1());
//        holder.refTitle2.setText(model.getRefTitle2());
//        holder.desc.setText(model.getDesc());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                Toast.makeText(holder.itemView.getContext(), model.getTitle(), Toast.LENGTH_SHORT).show();


                    Intent i = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                    i.putExtra("titleq",model.getTitle());
                    i.putExtra("audq",model.getAud());
                    i.putExtra("dLineq",model.getdLine());
                    i.putExtra("linkq",model.getLink());
                    i.putExtra("refLink1q",model.getRefLink1());
                    i.putExtra("refLink2q",model.getRefLink2());
                    i.putExtra("refTitle1q",model.getRefTitle1());
                    i.putExtra("refTitle2q",model.getRefTitle2());
                    i.putExtra("descq",model.getDesc());
                    holder.itemView.getContext().startActivity(i);


            }
        });


    }




    class CardsViewHolder extends RecyclerView.ViewHolder {

        TextView title,aud,dLine,link,refLink1,refTitle1,refLink2,refTitle2,desc;
        public CardsViewHolder(@NonNull final View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            aud=itemView.findViewById(R.id.audience);
            dLine=itemView.findViewById(R.id.deadline);
//            link=itemView.findViewById(R.id.link);
//            refLink1=itemView.findViewById(R.id.resLink1);
//            refLink2=itemView.findViewById(R.id.resLink2);
//            refTitle1=itemView.findViewById(R.id.resTitle1);
//            refTitle2=itemView.findViewById(R.id.resTitle2);
//            desc=itemView.findViewById(R.id.description);
        }
    }

}

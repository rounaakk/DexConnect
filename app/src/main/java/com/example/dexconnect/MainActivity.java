package com.example.dexconnect;

import android.os.Bundle;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mDexList;
    CardsAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDexList=findViewById(R.id.myRecyclerView);
        mDexList.setLayoutManager(new LinearLayoutManager(this));

        FirebaseRecyclerOptions<Cards> options =
                new FirebaseRecyclerOptions.Builder<Cards>()
                        .setQuery(FirebaseDatabase.getInstance()
                                .getReference()
                                .child("Cards"), Cards.class)
                        .build();

        adapter = new CardsAdapter(options);
        mDexList.setAdapter(adapter);
//        mDbRef = FirebaseDatabase.getInstance().getReference().child("Cards");
//        mDbRef.keepSynced(true);

//        mDexList.setHasFixedSize(true);

//        mDexList.setAdapter(dex_cards);
//
//        ArtistArrayAdapter adapter = new ArtistArrayAdapter(this, artists);
//        recyclerView = (RecyclerView) findViewById(R.id.cardList);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setAdapter(adapter);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

//        FirebaseRecyclerOptions<Cards> options =
//                new FirebaseRecyclerOptions.Builder<Cards>()
//                        .setQuery(FirebaseDatabase.getInstance()
//                                .getReference()
//                                .child("Cards"), Cards.class)
//                        .build();
//
//        dex_cards = new CardsAdapter(options);
    }



    @Override
    protected void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    protected void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}

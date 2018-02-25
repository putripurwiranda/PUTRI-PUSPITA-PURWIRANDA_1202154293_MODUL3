package android.example.com.putri_1202154293;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by ASUS on 25/02/2018.
 */


class RecyclerAdapter  extends RecyclerView.Adapter<RecyclerViewHolder>{

    //deklarasi variable context
    private final Context context;
    String [] merek={"Ades","Aqua","Amidis","Cleo","Club",
            "Equil","Evian","Le Minerale","Nestle","Pristine","Vit"};
    String [] dekripsi={"Ini adalah air mineral merk Ades",
            "Ini adalah air mineral merk Aqua",
            "Ini adalah air mineral merk Amidis",
            "Ini adalah air mineral merk Cleo",
            "Ini adalah air mineral merk Club",
            "Ini adalah air mineral merk Equil",
            "Ini adalah air mineral merk Evian",
            "Ini adalah air mineral merk Le Minerale",
            "Ini adalah air mineral merk Nestle",
            "Ini adalah air mineral merk Pristine",
            "Ini adalah air mineral merk Vit"};
    int [] logo={R.drawable.ades,R.drawable.aqua,R.drawable.amidis,R.drawable.cleo,R.drawable.club,R.drawable.equil
            ,R.drawable.evian,R.drawable.leminerale,R.drawable.nestle,R.drawable.pristine,R.drawable.vit};


    LayoutInflater inflater;
    public RecyclerAdapter(Context context){
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder= new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.tvMerek.setText(merek[position]);
        holder.tvDeskripsi.setText(dekripsi[position]);
        holder.ivLogo.setImageResource(logo[position]);

        holder.tvMerek.setOnClickListener(clickListener);
        holder.tvDeskripsi.setOnClickListener(clickListener);

        holder.tvMerek.setTag(holder);
        holder.tvDeskripsi.setTag(holder);
    }

    @Override
    public int getItemCount() {
        return merek.length;
    }

        View.OnClickListener clickListener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //member aksi saat cardview diklik berdasarkan posisi tertentu

                RecyclerViewHolder vholder = (RecyclerViewHolder) v.getTag();

                int position = vholder.getPosition();

                if (position == 0 && position < getItemCount()) {
                    Intent intent = new Intent(context, DetileActivity.class);
                    context.startActivity(intent);
                }
            }

        };
}

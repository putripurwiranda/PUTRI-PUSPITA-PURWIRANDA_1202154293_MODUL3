package android.example.com.putri_1202154293;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 25/02/2018.
 */

class RecyclerViewHolder extends RecyclerView.ViewHolder{

    // ViewHolder akan mendeskripisikan item view yang ditempatkan di dalam RecyclerView.
    TextView tvMerek,tvDeskripsi; //deklarasi textview
    ImageView ivLogo;  //deklarasi imageview

    public RecyclerViewHolder(View itemView) {
        super(itemView);

        tvMerek= (TextView) itemView.findViewById(R.id.tvMerek);
        //menampilkan text dari widget CardView pada id daftar_judul
        tvDeskripsi= (TextView) itemView.findViewById(R.id.tvDeskripsi);
        //menampilkan text deskripsi dari widget CardView pada id daftar_deskripsi
        ivLogo= (ImageView) itemView.findViewById(R.id.ivLogo);
        //menampilkan gambar atau icon pada widget Cardview pada id daftar_icon
    }

}

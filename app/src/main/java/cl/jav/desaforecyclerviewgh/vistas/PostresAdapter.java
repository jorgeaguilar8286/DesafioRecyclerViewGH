package cl.jav.desaforecyclerviewgh.vistas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import cl.jav.desaforecyclerviewgh.R;
import cl.jav.desaforecyclerviewgh.modelo.Postre;


public class PostresAdapter extends RecyclerView.Adapter<PostresAdapter.ViewHolder> {
    private LayoutInflater mLayoutInflater;
    private List<Postre> listaDePostres = new ArrayList<>();
    private Context mContext;
    private OnItemClickListener listener;

    public PostresAdapter() {
    }

    public PostresAdapter(Context pContext, List<Postre> plistaPostres, OnItemClickListener plistener) {
        mContext = pContext;
        listaDePostres = plistaPostres;
        listener = plistener;
        mLayoutInflater = LayoutInflater.from(mContext);


    }


    @NonNull
    @Override
    public PostresAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = mLayoutInflater.inflate(R.layout.item_list_postres, parent, false);
        return new PostresAdapter.ViewHolder(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView mNombre;
        private ImageView mImagen;

        public ViewHolder(View itemview) {
            super(itemview);
            mNombre = itemview.findViewById(R.id.tv_dessert_name);
            mImagen = itemview.findViewById(R.id.iv_dessert_image);
            itemview.setOnClickListener(this);
            mNombre.setOnClickListener(this);
            mImagen.setOnClickListener(this);
        }

        public void setNombre(String text) {
            mNombre.setText(text);
        }

        public void setImagen(int image) {
            mImagen.setTag(image);
            mImagen.setImageResource(image);
        }


        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            Postre postre = listaDePostres.get(position);

            listener.onClick(postre);


        }
    }


    @Override
    public void onBindViewHolder(@NonNull PostresAdapter.ViewHolder holder, int position) {
        Postre postre = listaDePostres.get(position);
        holder.setNombre(postre.getNombre());
        holder.setImagen(postre.getImage());

    }

    @Override
    public int getItemCount() {
        return listaDePostres.size();
    }

    public interface OnItemClickListener {

        void onClick(Postre postre);
    }
}

package cl.desafiolatam.prueba_superhero.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.desafiolatam.prueba_superhero.R;
import cl.desafiolatam.prueba_superhero.databinding.ItemHeroListBinding;
import cl.desafiolatam.prueba_superhero.modelo.ResponseItem;

public class AdapterHero extends  RecyclerView.Adapter<AdapterHero.CustomViewHolder>{




    private List<ResponseItem> responseList;

    private MiOnClickListener listener;

    public AdapterHero(List<ResponseItem> responseList) {
        this.responseList = responseList;
    }

    public List<ResponseItem> getResponseList() {
        return responseList;
    }

    public void setResponseList(List<ResponseItem> responseList) {
        this.responseList = responseList;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_blank_lista_hero,parent,false);
        return new CustomViewHolder(view);

    }
    public ItemHeroListBinding binding;
    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(responseList.get(position));
    }

    @Override
    public int getItemCount() { return responseList.size() ; }

    public interface MiOnClickListener{
        void onClickListener(ResponseItem response);
    }

    public MiOnClickListener getListener() {
        return listener;
    }

    public void setListener(MiOnClickListener listener) {
        this.listener = listener;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        public CustomViewHolder(@NonNull View itemView) {
            super(itemView);


        }
        public void bindData(ResponseItem responseH){

            binding.tvNombreSUPERList.setText(responseH.getName());
            Picasso.get().load(responseH.getImages().getSm()).into(binding.imgvSuperherolist);

            itemView.setOnClickListener(V->{
                listener.onClickListener(responseH);

            });


        }
    }






}

package cl.desafiolatam.prueba_superhero.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

import cl.desafiolatam.prueba_superhero.R;
import cl.desafiolatam.prueba_superhero.databinding.FragmentBlankDetalleBinding;
import cl.desafiolatam.prueba_superhero.modelo.Response;
import cl.desafiolatam.prueba_superhero.modelo.ResponseItem;

public class BlankFragmentDetalle extends Fragment {

    private FragmentBlankDetalleBinding binding;
    private List<ResponseItem> listH;
    private ResponseItem responseItem;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_blank_detalle, container, false);

        binding = FragmentBlankDetalleBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Response response =(Response) getArguments().getSerializable("response");

        binding.tvAltura.setText((CharSequence) responseItem.getAppearance().getHeight());
        binding.tvNombreDetalle.setText(responseItem.getName());

        binding.tvcombate.setText(responseItem. getPowerstats().getCombat());
        binding.tvDurabilidad.setText(responseItem.getPowerstats().getDurability());
        binding.tvInteligencia.setText(responseItem.getPowerstats().getIntelligence());
        binding.tvPoder.setText(responseItem.getPowerstats().getPower());
        binding.tvVelocidad.setText(responseItem.getPowerstats().getSpeed());
        binding.tvNombreReal.setText(responseItem.getBiography().getFullName());
        Picasso.get().load(responseItem.getImages().getLg()).into(binding.imgDetallate);








    }


}
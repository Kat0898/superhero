package cl.desafiolatam.prueba_superhero.ui;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.io.Serializable;
import java.util.List;

import cl.desafiolatam.prueba_superhero.R;
import cl.desafiolatam.prueba_superhero.adapter.AdapterHero;
import cl.desafiolatam.prueba_superhero.databinding.FragmentBlankListaHeroBinding;
import cl.desafiolatam.prueba_superhero.modelo.ResponseItem;


public class BlankFragmentListaHero extends Fragment {



    private FragmentBlankListaHeroBinding binding;
    private List<ResponseItem> listH;
    private AdapterHero adapterHero;


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_blank_list, container, false);
        //binding.rvsuperh

        binding = FragmentBlankListaHeroBinding.inflate(inflater,container,false);
        View view = binding.getRoot();
        return view;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        binding.rvsuperhero.findViewById(R.id.rvsuperhero);

        AdapterHero adapterHero = new AdapterHero(listH);
        StaggeredGridLayoutManager manager = new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL);
        adapterHero.setListener(response ->{
            Bundle bundle = new Bundle();
            bundle.putSerializable("response", (Serializable) response);
            Navigation.findNavController(view).navigate(R.id.action_blankFragmentListaHero_to_blankFragmentDetalle2,bundle);});


        binding.rvsuperhero.setAdapter(adapterHero);
        binding.rvsuperhero.setLayoutManager(manager);


    }
}
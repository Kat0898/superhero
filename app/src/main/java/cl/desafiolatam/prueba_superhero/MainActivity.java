package cl.desafiolatam.prueba_superhero;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import cl.desafiolatam.prueba_superhero.databinding.ActivityMainBinding;
import cl.desafiolatam.prueba_superhero.viewModel.ViewModelHeres;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private ViewModelHeres viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        viewModel = new ViewModelProvider(this).get(ViewModelHeres.class);

        setContentView(binding.getRoot());
        viewModel.llamarApi();
    }
}
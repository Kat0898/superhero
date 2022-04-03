package cl.desafiolatam.prueba_superhero.viewModel;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import java.util.List;

import cl.desafiolatam.prueba_superhero.cliente.ClienteRetrofit;
import cl.desafiolatam.prueba_superhero.modelo.ResponseItem;
import cl.desafiolatam.prueba_superhero.utilidad.ServicioRespuesta;
import retrofit2.Call;
import retrofit2.Callback;

public class ViewModelHeres extends AndroidViewModel {
    private MutableLiveData<List<ResponseItem>> responseMutableLiveData =new MutableLiveData<>();


    public ViewModelHeres(@NonNull Application application) {
        super(application);
    }

    public MutableLiveData<List<ResponseItem>> getResponseMutableLiveData() {
        return responseMutableLiveData;
    }

    public void setResponseMutableLiveData(MutableLiveData<List<ResponseItem>> responseMutableLiveData) {
        this.responseMutableLiveData = responseMutableLiveData;
    }
    public  void  llamarApi(){
        ServicioRespuesta servicio = ClienteRetrofit.getInstance().create(ServicioRespuesta.class);
        Call<List<ResponseItem>> call = servicio.getSuperHero();
        call.enqueue(new Callback<List<ResponseItem>>() {
            @Override
            public void onResponse(Call<List<ResponseItem>> call, retrofit2.Response<List<ResponseItem>> response) {
                //ResponseItem r = response.body();
              List<ResponseItem> r = response.body();
                Log.i("CALL",String.valueOf(response.code()));


            }

            @Override
            public void onFailure(Call<List<ResponseItem>> call, Throwable t) {
                //Toast.makeText(getContext(),getString(R.string.api_error),Toast.LENGTH_LONG).show();

            }
        });


    }
}


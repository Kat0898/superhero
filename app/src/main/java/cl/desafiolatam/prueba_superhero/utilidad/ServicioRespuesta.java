package cl.desafiolatam.prueba_superhero.utilidad;

import java.util.List;

import cl.desafiolatam.prueba_superhero.modelo.ResponseItem;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ServicioRespuesta {

    @GET("superhero-api/api/all.json")
    Call<List<ResponseItem>> getSuperHero();
}

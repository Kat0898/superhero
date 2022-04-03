package cl.desafiolatam.prueba_superhero.cliente;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ClienteRetrofit {

    private static Retrofit instance;

    private ClienteRetrofit() {}

    public static Retrofit getInstance()
    {
        if(instance == null)
        {
            instance = new Retrofit.Builder()
                    .baseUrl("https://akabab.github.io/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return instance;
    }
}
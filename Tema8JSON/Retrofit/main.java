package Tema8JSON.Retrofit;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class main {
  public static void main(String[] args) {
    Retrofit retrofit = new Retrofit.Builder().baseUrl("https://my-json-server.typicode.com/").
            addConverterFactory(GsonConverterFactory.create()).
            build();

    Furbolista plantilla =  retrofit.create(Furbolista.class);

    try{
      Response<List<Futbolista>> response = plantilla.furbo().execute();
      if (response.isSuccessful()) {
        List<Futbolista> futbolistas = response.body();
        System.out.println(futbolistas);
      }
    } catch (IOException e){
      System.out.println("Error");
    }
  }
}

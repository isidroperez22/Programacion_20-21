package Tema8JSON.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface Furbolista {
    @GET("json_api_demo/JSON")
    Call<List<Futbolista>> furbo();
}

package nyc.c4q.calendarapp.backend;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static String lastFM_API_KEY = "262a806e8dcfd901633ea70e676cca0f";
    private static String lastFM_Shared_Secret = "fb9d0c0971f41181670e14e913b5d268";
    private static String baseURL = "http://ws.audioscrobbler.com/";
    public static RetrofitInstance retrofitInstance;

    public static RetrofitInstance getRetrofitInstance(){
        if(retrofitInstance == null){
            retrofitInstance = new RetrofitInstance();
        }
        return retrofitInstance;
    }

    public Retrofit buildRetroFit(){
        return new Retrofit.Builder()
                .baseUrl(baseURL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}

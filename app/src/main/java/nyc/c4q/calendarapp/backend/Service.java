package nyc.c4q.calendarapp.backend;

import nyc.c4q.calendarapp.models.LastFM;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Service {


    @GET("2.0/?method=chart.gettoptracks&api_key={API_KEY}&format=json")
    Call<LastFM> getTracks(@Path("API_KEY") String API_KEY);

}
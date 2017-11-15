package app.znmsw.retrofitfileupload.api;

import app.znmsw.retrofitfileupload.models.CustomResponse;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

/**
 * Created by WT on 11/14/2017.
 */

public interface Api {
    //the base URL for our API
    //make sure you are not using localhost
    //find the ip usinc ipconfig command
    //String BASE_URL = "http://thuwunnabumihotel.com/mobile_upload/";
    String BASE_URL = "http://192.168.1.145/ImageUploadApi/";

    //this is our multipart request
    //we have two parameters on is name and other one is description
    @Multipart
    @POST("Api.php?apicall=upload")
    Call<CustomResponse> uploadImage(@Part("image\"; filename=\"myfile.jpg\" ") RequestBody file, @Part("desc") RequestBody desc);

}

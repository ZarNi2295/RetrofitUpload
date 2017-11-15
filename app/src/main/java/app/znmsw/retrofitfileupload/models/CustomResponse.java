package app.znmsw.retrofitfileupload.models;

/**
 * Created by WT on 11/14/2017.
 */

public class CustomResponse {
    boolean error;
    String message;

    public CustomResponse(boolean error, String message) {
        this.error = error;
        this.message = message;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

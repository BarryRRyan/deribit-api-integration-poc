package techtest.request;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpHeaderFactory {
    public static HttpHeaders create(String token) {
        var headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", token);
        return headers;
    }
}

package RestUtils;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils {

    public static Response performPost(String endpoint, String requestPayload, Map<String,String> headers){

       return RestAssured.given().log().all()
                .baseUri(endpoint)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();


    }
    public static io.restassured.response.Response performPost(String endpoint, Map<String,Object> requestPayload, Map<String,String> headers){

        return RestAssured.given().log().all()
                .baseUri(endpoint)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then().log().all().extract().response();


    }
}

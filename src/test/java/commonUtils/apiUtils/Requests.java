package commonUtils.apiUtils;

import io.restassured.http.Cookies;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Requests extends SpecBuilder {
    public static Response get(String endpoint, Cookies cookies){
        return given(getRequestSpec(endpoint))
                .cookies(cookies)
                .when()
                .get(endpoint)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }

    public static Response post(String endpoint, Headers headers, HashMap<String,Object> formParams, Cookies cookies) {
        return given(getRequestSpec(endpoint))
                .headers(headers)
                .formParams(formParams)
                .cookies(cookies)
                .when()
                .post(endpoint)
                .then()
                .spec(getResponseSpec())
                .extract()
                .response();
    }
}

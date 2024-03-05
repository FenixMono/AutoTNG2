package config.specification;

import config.configuration.BaseConfig;
import io.restassured.filter.log.LogDetail;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.http.Method;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static io.restassured.filter.log.LogDetail.*;
import static io.restassured.http.ContentType.JSON;
import static org.aeonbits.owner.ConfigFactory.*;

public class RequestSpec {

    private static final BaseConfig config = create(BaseConfig.class, getProperties());

    private static final String URL = config.url();

    public static RequestSpecification baseSpecRequest(){
        return given()
                .filters(new RequestLoggingFilter(METHOD),
                        new RequestLoggingFilter(URI),
                        new RequestLoggingFilter(HEADERS),
                        new RequestLoggingFilter(BODY))
                .relaxedHTTPSValidation()
                .baseUri(URL)
                .accept(JSON)
                .contentType(JSON);


    }
}

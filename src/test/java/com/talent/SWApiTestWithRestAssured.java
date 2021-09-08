package com.talent;

import io.restassured.RestAssured;
import org.apache.http.entity.mime.content.StringBody;
import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

public class SWApiTestWithRestAssured {
   @Test
   public void  requestAresourcesThenLinkToReturn() {
        String body = RestAssured.given().baseUri("https://swapi.dev/api").and().queryParam("format","json").when().get("/").then().log().all().and().assertThat().statusCode(is(equalTo(200)));
    }


}

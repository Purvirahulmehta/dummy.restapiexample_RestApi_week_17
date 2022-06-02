package com.restapiexample.dummy.test;

import com.restapiexample.dummy.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class DeleteEmployee extends TestBase
{
    @Test
    public void deleteEmployee(){
        Response response=given()
                .pathParam("id",1)
                .when()
                .delete("delete/{id}");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}

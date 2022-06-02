package com.restapiexample.dummy.test;

import com.restapiexample.dummy.model.Pojo;
import com.restapiexample.dummy.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostCreateNewEmployee extends TestBase
{
    @Test
    public void createNewEmployee(){
        Pojo pojo=new Pojo();
        pojo.setName("test");
        pojo.setSalary("123");
        pojo.setAge(23);
        Response response=given()
                .header("Content-Type","application/json")
                .body(pojo)
                .when()
                .post("/create");
        response.then().statusCode(200);
        response.prettyPrint();

    }

}

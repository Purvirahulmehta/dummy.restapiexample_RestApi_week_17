package com.restapiexample.dummy.test;

import com.restapiexample.dummy.model.Pojo;
import com.restapiexample.dummy.testBase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PutUpdateEmployee extends TestBase {
    @Test
    public void updateEmployee() {
        Pojo pojo = new Pojo();
        pojo.setId(1);
        pojo.setEmployee_name("dhara");
        pojo.setSalary("30000");
        pojo.setAge(28);
        Response response=given()
                .header("Content-Type", "application/json")
                .body(pojo)
                .when()
                .put("/update/1");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}

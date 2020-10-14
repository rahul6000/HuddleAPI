
/* Test for data validation
The API endpoint below returns a collection of To-Dos comprising of User ID, ID, Title and Completion status.
https://jsonplaceholder.typicode.com/todos
In the language of your choice, provide a test case to assert that the data types of all values are correct for the whole to-do list. The data types should be as follows:
userID is an integer
id is an integer
title is a string
completed is a boolean */

import org.junit.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;

public class HuddleApi {

    @Test
    public void validateResponseDataType() {

        get("https://jsonplaceholder.typicode.com/todos")
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("Schema.json"));  //validating the output with Json Schema

    }
}

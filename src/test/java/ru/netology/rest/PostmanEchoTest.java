package ru.netology.rest;

import org.junit.jupiter.api.Test;

public class PostmanEchoTest {

    @Test

    void shouldReturnSendData () {
        var twxt = "Hi";
        given()
                .baseUri ("https://postman-echo.com")
                .body(text)
                .then()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}

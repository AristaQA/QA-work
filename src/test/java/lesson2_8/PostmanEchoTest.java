package lesson2_8;

import org.junit.jupiter.api.Test;

import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoTest {

    @Test
    public void getRequestShouldReturnQueryParams() {

        // Отправляем GET-запрос на сайт Postman Echo.
        // В запрос добавляем два query-параметра: foo1=bar1 и foo2=bar2.
        given()
                .baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")

                // Здесь указываем сам метод запроса и путь /get.
                .when()
                .get("/get")

                // Здесь проверяем ответ:
                // 1. код ответа должен быть 200;
                // 2. в теле ответа должны вернуться наши параметры.
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"));

    }

    @Test
    public void postRawTextShouldReturnSentText() {

        // Создаём текст, который будем отправлять в теле POST-запроса.
        String text = "{\n" +
                "    \"test\": \"value\"\n" +
                "}";

        // Отправляем POST-запрос на сайт Postman Echo.
        // В body передаём обычный текст.
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(text)

                // Здесь указываем метод POST и путь /post.
                .when()
                .post("/post")

                // Проверяем ответ:
                // 1. код ответа должен быть 200;
                // 2. поле data должно содержать тот же текст, который мы отправили.
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }


    @Test
    public void postFormDataShouldReturnFormFields() {

        // Создаём данные формы.
        String formData = "foo1=bar1&foo2=bar2";

        // Эта настройка нужна, чтобы REST Assured не добавлял лишний charset
        // к Content-Type. Без неё Postman Echo возвращает ошибку 500.
        RestAssuredConfig config = RestAssuredConfig.config()
                .encoderConfig(EncoderConfig.encoderConfig()
                       .appendDefaultContentCharsetToContentTypeIfUndefined(false));

        // Отправляем POST-запрос с данными формы.
        given()
                .baseUri("https://postman-echo.com")
                .config(config)
                .header("Content-Type", "application/x-www-form-urlencoded")
                .body(formData)

                // Указываем метод POST и путь /post.
                .when()
                .post("/post")

                // Проверяем ответ.
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"));
    }


    @Test
    public void putRequestShouldReturnSentText() {

        // Создаём текст, который будем отправлять в теле PUT-запроса.
        String text = "This is expected to be sent back as part of response body.";

        // Отправляем PUT-запрос на Postman Echo.
        // В body передаём обычный текст.
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(text)

                // Указываем метод PUT и путь /put.
                .when()
                .put("/put")

                // Проверяем ответ:
                // 1. код ответа должен быть 200;
                // 2. поле data должно содержать отправленный текст.
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }


    @Test
    public void patchRequestShouldReturnSentText() {

        // Создаём текст, который будем отправлять в теле PATCH-запроса.
        String text = "This is expected to be sent back as part of response body.";

        // Отправляем PATCH-запрос на Postman Echo.
        // В body передаём обычный текст.
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(text)

                // Указываем метод PATCH и путь /patch.
                .when()
                .patch("/patch")

                // Проверяем ответ:
                // 1. код ответа должен быть 200;
                // 2. поле data должно содержать отправленный текст.
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }


    @Test
    public void deleteRequestShouldReturnSentText() {

        // Создаём текст, который будем отправлять в теле DELETE-запроса.
        String text = "This is expected to be sent back as part of response body.";

        // Отправляем DELETE-запрос на Postman Echo.
        // В body передаём обычный текст.
        given()
                .baseUri("https://postman-echo.com")
                .contentType("text/plain")
                .body(text)

                // Указываем метод DELETE и путь /delete.
                .when()
                .delete("/delete")

                // Проверяем ответ:
                // 1. код ответа должен быть 200;
                // 2. поле data должно содержать отправленный текст.
                .then()
                .statusCode(200)
                .body("data", equalTo(text));
    }
}
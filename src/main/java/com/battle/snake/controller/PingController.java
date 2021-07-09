package com.battle.snake.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@Controller("ping")
@RequiredArgsConstructor
public class PingController {

    @Get
    @Produces(MediaType.TEXT_HTML)
    public HttpResponse<String> ping(){
        return HttpResponse.ok("<b>Flávim javeiro.</b>");
    }
}

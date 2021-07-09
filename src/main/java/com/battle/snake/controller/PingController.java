package com.battle.snake.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Singleton
@Controller("ping")
@RequiredArgsConstructor
public class PingController {

    @Get
    public HttpResponse<String> ping(){
        return HttpResponse.ok("Sombrinha Deus do JAVA.");
    }
}

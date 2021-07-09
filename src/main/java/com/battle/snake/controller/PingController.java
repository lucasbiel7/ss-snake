package com.battle.snake.controller;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Controller("ping")
@RequiredArgsConstructor
public class PingController {

    @Get
    public HttpResponse<String> ping(){
        return HttpResponse.ok("Flávim javeiro.");
    }
}

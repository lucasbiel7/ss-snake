package com.battle.snake.controller;

import com.battle.snake.model.GameInformation;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.annotation.Produces;
import lombok.RequiredArgsConstructor;

import javax.inject.Singleton;

@Singleton
@Controller("/")
@RequiredArgsConstructor
public class SnakeController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    public HttpResponse<GameInformation> info(){
        return HttpResponse.ok(
                GameInformation.builder()
                .author("Flávim do baile da vilarinho")
                .version("0.1")
                .apiVersion("1")
                .color("#952553")
                .head("beluga")
                .tail("default")
                .build()
        );
    }

    @Post("start")
    public HttpResponse<Void> start(){

        return HttpResponse.ok();
    }
}

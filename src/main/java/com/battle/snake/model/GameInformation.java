package com.battle.snake.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Builder
public class GameInformation {

    @JsonAlias("apiversion")
    private String apiVersion;

    private String author;

    private String color;

    private String head;

    private String tail;

    private String version;


}

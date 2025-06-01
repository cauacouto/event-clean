package com.EventClean.EventClean.cors.domin;

import com.EventClean.EventClean.cors.Emuns.tipoEvento;

import java.time.LocalDateTime;

public class Event {

    private Long id;
    private String name;
    private String description;
    private LocalDateTime dateInitial;
    private  LocalDateTime dateEnd;
    private String identifier;
    private String location;
    private String organizer;
    private tipoEvento tipo;

}

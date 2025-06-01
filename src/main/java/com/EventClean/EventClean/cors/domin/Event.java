package com.EventClean.EventClean.cors.domin;

import com.EventClean.EventClean.cors.Enums.tipoEvento;

import java.time.LocalDateTime;

public record Event(   Long id,
                        String name,
                        String description,
                        LocalDateTime dateInitial,
                        LocalDateTime dateEnd,
                        String identifier,
                       String localEvent,
                        String organizer,
                        tipoEvento Etipo){}










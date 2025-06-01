package com.EventClean.EventClean.cors.useCases;

import com.EventClean.EventClean.cors.domin.Event;

public interface BuscarEventoCase {

    public Event execute(String name);
}

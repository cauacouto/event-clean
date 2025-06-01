package com.EventClean.EventClean.infra.persistence;

import com.EventClean.EventClean.cors.Enums.tipoEvento;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Entity(name = "event")
@Table(name= "events")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EventEntity {

@Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
   private Long id;
   private String name;
   private String description;
   private LocalDateTime dateInitial;
   private LocalDateTime dateEnd;
   private String identifier;
   private String localEvent;
   private Integer capacity;
  private  String organizer;
  @Enumerated(EnumType.STRING)
   private tipoEvento tipo;
}

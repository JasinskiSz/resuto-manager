package com.jasinski.resutomanager.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@AllArgsConstructor
@Data
public class ReservationCreationDto {
    private final LocalDateTime start;
}

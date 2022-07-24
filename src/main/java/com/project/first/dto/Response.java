package com.project.first.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Response {
    Long requestId;
    String farmid;
    LocalDateTime dateTime;
    String duration;
    String status;
}

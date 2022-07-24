package com.project.first.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.intellij.lang.annotations.Pattern;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class Request {
    String farmid;
    LocalDateTime dateTime;
    String duration;

}

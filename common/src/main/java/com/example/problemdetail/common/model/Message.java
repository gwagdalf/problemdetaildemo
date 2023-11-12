package com.example.problemdetail.common.model;


import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Message {
	private int id;
	private String text;
	private LocalDateTime time;

}

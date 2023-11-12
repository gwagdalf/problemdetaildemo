package com.example.problemdetail.iiold.errorhandler;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime time, int status, String error, String message, String path) {


}

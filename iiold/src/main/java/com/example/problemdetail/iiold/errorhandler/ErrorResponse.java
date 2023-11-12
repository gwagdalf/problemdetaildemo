package com.example.problemdetail.iiold.errorhandler;

import java.time.LocalDateTime;

public record ErrorResponse(LocalDateTime timestamp, int status, String error, String message, String path) {


}

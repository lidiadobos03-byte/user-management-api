package com.lidiadobos.usermanagement.common;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.Instant;

public record ApiError(
        @Schema(description = "The time when the error occurred", example = "2026-03-24T16:52:41.168281Z")
        Instant timestamp,

        @Schema(description = "HTTP status code", example = "409")
        int status,

        @Schema(description = "HTTP error label", example = "Conflict")
        String error,

        @Schema(description = "Application-specific error message", example = "A user with the same email already exists.")
        String message,

        @Schema(description = "Request path that triggered the error", example = "/users")
        String path
) {
}

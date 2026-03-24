package com.lidiadobos.usermanagement.user;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record UserRequest(
        @NotBlank(message = "Name is required")
        @Schema(description = "User full name", example = "Jane Doe")
        String name,

        @NotBlank(message = "Email is required")
        @Email(message = "Email must be valid")
        @Schema(description = "User email address", example = "jane@example.com")
        String email,

        @NotNull(message = "Age is required")
        @Min(value = 0, message = "Age must be 0 or greater")
        @Schema(description = "User age", example = "28", minimum = "0")
        Integer age
) {
}

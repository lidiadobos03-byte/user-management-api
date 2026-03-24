package com.lidiadobos.usermanagement.user;

import io.swagger.v3.oas.annotations.media.Schema;

public record UserResponse(
        @Schema(description = "User identifier", example = "1")
        Long id,

        @Schema(description = "User full name", example = "Jane Doe")
        String name,

        @Schema(description = "User email address", example = "jane@example.com")
        String email,

        @Schema(description = "User age", example = "28")
        Integer age
) {

    public static UserResponse fromEntity(UserEntity user) {
        return new UserResponse(
                user.getId(),
                user.getName(),
                user.getEmail(),
                user.getAge()
        );
    }
}

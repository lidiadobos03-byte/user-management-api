package com.lidiadobos.usermanagement.user;

public record UserResponse(
        Long id,
        String name,
        String email,
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

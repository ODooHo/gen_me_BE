package com.eyeco.genmeserver.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {
    USER_NOT_FOUND(HttpStatus.NOT_FOUND, "User not founded"),
    NICKNAME_ALREADY_EXIST(HttpStatus.CONFLICT,"Nickname already exists"),
    GAME_NOT_FOUND(HttpStatus.NOT_FOUND,"Game not founded"),
    INVALID_PERMISSION(HttpStatus.UNAUTHORIZED, "Participant doesn't have permission to create games"),
    DATABASE_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Database error occurs");

    private final HttpStatus status;
    private final String message;
}

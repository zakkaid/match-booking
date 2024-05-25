package com.example.MatchBooking.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ExceptionPayloadFactory {

    TECHNICAL_ERROR(0, HttpStatus.INTERNAL_SERVER_ERROR, "technical.error"),
    INVALID_PAYLOAD(1, HttpStatus.BAD_REQUEST, "invalid.request.payload"),
    MISSING_REQUEST_BODY_ERROR_CODE(3, HttpStatus.BAD_REQUEST, "request.missing.body"),
    INVALID_FORM_REGISTRATION_PAYLOAD(4, HttpStatus.BAD_REQUEST, "invalid.form.registration"),
    FIELD_NOT_FOUND(5, HttpStatus.BAD_REQUEST, "field.not.found"),
    PLAYER_NOT_FOUND(6, HttpStatus.BAD_REQUEST, "player.not.found"),
    EMAIL_OR_PASSWORD_WRONG(7, HttpStatus.BAD_REQUEST, "email.or.password.wrong"),
    START_MATCH_DATE_INVALID(8, HttpStatus.BAD_REQUEST, "start.match.date.invalid"),
    EMAIL_ALREADY_EXIST(9, HttpStatus.BAD_REQUEST, "email.already.exist"),
    ;

    private final Integer code;
    private final HttpStatus status;
    private final String message;

    public ExceptionPayload get() {
        return new ExceptionPayload(code, status, message);
    }
}



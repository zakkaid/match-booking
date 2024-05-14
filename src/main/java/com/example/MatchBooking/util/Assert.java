package com.example.MatchBooking.util;

import com.example.MatchBooking.exception.BusinessException;
import com.example.MatchBooking.exception.ExceptionPayloadFactory;

import java.util.regex.Pattern;

public interface Assert {


    static void assertNotNull(Object value) {
        if (value == null) throw new BusinessException(ExceptionPayloadFactory.INVALID_PAYLOAD.get());
    }
    static void assertRegex(String value, String regex) {
        if (value == null || !Pattern.compile(regex).matcher(value).matches())
            throw new BusinessException(ExceptionPayloadFactory.INVALID_FORM_REGISTRATION_PAYLOAD.get());
    }

}

package com.umc.apiPayload.code.exception.handler;

import com.umc.apiPayload.code.BaseErrorCode;
import com.umc.apiPayload.code.exception.GeneralException;

public class TempHandler extends GeneralException {
    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}

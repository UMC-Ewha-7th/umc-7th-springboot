package com.umc.service.TempService;

import com.umc.apiPayload.code.exception.handler.TempHandler;
import com.umc.apiPayload.code.status.ErrorStatus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{
    @Override
    public void CheckFlag(Integer flag) {
        if(flag ==1){
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
        }
    }
}

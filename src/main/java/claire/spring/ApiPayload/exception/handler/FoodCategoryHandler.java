package claire.spring.ApiPayload.exception.handler;

import claire.spring.ApiPayload.code.BaseErrorCode;
import claire.spring.ApiPayload.exception.GeneralException;

public class FoodCategoryHandler extends GeneralException {
    public FoodCategoryHandler(BaseErrorCode errorCode) { super(errorCode); }
}
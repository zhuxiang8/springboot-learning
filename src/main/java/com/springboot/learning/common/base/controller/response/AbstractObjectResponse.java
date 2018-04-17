package com.springboot.learning.common.base.controller.response;

/**
 * @author
 * @date
 */
public class AbstractObjectResponse extends AbstractResponse {
    private Object object;

    public AbstractObjectResponse() {
    }

    public AbstractObjectResponse(boolean status, String message, Object object) {
        super(status, message);
        this.object = object;
    }

    public static AbstractObjectResponse createSuccessResponse(String message, Object object) {
        return new AbstractObjectResponse(true, message, object);
    }

    public static AbstractObjectResponse createFailResponse(String message, Object object) {
        return new AbstractObjectResponse(false, message, object);
    }


    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "AbstractObjectResponse{" +
                "object=" + object +
                "} " + super.toString();
    }
}

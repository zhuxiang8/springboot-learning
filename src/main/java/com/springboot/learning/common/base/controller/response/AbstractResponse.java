package com.springboot.learning.common.base.controller.response;

/**
 * @author
 * @date
 */
public abstract class AbstractResponse {

    private boolean success;
    private String message;

    public AbstractResponse() {
    }

    public AbstractResponse(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }

    public static AbstractResponse createSuccessResponse() {
        return new AbstractResponse() {
            @Override
            public boolean isSuccess() {
                return true;
            }
        };
    }

    public static AbstractResponse createSuccessResponse(String message) {
        return new AbstractResponse() {
            @Override
            public boolean isSuccess() {
                return true;
            }

            @Override
            public String getMessage() {
                return message;
            }

        };
    }

    public static AbstractResponse createFailedResponse() {
        return new AbstractResponse() {
            @Override
            public boolean isSuccess() {
                return false;
            }
        };
    }

    public static AbstractResponse createFailedResponse(String message) {
        return new AbstractResponse() {
            @Override
            public boolean isSuccess() {
                return false;
            }

            @Override
            public String getMessage() {
                return message;
            }

        };
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "AbstractResponse{" +
                "success=" + success +
                ", message='" + message + '\'' +
                '}';
    }
}

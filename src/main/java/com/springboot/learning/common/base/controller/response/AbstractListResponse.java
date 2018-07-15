package com.springboot.learning.common.base.controller.response;

import java.util.List;

/**
 * @param <T>
 * @author
 * @date
 */
public abstract class AbstractListResponse<T> extends AbstractResponse {

    private List<T> data;

    public AbstractListResponse() {
    }

    public AbstractListResponse(boolean status, String message, List<T> data) {
        super(status, message);
        this.data = data;
    }

    public static AbstractListResponse createSuccessResponse(String message, List data) {
        return new AbstractListResponse() {
            @Override
            public boolean isSuccess() {
                return true;
            }

            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public List getData() {
                return data;
            }

        };
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "AbstractListResponse{" +
                "data=" + data +
                "} " + super.toString();
    }
}

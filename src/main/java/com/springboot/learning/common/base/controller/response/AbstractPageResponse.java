package com.springboot.learning.common.base.controller.response;

import java.util.List;

/**
 * @author
 * @date
 * @param <T>
 */
public class AbstractPageResponse<T> extends AbstractResponse {

    private List<T> data;
    private long totalElements;
   	
    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public long getTotalElements() {
        return totalElements;
    }

    public void setTotalElements(long totalElements) {
        this.totalElements = totalElements;
    }

    public AbstractPageResponse() {
    }
    public AbstractPageResponse(List<T> data, long totalElements) {
        this.data = data;
        this.totalElements = totalElements;
    }

    public AbstractPageResponse(boolean success, String message, List<T> data, long totalElements) {
        super(success, message);
        this.data = data;
        this.totalElements = totalElements;
    }

    public static AbstractPageResponse createSuccessResponse(String message){
        return new AbstractPageResponse() {
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

    public static AbstractPageResponse createFailedResponse(String message){
        return new AbstractPageResponse() {
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

    public static AbstractPageResponse createSuccessResponse(String message, List data, long totalElements){
        return new AbstractPageResponse() {
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

            @Override
            public long getTotalElements() {
                return totalElements;
            }
        };
    }

    public static AbstractPageResponse createFailedResponse(String message, List data, long totalElements){
        return new AbstractPageResponse() {
            @Override
            public boolean isSuccess() {
                return false;
            }

            @Override
            public String getMessage() {
                return message;
            }

            @Override
            public List getData() {
                return data;
            }

            @Override
            public long getTotalElements() {
                return totalElements;
            }
        };
    }

    @Override
    public String toString() {
        return "AbstractPageResponse{" +
                "data=" + data +
                ", totalElements=" + totalElements +
                "} " + super.toString();
    }
}

package com.springboot.learning.common.base.controller.request;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author zhuxiang
 * @Date 2018/4/8 13:58
 */
public class AbstractSearchRequest extends AbstractRequest {
    private Map<String, Object> params = new HashMap<String, Object>();
    private String orderBy;
    private String sortBy;
    private int pageNumber = 1;
    private int pageSize = 10;

    public Map<String, Object> getParams() {
        return params;
    }

    public AbstractSearchRequest setParams(Map<String, Object> params) {
        this.params = params;
        return this;
    }

    public String getOrderBy() {
        return orderBy;
    }

    public AbstractSearchRequest setOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    public String getSortBy() {
        return sortBy;
    }

    public AbstractSearchRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public AbstractSearchRequest setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    public int getPageSize() {
        return pageSize;
    }

    public AbstractSearchRequest setPageSize(int pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @Override
    public String toString() {
        return "AbstractSearchRequest{" +
                "params=" + params +
                ", orderBy='" + orderBy + '\'' +
                ", sortBy='" + sortBy + '\'' +
                ", pageNumber=" + pageNumber +
                ", pageSize=" + pageSize +
                "} " + super.toString();
    }
}

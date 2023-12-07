package org.sunso.ddd.components.dto;

import lombok.Data;

/**
 * @author sunso520
 * @Title:PageQuery
 * @Description: <br>
 * @Created on 2023/12/6 15:41
 */
@Data
public abstract class PageQuery extends BaseSerializable {
    private static final int DEFAULT_PAGE_SIZE = 20;

    private int pageSize = DEFAULT_PAGE_SIZE;

    private int pageIndex = 1;

    private String orderBy;

    public int getPageIndex() {
        if (pageIndex < 1) {
            return 1;
        }
        return pageIndex;
    }

    public int getPageSize() {
        if (pageSize < 1) {
            pageSize = DEFAULT_PAGE_SIZE;
        }
        return pageSize;
    }


}

package org.sunso.ddd.components.dto;

import lombok.Data;

import java.util.Collection;
import java.util.Collections;

/**
 * @author sunso520
 * @Title:PageData
 * @Description: <br>
 * @Created on 2023/12/6 15:48
 */
@Data
public class PageData<T> extends BaseSerializable {
    private int totalCount = 0;

    private int pageSize = 1;

    private int pageIndex = 1;

    private Collection<T> data;

    public int getTotalPages() {
        return this.totalCount % this.pageSize == 0 ? this.totalCount
                / this.pageSize : (this.totalCount / this.pageSize) + 1;
    }

    public static <T> PageData<T> of(int pageSize, int pageIndex) {
        return of(Collections.emptyList(), 0, pageSize, pageIndex);
    }

    public static <T> PageData<T> of(Collection<T> data, int totalCount, int pageSize, int pageIndex) {
        PageData<T> pageData = new PageData<>();
        pageData.setData(data);
        pageData.setTotalCount(totalCount);
        pageData.setPageSize(pageSize);
        pageData.setPageIndex(pageIndex);
        return pageData;
    }
}

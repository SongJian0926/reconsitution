package com.hsbc.reconsitution.modle;

import com.hsbc.reconsitution.until.SearchQueryData;

import java.util.ArrayList;
import java.util.List;

public class FilterChina implements Filter {
    List<Filter> filterList = new ArrayList<>();
    public FilterChina add(Filter filter){
        this.filterList.add(filter);
        return this;
    }

    @Override
    public SearchQueryData doFilter(String[] split, SearchQueryData queryData) {
        filterList.forEach((filter -> {
            filter.doFilter(split,queryData);
        }));
        return queryData;
    }
}

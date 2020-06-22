package com.hsbc.reconsitution.modle;

import com.hsbc.reconsitution.until.SearchQueryData;

public class GreaterThanZero implements Filter {
    @Override
    public SearchQueryData doFilter(String[] split, SearchQueryData queryData) {
        if(split.length>0){
            queryData.setTextSearch(split[0]);
        }
        return queryData;
    }
}

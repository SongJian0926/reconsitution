package com.hsbc.reconsitution.modle;

import com.hsbc.reconsitution.until.SearchQueryData;

public class GreaterThanOne implements Filter {
    @Override
    public SearchQueryData doFilter(String[] split, SearchQueryData queryData) {
        if(split.length>1){
            queryData.setTextSearch(split[1]);
        }
        return queryData;
    }
}

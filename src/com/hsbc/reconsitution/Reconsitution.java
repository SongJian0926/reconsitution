package com.hsbc.reconsitution;

import com.hsbc.reconsitution.modle.FilterChina;
import com.hsbc.reconsitution.modle.GreaterThanOne;
import com.hsbc.reconsitution.modle.GreaterThanOther;
import com.hsbc.reconsitution.modle.GreaterThanZero;
import com.hsbc.reconsitution.until.SearchQueryData;

public class Reconsitution {

    public SearchQueryData comcomdecodeQuery(String query) {
        SearchQueryData queryData = new SearchQueryData();
        FilterChina china = new FilterChina();
        china.add(new GreaterThanZero()).add(new GreaterThanOne()).add(new GreaterThanOther());
        if(null!=query) {
            String[] split = query.split(":");
            queryData = china.doFilter(split,queryData);
        }
        return queryData;
    }
}

package com.hsbc.reconsitution.modle;

import com.hsbc.reconsitution.until.SearchQueryData;

public interface Filter {
    SearchQueryData doFilter(String[] split, SearchQueryData queryData);
}

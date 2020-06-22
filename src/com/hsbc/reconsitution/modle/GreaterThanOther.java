package com.hsbc.reconsitution.modle;

import com.hsbc.reconsitution.until.SearchQueryData;
import com.hsbc.reconsitution.until.SearchQueryTermData;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

public class GreaterThanOther implements Filter {
    @Override
    public SearchQueryData doFilter(String[] split, SearchQueryData queryData) {
        List<SearchQueryTermData> terms = new ArrayList<>();
        for(int i = 2; (i + 1) < split.length; i += 2) {
            SearchQueryTermData termData = new SearchQueryTermData();
            termData.setKey(split[i]);
            try {
                termData.setValue(URLDecoder.decode(split[i + 1], "utf-8"));
            }catch(UnsupportedEncodingException e) {
                // the exception should be handled
            }
            terms.add(termData);
        }
        queryData.setQueryTerms(terms);

        return queryData;
    }
}

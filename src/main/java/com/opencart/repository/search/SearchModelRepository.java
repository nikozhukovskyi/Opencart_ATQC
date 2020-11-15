package com.opencart.repository.search;

import com.opencart.datamodel.login.LoginModel;
import com.opencart.datamodel.search.SearchModel;

public class SearchModelRepository {

    private SearchModelRepository(){
    }

    public static SearchModel getSearchModel() {
        return SearchModel.builder()
                .search("apple")
                .build();
    }
}

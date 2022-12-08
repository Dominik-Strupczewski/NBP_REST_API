package com.example.xCodeRestApi.Service;

import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;
import com.example.xCodeRestApi.Model.TableJsonModel;
import com.example.xCodeRestApi.RestClient.RestClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class WebService  {

    private final RestClient restClient ;

    public String getSortTable(List<TableJsonModel> table ) {
        return restClient.getSortTable(table).orElseThrow() ;
    }


    public Double getRateByCode(List<CurrenciesCodeJsonModel> code) throws IOException {
        return restClient.getRateByCode(code) ;
    }


}

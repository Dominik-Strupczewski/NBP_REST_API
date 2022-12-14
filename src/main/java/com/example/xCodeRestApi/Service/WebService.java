package com.example.xCodeRestApi.Service;

import com.example.xCodeRestApi.Exception.CurrencyNotFoundException;
import com.example.xCodeRestApi.Exception.InvalidValueException;
import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;
import com.example.xCodeRestApi.Model.TableJsonModel;
import com.example.xCodeRestApi.RestClient.RestClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;



@RequiredArgsConstructor
@Service
@Slf4j
public class WebService  {

    private final RestClient restClient ;

    public List<Integer> getSortTable(List<TableJsonModel> table )  {
        try {
            return restClient.getSortTable(table);
        }catch(Exception ex) {
            log.info("GetSortTable error handled from WebSevice, no value returned") ;
            new InvalidValueException(table) ;
            return null ;
        }
    }


    public Double getRateByCode(List<CurrenciesCodeJsonModel> code)  {
        try {

            return restClient.getRateByCode(code);
        } catch(IOException | RuntimeException e) {
            log.info("GetRateByCode error handled from WebService, no value returned");
            new CurrencyNotFoundException(code) ;
            return null ;


        }
    }


}

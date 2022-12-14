package com.example.xCodeRestApi.RestClient;

import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;
import com.example.xCodeRestApi.Model.CurrencyJsonModel;
import com.example.xCodeRestApi.Model.TableJsonModel;
import com.google.gson.Gson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Collections;
import java.util.List;


@Component
@Slf4j
public class RestClient   {


    public Double getRateByCode(List<CurrenciesCodeJsonModel> code) throws IOException  {

        try {
            URL url = new URL("https://api.nbp.pl/api/exchangerates/rates/A/" + code.get(0).getCurrency());
            InputStreamReader reader = new InputStreamReader(url.openStream());
            CurrencyJsonModel currencyJson = new Gson().fromJson(reader, CurrencyJsonModel.class);
            return currencyJson.getRates().get(0).getMid();


        }catch (FileNotFoundException | NullPointerException e){
            log.info("Forwarded from  RestClient class " + code.toString());
            throw new RuntimeException() ;
        }


    }


    public List<Integer> getSortTable(List<TableJsonModel> table) throws Exception {


            TableJsonModel table1 = table.get(0);
            List<Integer> arr = table1.getNumbers() ;
            if (table1.getOrder().equals("ASC")) {
                Collections.sort(arr);
                return arr;
            }else if (table1.getOrder().equals("DESC"))
            {
                    Collections.sort(arr);
                    Collections.reverse(arr);
                    return arr;
                }
            log.info("Forwarded from RestClient class" + table );
             throw new Exception() ;
            }




    }



package com.example.xCodeRestApi.RestClient;

import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;
import com.example.xCodeRestApi.Model.CurrencyJsonModel;
import com.example.xCodeRestApi.Model.TableJsonModel;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


@Component
public abstract class RestClient {


    public double getRateByCode(List<CurrenciesCodeJsonModel> code) throws IOException {


        URL url = new URL("https://api.nbp.pl/api/exchangerates/rates/A/" + code.get(0).getCurrency());
        InputStreamReader reader = new InputStreamReader(url.openStream());
        CurrencyJsonModel currencyJson = new Gson().fromJson(reader, CurrencyJsonModel.class);


        return currencyJson.getRates().get(0).getMid();


    }


    public String getSortTable(List<TableJsonModel> table) {

        TableJsonModel table1 = table.get(0);
        Integer[] arr = table1.getNumbers().toArray(new Integer[0]);
        if (table1.getOrder().equals("ASC")) {
            Arrays.sort(arr);
            return Arrays.toString(arr) ;
        }
        if (table1.getOrder().equals("DESC")){
            Arrays.sort(arr, Collections.reverseOrder());
            return Arrays.toString(arr) ;}


        return "a";



}




}

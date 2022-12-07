package com.example.xCodeRestApi.ApiController;

import com.example.xCodeRestApi.Exception.InvalidValueTypeException;
import com.example.xCodeRestApi.Model.CurrenciesCodeJsonModel;
import com.example.xCodeRestApi.Model.TableJsonModel;
import com.example.xCodeRestApi.Service.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class RestApiController {


    private final WebService webService ;


    //PONG response
    @GetMapping("/status/ping")
    public ResponseEntity.BodyBuilder pong(){
        String pong = "PONG" ;
        return (ResponseEntity.BodyBuilder) ResponseEntity.status(HttpStatus.CREATED)
                .body(pong);
    }



    //Json Request , sort table response by ASC or DESC
    @PostMapping("/numbers/sort-command")
    public String sortTable(
            @RequestBody List<TableJsonModel> table) throws InvalidValueTypeException {
        return webService.getSortTable(table) ;
    }

    //Json Request , Rate response from NBP API
    @PostMapping("/currencies/get-current-currency-value-command")
    public Double getCurrency(@RequestBody List<CurrenciesCodeJsonModel> code) throws IOException {
            return webService.getRateByCode(code) ;



            }
    }




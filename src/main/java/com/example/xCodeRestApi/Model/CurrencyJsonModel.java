package com.example.xCodeRestApi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Builder
public class CurrencyJsonModel {
    @SerializedName("table")
    @Expose
    private String table;

    @SerializedName("currency")
    @Expose
    private String currency;

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName("rates")
    @Expose
    private List<RateJsonModel> rates ;
}

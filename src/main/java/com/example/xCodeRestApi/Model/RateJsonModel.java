package com.example.xCodeRestApi.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RateJsonModel {

    @SerializedName("no")
    @Expose
    private String no;

    @SerializedName("effectiveDate")
    @Expose
    private String effectiveDate;

    @SerializedName("mid")
    @Expose
    private Double mid;


}

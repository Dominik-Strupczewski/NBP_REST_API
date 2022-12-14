package com.example.xCodeRestApi.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class TableJsonModel {

    private List<Integer> numbers ;

    private String order ;
}

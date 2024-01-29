package com.Buisness.DataDemo.Implementation.Logic;

import com.Buisness.DataDemo.Core.IDataService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.Buisness.DataDemo.Implementation.Data")
public class DataProcessing {
    private IDataService _dataService;
    public void printData(){
        this._dataService.rerieveData().forEach(System.out::println);
    }
    public DataProcessing(IDataService _dataService){
            this._dataService = _dataService;
    }
}

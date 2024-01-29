package com.Buisness.DataDemo.Implementation.Logic;

import com.Buisness.DataDemo.Core.IDataService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@ComponentScan("com.Buisness.DataDemo.Implementation.Data")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DataProcessing {
    private final IDataService _dataService;
    public void printData(){
        this._dataService.rerieveData().forEach(System.out::println);
    }
    public DataProcessing(@Qualifier("MongoData") IDataService _dataService){
            this._dataService = _dataService;
    }
}

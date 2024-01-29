package com.Buisness.DataDemo.Implementation.Data;

import com.Buisness.DataDemo.Core.IDataService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class MongoDbService implements IDataService {
    @Override
    public ArrayList<Integer> rerieveData() {
        ArrayList<Integer> result =  new ArrayList<>();
        for(int i=0; i< 10; i++){
            result.add(i);
        }
        return result;
    }
}

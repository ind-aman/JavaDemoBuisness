package com.Buisness.DataDemo.Implementation.Data;

import com.Buisness.DataDemo.Core.IDataService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
@Primary
public class MySqlDataService implements IDataService {
    @Override
    public ArrayList<Integer> rerieveData() {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i =0; i<10; i++){
            result.add(i*9);
        }
        return  result;
    }
}

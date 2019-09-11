package com.example.demo.Service;

import com.example.demo.response.DataMsg;
import com.example.demo.response.Data_24hourMsg;
import com.example.demo.response.Message;

public interface Data_24hourService {
    boolean fistUpd();

    boolean saveData_24hour(DataMsg data);

    boolean IsCountTrue();

    boolean delOldData();

    Message<Data_24hourMsg> selbyFilter(String[][] filters);
}

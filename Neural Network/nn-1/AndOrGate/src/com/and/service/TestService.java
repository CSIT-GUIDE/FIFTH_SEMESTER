package com.and.service;

import com.and.model.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zephyr on 7/8/15.
 */
public class TestService {
    private Connection connection = null;
    private ResultSet resultSet = null;
    private Statement statement;
    private String query;
    private Test result = new Test();

    public TestService() throws Exception{
        connection = new Database().getDbConnection();
        statement = connection.createStatement();
    }

    public Test getWeights() throws SQLException {
        float[] weights = new float[2];
        query="select * from andweights";
        resultSet=statement.executeQuery(query);

        while (resultSet.next()){
            weights[0]=resultSet.getFloat("weight1");
            weights[1]=resultSet.getFloat("weight2");
        }
        System.out.println(weights[0]+" "+weights[1]);
        Test weight = new Test(weights);
        return weight;
    }

    public Test calculateOutput(Test test){
        int t=0;
        float out=0;
        int[] inp = test.getInput();
        float[] wt = test.getWeight();

        for (int i = 0; i <2 ; i++) {
            out+=wt[i]+inp[i];
        }
        for (int i = 0; i <2 ; i++) {
            if (inp[i]<0) {
                t=0;
                break;
            }
            else {
                t=1;
            }
        }
        float error=(t-out);

        result = new Test(out,error);

        return result;
    }
}

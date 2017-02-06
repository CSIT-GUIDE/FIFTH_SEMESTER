package com.and.service;

import com.and.model.Train;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by zephyr on 7/7/15.
 */
public class TrainService {
    private Connection connection = null;
    private Statement statement;
    private String query;

    private Train train = new Train();

    public TrainService() throws Exception{
        connection = new Database().getDbConnection();
        statement = connection.createStatement();
    }

    public void storeWeights(float[] weights) throws SQLException {
        query="delete from andweights";
        statement.execute(query);
        query="insert into andweights(weight1,weight2) values("+weights[0]+","+weights[1]+")";
        statement.execute(query);
        connection.close();
    }

    public Train calculateWeight(Train inputs){
        float out;
        int[] y = new int[4];
        int[] t={1,0,0,0};
        boolean valid = false;
        int[][] input = inputs.getIp1();
        float[] weight = inputs.getWeights();

        for(int i=0;i<10000;i++) {
            for(int j = 0; j<4; j++) {
                out=0;
                for(int k =0; k<2;k++){
                    out += input[k][j] * weight[k];
                }
                y[j] = out >= 1 ? 1 : 0;
                /*System.out.println("y["+j+"]=="+y[j]);*/
            }
            for(int j=0;j<4;j++){
                if(t[j]==y[j]){
                    valid =true;
                }
                else{
                    valid =false;
                    break;
                }
            }
            if(valid){
                /*for(int j=0;j<4;j++){
                    //System.out.println("y["+j+"]=="+y[j]);
                    System.out.println(" y["+j+"]=="+y[j]+" t["+j+"]=="+t[j]+" weight["+0+"]=="+weight[0]+" weight["+0+"]=="+weight[1]);
                }*/
                break;
            }
            else{
                train.incrIt();
                adjustWeight(weight);
            }
            //-----------------------------------
        }
        Train trained=new Train(train.getIt(),weight);
        return trained;
    }

    private void adjustWeight(float w[]){
        int k;
        for(k=0;k<2;k++){
            if(w[k]>=1){
                w[k]-=0.5;
            }
            else{
                w[k]+=0.1;
            }
        }
    }
}

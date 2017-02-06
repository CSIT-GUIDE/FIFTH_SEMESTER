package com.and.controller;

import com.and.model.Test;
import com.and.service.TestService;

import java.io.IOException;

/**
 * Created by zephyr on 7/8/15.
 */
public class TestController extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        TestService service = null;
        Test weights = null;
        try {
            service = new TestService();
            weights=service.getWeights();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (weights.getWeight()[0]==0){
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        }
        else {
            int[] input = new int[2];
            String valid = request.getParameter("input0");

            if(valid==null){
                request.getRequestDispatcher("view/test.jsp").forward(request,response);
            }
            else{
                for(int i=0;i<2;i++){
                    input[i] = Integer.parseInt(request.getParameter("input"+i));
                }
                float[] weight = weights.getWeight();
                //System.out.println(weights);
                weights = new Test(input,weight);
                //System.out.println(weights);
                Test output=service.calculateOutput(weights);

                //System.out.println(output.getOutput);
                request.setAttribute("output",output.getOutput());
                request.setAttribute("error",output.getError());
                request.getRequestDispatcher("/view/testOutput.jsp").forward(request,response);
            }
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}

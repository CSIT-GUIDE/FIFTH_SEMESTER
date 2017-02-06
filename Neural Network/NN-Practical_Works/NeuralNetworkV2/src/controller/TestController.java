package controller;

import model.Test;
import service.TestService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Zephyr on 2/16/2015.
 */
@WebServlet(name = "Test1Controller")
public class TestController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //System.out.println("hoho");
        doPost(request,response);
    }
}

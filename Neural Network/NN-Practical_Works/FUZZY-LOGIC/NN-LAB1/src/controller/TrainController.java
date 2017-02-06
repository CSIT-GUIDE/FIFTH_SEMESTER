package controller;

import model.Train;
import service.TrainService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "TrainServlet")
public class TrainController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Train train;
        int[][] input = new int[2][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                input[i][j] = Integer.parseInt(request.getParameter("input"+i+j));

            }
        }
        /*for(int i=0;i<2;i++){
            for(int j=0;j<4;j++){
                System.out.println(input[i][j]);
            }
        }*/
        float[] weight = new float[2];
        for(int i=0;i<2;i++){
            weight[i] = Float.parseFloat(request.getParameter("initweight" + i));
        }
        /*for (float x : weight){
            System.out.println(x);
        }*/
        train=new Train(input,weight);

        TrainService service = null;
        try {
            service = new TrainService();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Train trained = service.calculateWeight(train);

        float[] finWeight=trained.getWeights();
        int it=trained.getIt();

        try {
            service.storeWeights(finWeight);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        /*System.out.println(finWeight[0]);
        System.out.println(finWeight[1]);*/

        request.setAttribute("weight1",finWeight[0]);
        request.setAttribute("weight2",finWeight[1]);
        request.setAttribute("iter",it);
        request.getRequestDispatcher("/view/train.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

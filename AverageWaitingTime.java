public class AverageWaitingTime {
    public static double avgWaitingTime(int[][] customers){
        double waitTime = 0;
        int startTime = customers[0][0];
        int finishTime = 0;
        for (int i=0; i<customers.length; i++){
            if (finishTime < customers[i][0]){
                startTime = customers[i][0];
            }
            finishTime = startTime + customers[i][1];

            waitTime += finishTime - customers[i][0];
            startTime = finishTime;
        }
        return waitTime/customers.length;
    }
    public static void main(String[] args) {
        int[][] customers = {{5,2},{5,4},{10,3},{20,1}};
        System.out.println(avgWaitingTime(customers));
    }
}

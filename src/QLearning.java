import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QLearning {
    private double[][] R = new double[][]{
            {-100000.0D, -100000.0D, -100000.0D, -100000.0D, -0.1D, -100000.0D},
            {-100000.0D, -100000.0D, -100000.0D, -0.1D, -100000.0D, 100.0D},
            {-100000.0D, -100000.0D, -100000.0D, -0.1D, -100000.0D, -100000.0D},
            {-100000.0D, -0.1D, -0.1D, -100000.0D, -0.1D, -100000.0D},
            {-0.1D, -100000.0D, -100000.0D, -0.1D, -100000.0D, 100.0D},
            {-100000.0D, -0.1D, -100000.0D, -100000.0D, -0.1D, 100.0D}};
    private double[][] Q = new double[6][6];
    private Random random = new Random();

    public void run() {
        for(int epsisodeCounter = 0; epsisodeCounter < 100000; ++epsisodeCounter) {
            int state = this.random.nextInt(6);
            if (state != 5) {
                this.simulate(state);
            }
        }
    }
    private void simulate(int state) {
        int nextState;
        do {
            List<Integer> possibleNextStates = this.availableStates(state);
            nextState = (Integer)possibleNextStates.get(this.random.nextInt(possibleNextStates.size()));
            double maxQ = this.findMaxQ(nextState);
            this.Q[state][nextState] += 0.1D * (this.R[state][nextState] + 0.9D * maxQ - this.Q[state][nextState]);
            state = nextState;
        } while(nextState != 5);

    }
    private List<Integer> availableStates(int state) {
        List<Integer> possibleNextStates = new ArrayList();

        for(int colIndex = 0; colIndex < this.R.length; ++colIndex) {
            if (this.R[state][colIndex] > -100000.0D) {
                possibleNextStates.add(colIndex);
            }
        }

        return possibleNextStates;
    }

    private double findMaxQ(int nextState) {
        double maxQ = -100000.0D;

        for(int i = 0; i < this.Q.length; ++i) {
            if (this.Q[nextState][i] > maxQ) {
                maxQ = this.Q[nextState][i];
            }
        }

        return maxQ;
    }

    public void showResult() {
        for(int i = 0; i < this.Q.length; ++i) {
            for(int j = 0; j < this.Q.length; ++j) {
                System.out.printf("%.1f ", this.Q[i][j]);
            }

            System.out.println();
        }

    }

    public void showPolicy() {
        for(int i = 0; i < 6; ++i) {
            int state = i;
            System.out.print("Policy: " + i);

            while(state != 5) {
                int maxQState = 0;
                double maxQ = 0.0D;

                for(int j = 0; j < 6; ++j) {
                    if (this.Q[state][j] > maxQ) {
                        maxQ = this.Q[state][j];
                        maxQState = j;
                    }
                }

                System.out.print(" -> " + maxQState);
                state = maxQState;
            }

            System.out.println();
        }

    }
}

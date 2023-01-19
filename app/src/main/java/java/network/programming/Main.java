package java.network.programming;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Main {
    public static final int LENGTH = 36;
    private int node1;
    private int node2;
    private double averagePathLoss;
    private double dopplerShift;
    private int dopplerSpread;
    private double delay;
    private boolean manualControl;

    public int getNode1() {
        return node1;
    }

    public void setNode1(int node1) {
        this.node1 = node1;
    }

    public int getNode2() {
        return node2;
    }

    public void setNode2(int node2) {
        this.node2 = node2;
    }

    public byte[] toByteArray() {
        final byte[] ret = new byte[LENGTH];
        ret[0] = (byte) RFnestMessageTypeConstants.DCU_REQUEST_TYPE_A_TYPE;
        ret[1] = (byte) (getNode1() >> 24);
        ret[2] = (byte) (getNode1() >> 16);
        ret[3] = (byte) (getNode1() >>  8);
        ret[4] = (byte) getNode1();
        ret[5] = (byte) (getNode2() >> 24);
        ret[6] = (byte) (getNode2() >> 16);
        ret[7] = (byte) (getNode2() >>  8);
        ret[8] = (byte) getNode2();

        long bits = Double.doubleToLongBits(getAveragePathLoss());
        ret[9] = (byte) (bits >> 56);
        ret[10] = (byte) (bits >> 48);
        ret[11] = (byte) (bits >> 40);
        ret[12] = (byte) (bits >> 32);
        ret[13] = (byte) (bits >> 24);
        ret[14] = (byte) (bits >> 16);
        ret[15] = (byte) (bits >>  8);
        ret[16] = (byte) bits;

        bits = Double.doubleToLongBits(getDopplerShift());
        ret[17] = (byte) (bits >> 56);
        ret[18] = (byte) (bits >> 48);
        ret[19] = (byte) (bits >> 40);
        ret[20] = (byte) (bits >> 32);
        ret[21] = (byte) (bits >> 24);
        ret[22] = (byte) (bits >> 16);
        ret[23] = (byte) (bits >>  8);
        ret[24] = (byte) bits;

        ret[25] = (byte) (getDopplerSpread() >> 8);
        ret[26] = (byte) (getDopplerSpread());

        bits = Double.doubleToLongBits(getDelay());
        ret[27] = (byte) (bits >> 56);
        ret[28] = (byte) (bits >> 48);
        ret[29] = (byte) (bits >> 40);
        ret[30] = (byte) (bits >> 32);
        ret[31] = (byte) (bits >> 24);
        ret[32] = (byte) (bits >> 16);
        ret[33] = (byte) (bits >>  8);
        ret[34] = (byte) bits;

        ret[35] = (byte) (isManualControl() ? 0x01 : 0x00);

        return ret;
    }

    private boolean isManualControl() {
        return true;
    }

    private double getDelay() {
        return 0.0;
    }

    private int getDopplerSpread() {
        return 0;
    }

    private double getDopplerShift() {
        return 0.0;
    }

    private double getAveragePathLoss() {
        return 0.0;
    }


}
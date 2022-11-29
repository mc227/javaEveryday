package javaEveryday.com.DW;

public class OneRowNim {
    private int nSticks = 7;
    private int player = 1;

    public OneRowNim() {
    }

    public OneRowNim(int nSticks) {
        this.nSticks = nSticks;
    }

    public OneRowNim(int nSticks, int player) {
        this.nSticks = nSticks;
        this.player = player;
    }

    public boolean takeSticks(int num) {
        if(num < 1) {
            return false;
        } else if(num > 3) {
            return false;
        } else {
            nSticks = nSticks - num;
            player = 3 - player;
            return true;
        }
    }

    public int getnSticks() {
        return nSticks;
    }

    public int getPlayer() {
        return player;
    }

    public boolean gameOver(){
        return (nSticks <=0);
    }
    public  int getWinner() {
        if(nSticks < 1) return getPlayer();
        else return 0;
    }

    public void report() {
        System.out.println("Number of sticks left: " +
                getnSticks());
        System.out.println("Next turn by player " + getPlayer());
    }

    @Override
    public String toString() {
        return "nSticks=" + nSticks +
                ", player=" + player;
    }

//    public static void main(String[] args) {
//        OneRowNim g1 = new OneRowNim(11);
//        OneRowNim g2 = new OneRowNim(13);
//        g1.takeSticks(2);
//        System.out.println(g1.toString());
//        System.out.println(g2.toString());
//    }
}

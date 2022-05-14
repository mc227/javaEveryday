package com.codegym.task.task17.task1712;

public class Order {
    private long time;
    private byte tableNumber;

    public Order(long time, byte tableNumber) {
        this.time = time;
        this.tableNumber = tableNumber;
    }

    public long getTime() {
        return time;
    }

    public byte getTableNumber() {
        return tableNumber;
    }
}

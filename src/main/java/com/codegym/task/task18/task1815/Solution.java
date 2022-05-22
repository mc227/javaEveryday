package com.codegym.task.task18.task1815;

import java.util.List;
import java.util.Locale;

/*
Table

*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        //        TableInterface tableInterface;
        public TableInterface tabInterface;
        public TableInterfaceWrapper(TableInterface tableInterface) {
            this.tabInterface = tableInterface;
        }

        // The TableInterfaceWrapper class must implement the TableInterface interface.
        @Override
        public void setModel(List rows) {
            // The setModel method should display the number of elements in the new list before updating the model.
            // The setModel() method should display the number of elements in the new list before updating the model.
            // Check whether you are passing the model update command to the TableInterface object.
            System.out.print(rows.size());
            tabInterface.setModel(rows);
        }

        @Override
        public String getHeaderText() {
            // The getHeaderText method should return the text in upper case. Use the toUpperCase() method.
            //The getHeaderText() method must return the text in uppercase.
            return tabInterface.getHeaderText().toUpperCase(Locale.ROOT);
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            tabInterface.setHeaderText(newHeaderText);
        }
        // Change the TableInterfaceWrapper class so that it wraps TableInterface.

    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}
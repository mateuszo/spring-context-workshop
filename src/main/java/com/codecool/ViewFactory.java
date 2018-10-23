package com.codecool;

public class ViewFactory {

    View getView(String viewName){
        if(viewName.equals("Console")){
            return new ConsoleView();
        }
        if(viewName.equals("CSV")){
            return new CsvPrinter();
        } else {
            return new View() {
                public void printResult(String result) {
                }
            };
        }
    }
}

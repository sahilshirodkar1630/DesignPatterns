package org.sahil.BehaviouralPatterns.TemplatePattern;

class CSVParserIn{
    public void parse(){
        openFile();
        //CSV Specific Parsing Logic
        System.out.println("Parsing a CSV File");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening File");
    }

    private void closeFile(){
        System.out.println("Closing File");
    }
}

class JSONParserIn{
    public void parse(){
        openFile();
        //JSON Specific Parsing Logic
        System.out.println("Parsing a JSON File");
        closeFile();
    }

    private void openFile(){
        System.out.println("Opening File");
    }

    private void closeFile(){
        System.out.println("Closing File");
    }
}

public class WithoutTemplatePattern {
    public static void main(String[] args) {
        CSVParserIn csvParser = new CSVParserIn();
        JSONParserIn jsonParser = new JSONParserIn();
        csvParser.parse();
        jsonParser.parse();
    }
}

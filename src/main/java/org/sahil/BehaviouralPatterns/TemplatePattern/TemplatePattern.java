package org.sahil.BehaviouralPatterns.TemplatePattern;

abstract class DataParser{

    public final void parse(){
        openFile();
        parseData();
        closeFile();
    }
    protected void openFile(){
        System.out.println("Opening File");
    }

    protected void closeFile(){
        System.out.println("Closing File");
    }

    protected abstract void parseData();

}

class CSVParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing CSV Data");
    }
}

class JSONParser extends DataParser {

    @Override
    protected void parseData() {
        System.out.println("Parsing JSON Data");
    }
}

public class TemplatePattern {
    public static void main(String[] args) {
        DataParser csvParser = new CSVParser();
        DataParser jsonParser = new JSONParser();
        csvParser.parse();
        jsonParser.parse();
    }
}

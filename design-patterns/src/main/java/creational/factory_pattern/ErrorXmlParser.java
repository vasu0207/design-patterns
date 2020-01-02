package creational.factory_pattern;

import creational.abstractFactoryPattern.actual_example.XMLParser;

public class ErrorXmlParser implements XMLParser {
    @Override
    public String parse() {
        return "Error XML Parser";
    }
}

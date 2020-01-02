package creational.factory_pattern;

import creational.abstractFactoryPattern.actual_example.XMLParser;

public class ResponseXmlParser implements XMLParser {
    @Override
    public String parse() {
        return "Response XML";
    }
}

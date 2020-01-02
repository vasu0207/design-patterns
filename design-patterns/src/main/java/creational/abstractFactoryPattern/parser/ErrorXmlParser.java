package creational.abstractFactoryPattern.parser;



public class ErrorXmlParser implements XmlParser {
    @Override
    public String parse() {
        return "Error XML Parser";
    }
}

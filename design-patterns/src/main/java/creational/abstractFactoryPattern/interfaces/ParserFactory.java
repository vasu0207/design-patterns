package creational.abstractFactoryPattern.interfaces;

import creational.abstractFactoryPattern.parser.XmlParser;

public interface ParserFactory {

    public XmlParser getParserInstance(String factoryInstance);
}

package creational.abstractFactoryPattern.parser_ny;

import creational.abstractFactoryPattern.interfaces.ParserFactory;
import creational.abstractFactoryPattern.parser.ErrorXmlParser;
import creational.abstractFactoryPattern.parser.ResponseXmlParser;
import creational.abstractFactoryPattern.parser.XmlParser;

public class ParserFactoryTW implements ParserFactory {
    @Override
    public XmlParser getParserInstance(String factoryInstance) {
        XmlParser type = null;
        if(factoryInstance.equals("TWERROR")){
            type = new ErrorXmlParser();
        } else if(factoryInstance.equals("TWResponse")){
            type = new ResponseXmlParser();
        }
        return type;
    }
}

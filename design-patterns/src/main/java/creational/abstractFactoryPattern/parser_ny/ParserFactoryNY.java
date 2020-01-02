package creational.abstractFactoryPattern.parser_ny;

import creational.abstractFactoryPattern.interfaces.ParserFactory;
import creational.abstractFactoryPattern.parser.ErrorXmlParser;
import creational.abstractFactoryPattern.parser.ResponseXmlParser;
import creational.abstractFactoryPattern.parser.XmlParser;


public class ParserFactoryNY implements ParserFactory {
    @Override
    public XmlParser getParserInstance(String factoryInstance) {
        XmlParser type = null;
        if(factoryInstance.equals("NYERROR")){
            type = new ErrorXmlParser();
        } else if(factoryInstance.equals("NYResponse")){
            type = new ResponseXmlParser();
        }
        return type;
    }
}

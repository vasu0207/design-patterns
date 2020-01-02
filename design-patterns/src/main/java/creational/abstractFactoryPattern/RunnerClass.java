package creational.abstractFactoryPattern;

import creational.abstractFactoryPattern.actual_example.XMLParser;
import creational.abstractFactoryPattern.interfaces.ParserFactory;
import creational.abstractFactoryPattern.parser_ny.ParserFactoryNY;
import creational.abstractFactoryPattern.parser_ny.ParserFactoryTW;
import creational.factory_pattern.ErrorXmlParser;
import creational.factory_pattern.ResponseXmlParser;

public class RunnerClass {

    public void getParserInstance(String parserFactory){
        ParserFactory pf = null;
        if(parserFactory.equals("NYERROR")){
           pf = new ParserFactoryNY();
            System.out.println( pf.getParserInstance("NYERROR").parse());
        } else if(parserFactory.equals("TWERROR")){
            pf = new ParserFactoryTW();
            System.out.println( pf.getParserInstance("TWERROR").parse());
        }
    }

    public static void main(String[] args) {
        System.out.println("Entered Main");
          RunnerClass rc = new RunnerClass();
          rc.getParserInstance("NYERROR");
        rc.getParserInstance("TWERROR");
        System.out.println("Exist Main");
    }
}

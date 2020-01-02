package creational.factory_pattern;

import creational.abstractFactoryPattern.actual_example.XMLParser;

public class RunnerClass {

    public void display(String type){
        XMLParser parser = null ;
        if(type.equals("error")){
            parser = new ErrorXmlParser();
        } else if(type.equals("response")){
            parser = new ResponseXmlParser();
        }
        System.out.println(parser.parse());

    }
    public static void main(String[] args) {
        System.out.println("Entered Main");
          RunnerClass rc = new RunnerClass();
          rc.display("error");
        rc.display("response");
        System.out.println("Exist Main");
    }
}

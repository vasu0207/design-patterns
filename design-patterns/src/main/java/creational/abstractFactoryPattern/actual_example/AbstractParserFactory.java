package creational.abstractFactoryPattern.actual_example;

public interface AbstractParserFactory {

	public XMLParser getParserInstance(String parserType);
}

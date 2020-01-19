package SAX;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

import SAX.food;
import SAX.handler;

public class Parser {
	public static void main(String[] args) {
	    SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
	    try {
	        SAXParser saxParser = saxParserFactory.newSAXParser();
	        handler h = new handler();
	        saxParser.parse(new File("data.xml"), h);
	        //Get Employees list
	        List<food> flist = h.getflist();
	        //print employee information
	        for(food f :flist)
	            System.out.println(f.getName()+" "+f.getPrice()+" "+f.getDes()+f.getCal());
	    } catch (ParserConfigurationException | SAXException | IOException e) {
	        e.printStackTrace();
	    }
	    }
}

package SAX;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class handler extends DefaultHandler {

	// List to hold Employees object
	private List<food> flist = null;
	private food f = null;
	private StringBuilder d = null;

	// getter method for employee list
	public List<food> getflist() {
		return flist;
	}

	boolean bn = false;
	boolean bp = false;
	boolean bd = false;
	boolean bc = false;

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("food")) {
			// create a new Employee and put it in Map
			//System.out.println("food tag");
			// initialize Employee object and set id attribute
			f = new food();
			
			// initialize list
			if (flist == null)
				flist = new ArrayList<>();
		} else if (qName.equalsIgnoreCase("name")) {
			// set boolean values for fields, will be used in setting Employee variables
			bn = true;
		} else if (qName.equalsIgnoreCase("price")) {
			bp = true;
		} else if (qName.equalsIgnoreCase("description")) {
			bd = true;
		} else if (qName.equalsIgnoreCase("calories")) {
			bc = true;
		}
		// create the data container
		d = new StringBuilder();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (bp) {
			// age element, set Employee age
			f.setPrice(d.toString());
			bp = false;
		} else if (bn) {
			f.setName(d.toString());
			bn = false;
		} else if (bd) {
			f.setDes(d.toString());
			bd = false;
		} else if (bc) {
			f.setCal(Integer.parseInt(d.toString()));
			bc = false;
		}
		
		if (qName.equalsIgnoreCase("food")) {
			// add Employee object to list
			flist.add(f);
			//System.out.println("ll" +f.getPrice());
		}
	}

	@Override
	public void characters(char ch[], int start, int length) throws SAXException {
		d.append(new String(ch, start, length));
	}
}



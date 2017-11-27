package utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class AppConsts {
	//Categories
	public static String SHIRTSCATEGNAME;
	public static String TROUSERSCATEGNAME;
	public static String CASUALSCATEGNAME;
	public static String JEANSCATEGNAME;
	public static String DRESSESCATEGNAME;
	public static String FOOTWEARCATEGNAME;
	//category discounts
	public static int MENSWEARDISCOUNT;
	public static int SHIRTSDISCOUNT;
	public static int TROUSERSDISCOUNT;
	public static int CASUALSDISCOUNT;
	public static int JEANSDISCOUNT;
	public static int WOMENSWEARDISCOUNT;
	public static int DRESSESDISCOUNT;
	public static int FOOTWEARDISCOUNT;
	//brands
	public static String WRANGLER;
	public static String ARROW;
	public static String VEROMODA;
	public static String UCB;
	public static String ADIDAS;
	public static String PROVOGUE;
	//brand discounts
	public static int WRANGLERDISCOUNT;
	public static int ARROWDISCOUNT;
	public static int VEROMODADISCOUNT;
	public static int UCBDISCOUNT;
	public static int ADIDASDISCOUNT;
	public static int PROVOGUEDISCOUNT;
	public static HashMap<String, Integer> BRANDPRICES;	

	Properties prop = new Properties();
	InputStream input = null;
	public AppConsts() {
		try {
			input = new FileInputStream("config.properties");
			// load a properties file
			prop.load(input);
			SHIRTSCATEGNAME = prop.getProperty("SHIRTSCATEGNAME");
			TROUSERSCATEGNAME = prop.getProperty("TROUSERSCATEGNAME");
			CASUALSCATEGNAME = prop.getProperty("CASUALSCATEGNAME");
			JEANSCATEGNAME = prop.getProperty("JEANSCATEGNAME");
			DRESSESCATEGNAME = prop.getProperty("DRESSESCATEGNAME");
			FOOTWEARCATEGNAME = prop.getProperty("FOOTWEARCATEGNAME");
			MENSWEARDISCOUNT = Integer.valueOf(prop.getProperty("MENSWEARDISCOUNT"));
			SHIRTSDISCOUNT = Integer.valueOf(prop.getProperty("SHIRTSDISCOUNT"));
			TROUSERSDISCOUNT = Integer.valueOf(prop.getProperty("TROUSERSDISCOUNT"));
			CASUALSDISCOUNT = Integer.valueOf(prop.getProperty("CASUALSDISCOUNT"));
			JEANSDISCOUNT = Integer.valueOf(prop.getProperty("JEANSDISCOUNT"));
			WOMENSWEARDISCOUNT = Integer.valueOf(prop.getProperty("WOMENSWEARDISCOUNT"));
			DRESSESDISCOUNT = Integer.valueOf(prop.getProperty("DRESSESDISCOUNT"));
			FOOTWEARDISCOUNT = Integer.valueOf(prop.getProperty("FOOTWEARDISCOUNT"));
			WRANGLER = prop.getProperty("WRANGLER");
			ARROW = prop.getProperty("ARROW");
			VEROMODA = prop.getProperty("VEROMODA");
			UCB = prop.getProperty("UCB");
			ADIDAS = prop.getProperty("ADIDAS");
			PROVOGUE = prop.getProperty("PROVOGUE");
			WRANGLERDISCOUNT = Integer.valueOf(prop.getProperty("WRANGLERDISCOUNT"));
			ARROWDISCOUNT = Integer.valueOf(prop.getProperty("ARROWDISCOUNT"));
			VEROMODADISCOUNT = Integer.valueOf(prop.getProperty("VEROMODADISCOUNT"));
			UCBDISCOUNT = Integer.valueOf(prop.getProperty("UCBDISCOUNT"));
			ADIDASDISCOUNT = Integer.valueOf(prop.getProperty("ADIDASDISCOUNT"));
			PROVOGUEDISCOUNT = Integer.valueOf(prop.getProperty("PROVOGUEDISCOUNT"));
			BRANDPRICES = new HashMap<String,Integer>();
			BRANDPRICES.put(WRANGLER, WRANGLERDISCOUNT);
			BRANDPRICES.put(ARROW, ARROWDISCOUNT);
			BRANDPRICES.put(VEROMODA,VEROMODADISCOUNT);
			BRANDPRICES.put(UCB, UCBDISCOUNT);
			BRANDPRICES.put(ADIDAS, ADIDASDISCOUNT);
			BRANDPRICES.put(PROVOGUE, PROVOGUEDISCOUNT);
		} catch (Exception ex) {
			
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}

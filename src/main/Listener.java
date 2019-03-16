
package main;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Crunchify.com
 */

@SuppressWarnings("serial")

public class Listener extends HttpServlet
{
    private static Map<String, String> myMap = null;

    public void init() throws ServletException
    {
        System.out.println("running");
        String filePath = "/etc/underground";
        Map<String,String> details = new HashMap<String,String>();
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null)
            {
                String[] parts = line.split("\\t", 2);
                if (parts.length >= 2)
                {
                    String key = parts[0];
                    String value = parts[1];
                    details.put(key, value);
                } else {
                    System.out.println("ignoring line: " + line);
                }
            }
            myMap = Collections.unmodifiableMap(details);
        } catch (Exception ex) { ex.printStackTrace(); };
    }
    public static Map getMap() {
        return myMap;
    }

}

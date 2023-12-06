import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.IOException;
import java.net.URL;

public class App {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        try {
            IPInfo info = mapper.readValue(new URL("https://ipinfo.io/json"), IPInfo.class);
            System.out.println(info.toString());
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
}

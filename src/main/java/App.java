import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class App {
    public static void main(String[] args) throws IOException {

        ObjectMapper mapper = new ObjectMapper();

        IPInfo info = mapper.readValue(new URL("https://ipinfo.io/json"), IPInfo.class);

        System.out.println(info.toString());
    }
}

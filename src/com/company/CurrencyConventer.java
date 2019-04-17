package JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.stream.Stream;

public class CurrencyConventer {
    public static double convert(Currency from,Currency to){
        try {
            URL url = new URL("https://free.currconv.com/api/v7/" +
                    "convert" +
                    "?q="+from.getName()+ "_" +to.getName()+
                    "&compact=ultra" +
                    "&apiKey=cd8b88536350a5db7a5e");
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String lines = reader.readLine();
            if(lines.length() > 0){
                int startIndex = lines.indexOf(":") + 1;
                int endIndex = lines.indexOf("}");
                String value = lines.substring(startIndex,endIndex);
                return Double.parseDouble(value);
            }
            reader.close();

        } catch (MalformedURLException e){
            System.out.println("Zly URL");;
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
        return 0;
    }
}

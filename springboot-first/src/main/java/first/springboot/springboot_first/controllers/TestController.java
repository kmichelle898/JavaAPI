package first.springboot.springboot_first.controllers;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final String IS_SITE_UP = "Site is up!";
    private final String IS_SITE_DOWN = "Site is down!";
    private final String INCORRECT_URL = "URL is incorrect!";
    @GetMapping("/check")
    public String getUrlStatusMessage(@RequestParam String url) {
        String returnMessage = "";
        try {
            var uri = new URI(url);
            var urlObj = uri.toURL();
            HttpURLConnection conn = (HttpURLConnection) urlObj.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            int responseCodeVal = conn.getResponseCode()/100;
            if (responseCodeVal != 2) {

                returnMessage = IS_SITE_DOWN;
            }
            else{
                returnMessage =IS_SITE_UP;
            }

        } catch (MalformedURLException e) {
            returnMessage = INCORRECT_URL;
        } catch (IOException e) {
            returnMessage = IS_SITE_DOWN;
        }catch(Exception e){
            returnMessage = IS_SITE_DOWN;
        }
        return returnMessage;
    } 
}

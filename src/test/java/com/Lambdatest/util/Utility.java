package com.Lambdatest.util;

import com.Lambdatest.webdriver.ManagedWebDriver;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Utility {

    public static JSONObject getCombinedCapability(Map<String, String> envCapabilities, JSONObject config) {
        JSONObject capabilities = new JSONObject();
        JSONObject commonCapabilities = (JSONObject) config.get("capabilities");
        Iterator it = envCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            capabilities.put(pair.getKey().toString(), pair.getValue().toString());
        }
        it = commonCapabilities.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            if (capabilities.get(pair.getKey().toString()) == null) {
                capabilities.put(pair.getKey().toString(), pair.getValue().toString());
            }
        }
        String username = System.getenv("LT_USERNAME");
        if(username == null) {
            username = (String) config.get("user");
        }

        String accessKey = System.getenv("LT_ACCESS_KEY");
        if(accessKey == null) {
            accessKey = (String) config.get("key");
        }
        capabilities.put("username", username);
        capabilities.put("accessKey", accessKey);
        return capabilities;
    }

    public static void setSessionStatus(WebDriver webDriver, String status, String reason) {
        JavascriptExecutor jse = (JavascriptExecutor) webDriver;
        jse.executeScript("lambda-status="+ status);
    }

}

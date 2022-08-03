package com.Lambdatest.context;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	private  Map<String, Object> scenarioContext;

    public ScenarioContext(){
        scenarioContext = new HashMap<>();
    }

    public void setContext(Object key, Object value) {
        scenarioContext.put(key.toString(), value);
    }

    public Object getContext(Object key){
        return scenarioContext.get(key.toString());
    }


}

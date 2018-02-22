package util;


import constants.Constant;
import constants.Method;
import constants.Param;

import java.util.HashMap;

public class Query {
    private Method method;
    private HashMap<Param,String> params = new HashMap();
    private String auth;

    public Query() {}

    public void setMethod(Method method) {
        this.method = method;
    }

    public void addParam(Param param, String value) {
        this.params.put(param, value);
    }

    public void setAuth(String login, String md5pass) {
        this.auth = "auth="+login+":"+md5pass;
    }

    public String build(){
        String method = this.method.getMethod();
        String param="";
        for(Param a : params.keySet()){
            param+=a.getParam()+"="+params.get(a)+"&";
        }
        return Constant.getTradewatchURL()+method + param + this.auth;
    }

}
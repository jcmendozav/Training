package com.app;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;
@XmlRootElement
public class SqlMap {
    Map<String, String> sqls = new HashMap<>();
    public Map<String, String> getSqls() {
        return sqls;
    }
    public void setSqls(Map<String, String> sqls) {
        this.sqls = sqls;
    }
    public String getSql(String name) {
        return sqls.get(name);
    }
//    public static SqlMap load(String name) throws Exception {
//        String xml = Utils.loadString(name);
//        SqlMap sqlMap = unmarshallXML(xml );
//        return sqlMap;
//    }
}
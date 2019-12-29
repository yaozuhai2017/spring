package com.ujiuye.pojo;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class CollectionBean {
    Object[] arr;
    List list;
    Map map;
    Properties properties;

    public CollectionBean(Object[] arr, List list, Map map, Properties properties) {
        this.arr = arr;
        this.list = list;
        this.map = map;
        this.properties = properties;
    }

    public CollectionBean() {
        super();
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH80 {

    @EJB
    private HelperBeanG80 helperBeanG80;

    public String identify() {
        return "HelperBeanH80";
    }
}

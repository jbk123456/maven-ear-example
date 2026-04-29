package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI80 {

    @EJB
    private HelperBeanH80 helperBeanH80;

    public String identify() {
        return "HelperBeanI80";
    }
}

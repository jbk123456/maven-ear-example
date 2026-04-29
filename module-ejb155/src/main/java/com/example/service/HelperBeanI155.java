package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI155 {

    @EJB
    private HelperBeanH155 helperBeanH155;

    public String identify() {
        return "HelperBeanI155";
    }
}

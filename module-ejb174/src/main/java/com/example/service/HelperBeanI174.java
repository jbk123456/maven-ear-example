package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI174 {

    @EJB
    private HelperBeanH174 helperBeanH174;

    public String identify() {
        return "HelperBeanI174";
    }
}

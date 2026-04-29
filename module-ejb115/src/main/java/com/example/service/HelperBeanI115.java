package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanI115 {

    @EJB
    private HelperBeanH115 helperBeanH115;

    public String identify() {
        return "HelperBeanI115";
    }
}

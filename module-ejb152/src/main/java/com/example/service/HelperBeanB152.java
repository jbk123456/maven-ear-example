package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB152 {

    @EJB
    private HelperBeanA152 helperBeanA152;

    public String identify() {
        return "HelperBeanB152";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC78 {

    @EJB
    private HelperBeanB78 helperBeanB78;

    public String identify() {
        return "HelperBeanC78";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC159 {

    @EJB
    private HelperBeanB159 helperBeanB159;

    public String identify() {
        return "HelperBeanC159";
    }
}

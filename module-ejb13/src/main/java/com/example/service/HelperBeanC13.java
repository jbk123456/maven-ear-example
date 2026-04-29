package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC13 {

    @EJB
    private HelperBeanB13 helperBeanB13;

    public String identify() {
        return "HelperBeanC13";
    }
}

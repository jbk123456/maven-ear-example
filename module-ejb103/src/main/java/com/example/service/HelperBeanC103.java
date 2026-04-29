package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC103 {

    @EJB
    private HelperBeanB103 helperBeanB103;

    public String identify() {
        return "HelperBeanC103";
    }
}

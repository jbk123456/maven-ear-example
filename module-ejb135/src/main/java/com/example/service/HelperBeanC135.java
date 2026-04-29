package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC135 {

    @EJB
    private HelperBeanB135 helperBeanB135;

    public String identify() {
        return "HelperBeanC135";
    }
}

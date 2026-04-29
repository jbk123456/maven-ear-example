package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC139 {

    @EJB
    private HelperBeanB139 helperBeanB139;

    public String identify() {
        return "HelperBeanC139";
    }
}

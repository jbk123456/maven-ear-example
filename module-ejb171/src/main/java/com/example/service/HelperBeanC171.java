package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC171 {

    @EJB
    private HelperBeanB171 helperBeanB171;

    public String identify() {
        return "HelperBeanC171";
    }
}

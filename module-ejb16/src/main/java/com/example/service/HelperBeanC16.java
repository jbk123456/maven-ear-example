package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC16 {

    @EJB
    private HelperBeanB16 helperBeanB16;

    public String identify() {
        return "HelperBeanC16";
    }
}

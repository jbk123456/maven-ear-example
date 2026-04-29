package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC157 {

    @EJB
    private HelperBeanB157 helperBeanB157;

    public String identify() {
        return "HelperBeanC157";
    }
}

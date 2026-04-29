package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC61 {

    @EJB
    private HelperBeanB61 helperBeanB61;

    public String identify() {
        return "HelperBeanC61";
    }
}

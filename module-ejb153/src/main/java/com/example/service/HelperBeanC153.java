package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC153 {

    @EJB
    private HelperBeanB153 helperBeanB153;

    public String identify() {
        return "HelperBeanC153";
    }
}

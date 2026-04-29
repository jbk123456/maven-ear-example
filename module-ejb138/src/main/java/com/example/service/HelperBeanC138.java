package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC138 {

    @EJB
    private HelperBeanB138 helperBeanB138;

    public String identify() {
        return "HelperBeanC138";
    }
}

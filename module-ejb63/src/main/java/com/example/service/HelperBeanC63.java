package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC63 {

    @EJB
    private HelperBeanB63 helperBeanB63;

    public String identify() {
        return "HelperBeanC63";
    }
}

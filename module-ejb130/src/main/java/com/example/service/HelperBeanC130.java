package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanC130 {

    @EJB
    private HelperBeanB130 helperBeanB130;

    public String identify() {
        return "HelperBeanC130";
    }
}

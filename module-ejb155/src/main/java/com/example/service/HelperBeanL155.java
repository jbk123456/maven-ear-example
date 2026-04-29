package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanL155 {

    @EJB
    private HelperBeanK155 helperBeanK155;

    public String identify() {
        return "HelperBeanL155";
    }
}

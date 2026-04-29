package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM155 {

    @EJB
    private HelperBeanL155 helperBeanL155;

    public String identify() {
        return "HelperBeanM155";
    }
}

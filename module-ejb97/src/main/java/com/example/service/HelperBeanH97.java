package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanH97 {

    @EJB
    private HelperBeanG97 helperBeanG97;

    public String identify() {
        return "HelperBeanH97";
    }
}

package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanG78 {

    @EJB
    private HelperBeanF78 helperBeanF78;

    public String identify() {
        return "HelperBeanG78";
    }
}

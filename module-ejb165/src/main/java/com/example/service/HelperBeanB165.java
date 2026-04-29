package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanB165 {

    @EJB
    private HelperBeanA165 helperBeanA165;

    public String identify() {
        return "HelperBeanB165";
    }
}

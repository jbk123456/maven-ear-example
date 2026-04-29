package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanN25 {

    @EJB
    private HelperBeanM25 helperBeanM25;

    public String identify() {
        return "HelperBeanN25";
    }
}

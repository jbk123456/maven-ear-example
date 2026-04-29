package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanM25 {

    @EJB
    private HelperBeanL25 helperBeanL25;

    public String identify() {
        return "HelperBeanM25";
    }
}

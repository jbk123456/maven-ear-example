package com.example.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class HelperBeanO154 {

    @EJB
    private HelperBeanN154 helperBeanN154;

    public String identify() {
        return "HelperBeanO154";
    }
}

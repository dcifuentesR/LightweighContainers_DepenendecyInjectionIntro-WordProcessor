/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.samples.persistence.impl;

import java.util.Random;
import java.util.logging.Logger;

import edu.eci.pdsw.samples.persistence.EncodingValidator;

/**
 *
 * @author hcadavid
 */
public class UTF8EncodingValidator implements EncodingValidator{

    public boolean validateEncoding(String text) {
        LOG.info("Validating UTF8-Enconding for text....");
        return new Random(System.currentTimeMillis()).nextBoolean();        
    }
    
    private static final Logger LOG = Logger.getLogger(UTF8EncodingValidator.class.getName());
    
}

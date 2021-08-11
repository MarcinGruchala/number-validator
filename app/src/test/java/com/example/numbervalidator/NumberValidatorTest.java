package com.example.numbervalidator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class NumberValidatorTest {

    @Test
    public void isPositive_positiveNumber_true() {
        assertTrue(NumberValidator.isPositive(5));
    }

    @Test
    public void isPositive_negativeNumber_false() {
        assertFalse(NumberValidator.isPositive(-5));
    }

    @Test
    public void isPositive_zero_false () {
        assertFalse(NumberValidator.isPositive(0));
    }

    @Test
    public void isNegative_positiveNumber_false() {
        assertFalse(NumberValidator.isNegative( 3));
    }

    @Test
    public void isNegative_negativeNumber_true() {
        assertTrue(NumberValidator.isNegative(-3));
    }

    @Test
    public void isNegative_zero_false() {
        assertFalse(NumberValidator.isNegative(0));
    }

}
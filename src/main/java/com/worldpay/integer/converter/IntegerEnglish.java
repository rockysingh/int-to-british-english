package com.worldpay.integer.converter;

import com.worldpay.integer.converter.exception.IntegerOutOfRangeException;

public interface IntegerEnglish {

    public static int MAX_VALUE = 999999999;

    public  String getWordsByInt(int number) throws IntegerOutOfRangeException;

}

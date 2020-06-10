package com.goldencloud;

import com.goldencloud.common.Sdk;
import org.junit.Before;
import org.junit.Test;

public class SdkTest {

    Sdk sdk;

    @Before
    public void before() {
        sdk = new Sdk("fc36541461483b2db498", "d2641bfc30b293505ca2c09560b870aa",  "1.0.0","test");
    }

    @Test
    public void genereateSignTest() throws Exception{

    }

    @Test
    public void httpPostTest()throws Exception{

    }
}

package com.goldencloud.examples.invoice;

import com.goldencloud.common.Sdk;
import com.goldencloud.invoice.models.InvoiceBlue;
import com.goldencloud.invoice.models.InvoiceBlueGoodsInfo;
import com.goldencloud.invoice.models.InvoiceRed;
import net.sf.json.JSONObject;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

import static com.goldencloud.invoice.InvoiceApi.invoiceBlue;
import static com.goldencloud.invoice.InvoiceApi.invoiceRed;

public class example {

    public static void main(String[] args) {
        try {
            Sdk sdk = new Sdk("7dc55c6fce2b5f2e6a24", "fa181c90d8b28d570fed71093f929e36", "test");
            //Sdk sdk = new Sdk("fc1234561483b2db498", "a1c1234c5af678bc42d322a7gtrty4565", "test");
            JSONObject result = invoiceBlue(sdk);
            //JSONObject result = invoiceRed(sdk);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (Exception e) {
                e.printStackTrace();
        }
    }


}


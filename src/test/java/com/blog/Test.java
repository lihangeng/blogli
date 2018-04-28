package com.blog;

import java.text.DecimalFormat;

public class Test {

	public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat(".00");
        System.out.println(decimalFormat.format((Float.parseFloat("10"))/1000));

	}

}

package com.mbuszek;

/**
 * https://www.codewars.com/kata/descending-order/train/java
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public static int sortDesc(final int num) {
        List<String> numberList = new ArrayList<>();

        for (int i = 0; i < String.valueOf(num).length(); i++) {
            numberList.add(i, String.valueOf(num).substring(i, i + 1));
        }

        Collections.sort(numberList, Collections.reverseOrder());
        String numberString = "";
        for (String digit : numberList) {
            numberString = numberString.concat(digit);
        }
        return Integer.parseInt(numberString);

    }

}


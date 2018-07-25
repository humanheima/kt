package crazy.cpten.point_two;

/**
 * Description:<br>
 * ��վ: <a href="http://www.crazyit.org">���Java����</a><br>
 * Copyright (C), 2001-2018, Yeeku.H.Lee<br>
 * This program is protected by copyright laws.<br>
 * Program Name:<br>
 * Date:<br>
 *
 * @author Yeeku.H.Lee kongyeeku@163.com<br>
 * @version 1.0
 */

import java.util.*;
import java.util.function.*;

public class WildCardVarianceSuper {
    public static void main(String[] args) {
        Predicate<Number> pred = it -> it.doubleValue() > 10;
        Set<Integer> intSet = new HashSet<>();
        intSet.add(2);
        intSet.add(9);
        intSet.add(32);
        intSet.add(15);
        // removeIf(Predicate<? super E> filter)ʹ��?֧���ͱ�
        intSet.removeIf(pred); // ʹ��Predicate<Number>��Set<Int>���й���
        System.out.println(intSet);
        Set<Double> doubleSet = new HashSet<>();
        doubleSet.add(2.5);
        doubleSet.add(14.4);
        doubleSet.add(3.8);
        doubleSet.add(15.8);
        // removeIf(Predicate<? super E> filter)ʹ��?֧���ͱ�
        doubleSet.removeIf(pred); // ʹ��Predicate<Number>��Set<Double>���й���
        System.out.println(doubleSet);
    }
}

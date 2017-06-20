package org.sos.sixbox.utils;

import java.sql.Timestamp;

/**
 * Created by Lodour on 17/6/21 07:31.
 * 常用工具函数
 */
public class Utils {
    public static Timestamp getCurrentTimestamp() {
        return new Timestamp(System.currentTimeMillis());
    }
}

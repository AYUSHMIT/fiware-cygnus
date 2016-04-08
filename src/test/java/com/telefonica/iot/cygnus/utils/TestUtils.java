/**
 * Copyright 2016 Telefonica Investigación y Desarrollo, S.A.U
 *
 * This file is part of fiware-cygnus (FI-WARE project).
 *
 * fiware-cygnus is free software: you can redistribute it and/or modify it under the terms of the GNU Affero General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * fiware-cygnus is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License along with fiware-cygnus. If not, see
 * http://www.gnu.org/licenses/.
 *
 * For those usages not covered by the GNU Affero General Public License please contact with iot_support at tid dot es
 */

package com.telefonica.iot.cygnus.utils;

import com.google.gson.Gson;
import com.telefonica.iot.cygnus.containers.NotifyContextRequest;
import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;

/**
 *
 * @author frb
 */
public final class TestUtils {
    
    private static final int MAX_LEN_TEST_TRACE_HEAD = 40;
    
    /**
     * Constructor. It is private since utility clasess should not have a public or default constructor.
     */
    private TestUtils() {
    } // TestUtils
    
    /**
     * Create a Json-based notificationContextRequest given the string representation of such Json.
     * @param jsonStr
     * @return The Json-based notificationContextRequest
     */
    public static NotifyContextRequest createJsonNotifyContextRequest(String jsonStr) {
        Logger logger = Logger.getLogger(Utils.class);
        NotifyContextRequest notification = null;
        Gson gson = new Gson();

        try {
            notification = gson.fromJson(jsonStr, NotifyContextRequest.class);
        } catch (Exception e) {
            logger.error(e.getMessage());
        } // try catch
        
        return notification;
    } // createJsonNotifyContextRequest
    
    /**
     * Gets a trace head.
     * @param originalHead
     * @return A trace head
     */
    public static String getTestTraceHead(String originalHead) {
        String traceHead = originalHead;
        traceHead += " " + StringUtils.repeat("-", MAX_LEN_TEST_TRACE_HEAD - originalHead.length());
        return traceHead;
    } // getTestTraceHead
} // TestUtils

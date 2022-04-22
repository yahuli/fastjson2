package com.alibaba.fastjson.issue_1000;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import junit.framework.TestCase;

/**
 * Created by wenshao on 20/03/2017.
 */
public class Issue1089_private extends TestCase {
    public void test_for_issue() throws Exception {
        String json = "{\"ab\":123,\"a_b\":456}";
        TestBean tb = JSON.parseObject(json, TestBean.class, Feature.DisableFieldSmartMatch);
        assertEquals(123, tb.getAb());
    }

    private static class TestBean {
        private int ab;

        public int getAb() {
            return ab;
        }

        public void setAb(int ab) {
            this.ab = ab;
        }
    }

}
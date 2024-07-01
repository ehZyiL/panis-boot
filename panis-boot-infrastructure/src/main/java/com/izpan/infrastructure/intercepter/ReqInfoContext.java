package com.izpan.infrastructure.intercepter;


import lombok.Data;

public class ReqInfoContext {
    private static ThreadLocal<ReqInfo> contexts = new ThreadLocal<>();

    public static void setReqInfo(ReqInfo reqInfo) {
        contexts.set(reqInfo);
    }

    public static void clear() {
        contexts.remove();
    }

    public static ReqInfo getReqInfo() {
        return contexts.get();
    }

    @Data
    public static class ReqInfo  {

        private String bearer;

        private Boolean stream;

        private Object user;

    }
}

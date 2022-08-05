package com.controller;

public enum Code {

        SAVE(20011,20010),
        UPDATE(20021,20020),
        DELETE(20031,20030),
        GET(20041,20040);


        private final Integer success;
        private final Integer fail;

        private Code(Integer success, Integer fail) {
            this.success = success;
            this.fail = fail;
        }



    public Integer getSuccess() {
        return success;
    }

    public Integer getFail() {
        return fail;
    }
}

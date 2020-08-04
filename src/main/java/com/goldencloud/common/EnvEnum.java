package com.goldencloud.common;

    public class EnvEnum {

        enum URL {

            TEST("https://apigw-test.goldentec.com"),

            PROD("https://apigw.goldentec.com");

            private String url;

            URL(String url) {
                this.url = url;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }

    }

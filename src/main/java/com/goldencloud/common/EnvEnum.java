package com.goldencloud.common;

    public class EnvEnum {

        enum URL {

            TEST("https://apigw-dev.goldentec.com"),

            PROD("https://openapi.wetax.com.cn");

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

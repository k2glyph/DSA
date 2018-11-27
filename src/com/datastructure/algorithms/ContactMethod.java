package com.datastructure.algorithms;

public enum ContactMethod {
    PHONE("telephone.png") {
        @Override public void initiate() {
            System.out.println("Phone icon");
        }
    },
    EMAIL("envelope.png") {
        @Override public void initiate() {
            System.out.println("Email Icon");
        }
    };

    ContactMethod(String icon) {
        this.icon = icon;
    }

    private final String icon;

    public abstract void initiate();

    public String getIcon() {
        return icon;
    }
}
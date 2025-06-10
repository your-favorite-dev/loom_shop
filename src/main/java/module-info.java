module LoomShop {
    exports io.loomshop;

    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires spring.data.jpa;
    requires spring.data.redis;
    requires spring.kafka;
    requires java.sql;
    requires spring.security.web;
    requires spring.security.config;
}
package cn.netease.domain;

import java.util.List;
import java.util.Map;

public class User {
    private String name;
    private Integer age;
    private List<Account> list;
    private Map<String,Account> map;
    private Account account;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Account> getList() {
        return list;
    }

    public void setList(List<Account> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", map=" + map +
                ", account=" + account +
                '}';
    }

    public Map<String, Account> getMap() {
        return map;
    }

    public void setMap(Map<String, Account> map) {
        this.map = map;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}

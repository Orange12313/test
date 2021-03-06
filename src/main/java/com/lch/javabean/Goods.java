package com.lch.javabean;

public class Goods {
    private int gds_id;
    private String gds_no;
    private String gds_name;
    private Double gds_price;
    private String gds_path;
    private String gds_memo;
    public int getGds_id() {
        return gds_id;
    }
    public void setGds_id(int gds_id) {
        this.gds_id = gds_id;
    }
    public String getGds_no() {
        return gds_no;
    }
    public void setGds_no(String gds_no) {
        this.gds_no = gds_no;
    }
    public String getGds_name() {
        return gds_name;
    }
    public void setGds_name(String gds_name) {
        this.gds_name = gds_name;
    }
    public Double getGds_price() {
        return gds_price;
    }
    public void setGds_price(Double gds_price) {
        this.gds_price = gds_price;
    }
    public String getGds_path() {
        return gds_path;
    }
    public void setGds_path(String gds_path) {
        this.gds_path = gds_path;
    }
    public String getGds_memo() {
        return gds_memo;
    }
    public void setGds_memo(String gds_memo) {
        this.gds_memo = gds_memo;
    }

    @Override
    public String toString() {
        return "Goods [gds_id=" + gds_id + ", gds_no=" + gds_no + ", gds_name="
                + gds_name + ", gds_price=" + gds_price + ", gds_path="
                + gds_path + ", gds_memo=" + gds_memo + "]";
    }
    public Goods(String gds_no, String gds_name, Double gds_price) {
        super();
        this.gds_no = gds_no;
        this.gds_name = gds_name;
        this.gds_price = gds_price;
    }
    public Goods() {
    }
}

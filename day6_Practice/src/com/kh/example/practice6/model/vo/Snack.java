package com.kh.example.practice6.model.vo;

public class Snack {
	
	private String kind="��";
	private String name="����ũ";
	private String flavor="��纣��";
	private int numOf=1;
	private int price=15000;
	
	public Snack() {
	}

	public String getKind() {
		return kind;
	}
	public String getName() {
		return name;
	}
	public int getNimOf() {
		return numOf;
	}
	public int getPrice() {
		return price;
	}
	public String getFlavor() {
		return flavor;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNimOf(int nimOf) {
		this.numOf = nimOf;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void information( ) {
		System.out.println("���� :"+kind);
		System.out.println("�̸� :"+name);
		System.out.println("�� :"+flavor);
		System.out.println("���� :"+numOf);
		System.out.println("���� :"+price);
	}
}

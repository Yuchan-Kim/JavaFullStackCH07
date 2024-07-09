package com.javaex.ex02;

public class Sparrow extends Bird {

	@Override
    public void sing() {
		System.out.println("참새(" + this.getName() + ")가 소리내어 웁니다.");
    }
    @Override
    public void fly() {
		System.out.println("참새(" + this.getName() + ")가 날아 다닙니다.");

    }
    @Override
    public void showName() {
    	System.out.println("참새의 이름은 " + this.getName() + " 입니다.");
    }

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	protected String getName() {
		return this.name;
	}


}

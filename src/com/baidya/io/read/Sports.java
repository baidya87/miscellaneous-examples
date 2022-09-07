package com.baidya.io.read;

public enum Sports {
	CRICKET(10), FOOTBALL(11), BASKETBALL(12), BADMINTON(13), HORSERIDING(22), FORMULA1(23);
	private int code;

	Sports(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return this.code;
	}
}

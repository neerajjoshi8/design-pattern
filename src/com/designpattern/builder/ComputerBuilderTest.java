package com.designpattern.builder;

public class ComputerBuilderTest {

	public static void main(String[] args) {
		Computer computer1 = new ComputerBuilder().setCpu("i7").setKeyboard("logitech keyboard").setMonitor("samsung")
				.setMouse("logitech mouse").buildComputer();
		System.out.println(computer1);

		Computer computer2 = new ComputerBuilder().setCpu("i5").setKeyboard("test keyboard").setMonitor("test keyboard")
				.setMouse("test keyboard").setSpeaker("test speaker").buildComputer();
		System.out.println(computer2);
	}
}

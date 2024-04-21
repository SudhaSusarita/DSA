package org.example.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
	public static void main(String[] args) {
	 Array array = new Array(3);
	 array.push(100);
	 array.push(20);
	 array.push(212);
	 array.push(24);
	 array.push(70);array.push(700);array.push(170);
	 array.removeAt(1);
	//	array.reverse();
	 array.print();
	 array.insertAt(2000,0);
		array.print();
	// System.out.println("index of 22 "+array.indexOf(22));
	// System.out.println("max of the array "+array.max());
	// array.intersect(new int[]{100, 24, 50, 70, 90});
	}
}

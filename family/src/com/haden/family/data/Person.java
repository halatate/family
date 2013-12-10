package com.haden.family.data;

import java.io.Serializable;

public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int SEX_MALE = 1;
	public static final int SEX_FEMALE = 2;
	public static final int SEX_UNKNOWN = -1;

	private String name;
	private int age;
	private int sex;
	private Role role;

	private Family family;

	public Person() {
		super();
	}

	public Person(String name, int age, int sex, Role role) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

}

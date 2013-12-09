package com.haden.family.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import android.util.SparseArray;

public class Family implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final int ROLE_BASE = 1 << 10; // 1024
	public static final int ROLE_SON = ROLE_BASE;
	public static final int ROLE_DAUGHT = ROLE_BASE + 1;
	public static final int ROLE_GRANDSON = ROLE_BASE >> 1;
	public static final int ROLE_GRANDDAUGHT = ROLE_BASE >> 1 + 1;
	public static final int ROLE_FATHER = ROLE_BASE << 1;
	public static final int ROLE_MOTHER = ROLE_BASE << 1 + 1;
	public static final int ROLE_GRANDFATHER = ROLE_BASE << 2;
	public static final int ROLE_GRANDMOTHER = ROLE_BASE << 2 + 1;

	private Person owner;
	private SparseArray<Map<String, Person>> familyList = new SparseArray<Map<String, Person>>();

	public Family() {
		super();
	}

	public Family(Person owner) {
		super();
		this.owner = owner;
		addPerson(owner);
	}

	public void addPerson(Person person) {
		if (owner == null || person == null)
			return;

		int role = person.getRole();
		Map<String, Person> map = familyList.get(role);
		if (map == null) {
			map = new HashMap<String, Person>();
			familyList.put(role, map);
		}

		map.put(person.getName(), person);
	}

	public boolean hasPerson(int role, String name) {
		return getPerson(role, name) != null;
	}

	public Person getPerson(int role, String name) {
		Map<String, Person> map = familyList.get(role);
		if (map != null) {
			return map.get(name);
		}
		return null;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public SparseArray<Map<String, Person>> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(SparseArray<Map<String, Person>> familyList) {
		this.familyList = familyList;
	}

}

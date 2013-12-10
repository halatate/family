package com.haden.family.data;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Family implements Serializable {
	private static final long serialVersionUID = 1L;

	private Person owner;
	private Map<Role, Map<String, Person>> familyList = new HashMap<Role, Map<String, Person>>();

	public Family() {
		super();
	}

	public Family(Person owner) {
		super();
		this.owner = owner;
	}

	public void addPerson(Person person) {
		if (person == null)
			return;

		Role role = person.getRole();
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

	public Map<Role, Map<String, Person>> getFamilyList() {
		return familyList;
	}

	public void setFamilyList(Map<Role, Map<String, Person>> familyList) {
		this.familyList = familyList;
	}

}

package com.haden.family.data;

public class DataManager {

	public static final Person owner = new Person("Haden", 26, Family.SEX_MALE,
			Family.ROLE_SON, true);

	public static final Family family = new Family(owner);

}

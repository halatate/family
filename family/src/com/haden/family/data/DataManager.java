package com.haden.family.data;

public class DataManager {

	public static final Person laogong = new Person("Laogong", 28,
			Person.SEX_MALE, Role.Husband );
	public static final Person laopo = new Person("Laopo", 26,
			Person.SEX_FEMALE, Role.Wife );

	public static final Person father = new Person("father", 52,
			Person.SEX_MALE, Role.Father );
	public static final Person mother = new Person("mother", 50,
			Person.SEX_FEMALE, Role.Mother );

	public static final Person grandf = new Person("grandfather", 80,
			Person.SEX_MALE, Role.Grandfather );
	public static final Person grandm = new Person("grandmother", 75,
			Person.SEX_FEMALE, Role.Grandmother );

	public static final Person son = new Person("son", 3, Person.SEX_MALE,
			Role.Son );
	public static final Person daught = new Person("daught", 4,
			Person.SEX_FEMALE, Role.Daught );

	public static final Person grands = new Person("grandson", 1,
			Person.SEX_MALE, Role.Grandson );
	public static final Person grandd = new Person("granddaught", 1,
			Person.SEX_FEMALE, Role.Granddaught );

	public static final Family family = new Family(laogong);

	static {
		family.addPerson(laogong);
		family.addPerson(laopo);

		family.addPerson(father);
		family.addPerson(mother);

		family.addPerson(grandf);
		family.addPerson(grandm);
//
//		family.addPerson(son);
//		family.addPerson(daught);
//
//		family.addPerson(grands);
//		family.addPerson(grandd);
	}
}

package com.haden.family.data;

public class Role {
	private int level;
	private String name;

	public Role(int level, String name) {
		this.level = level;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getLevel() {
		return level;
	}

	public static final int LEVEL_BASE = 0;
	public static final int LEVEL1 = LEVEL_BASE + 1; // grandson
	public static final int LEVEL2 = LEVEL_BASE + 2; // son
	public static final int LEVEL3 = LEVEL_BASE + 3; // self
	public static final int LEVEL4 = LEVEL_BASE + 4; // father
	public static final int LEVEL5 = LEVEL_BASE + 5; // grandfather

	public static final Role Grandson = new Role(LEVEL1, "����");
	public static final Role Granddaught = new Role(LEVEL1, "��Ů");
	// ̫���ˣ���������Ȱ�ֱϵ���������
	// public static final Role Grandson2 = new Role(LEVEL1, "����");
	// public static final Role Granddaught2 = new Role(LEVEL1, "����Ů");

	public static final Role Son = new Role(LEVEL2, "����");
	public static final Role Daught = new Role(LEVEL2, "Ů��");

	public static final Role Husband = new Role(LEVEL3, "�ɷ�");
	public static final Role Wife = new Role(LEVEL3, "����");

	public static final Role Father = new Role(LEVEL4, "����");
	public static final Role Mother = new Role(LEVEL4, "ĸ��");

	public static final Role Grandfather = new Role(LEVEL5, "үү");
	public static final Role Grandmother = new Role(LEVEL5, "����");
	
	public static final Role[] role_all = new Role[]{
		
	};

}

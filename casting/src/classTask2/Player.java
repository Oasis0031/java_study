package classTask2;

public class Player {

	private String name;
	private int level;
	private int hp;
	private String job;

	public Player() {;}

	public Player(String name, int level, int hp, String job) {
		super();
		this.name = name;
		this.level = level;
		this.hp = hp;
		this.job = job;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public void huntSuccess(Hunt hunt) {
		System.out.println("전투를 시작합니다.");
		if (hunt instanceof Oak) {
			Oak oak = (Oak) hunt;
			oak.oakAttack();
			oak.oakDefeat();
		} else if (hunt instanceof Fairy) {
			Fairy fairy = (Fairy) hunt;
			fairy.fairyAttack();
			fairy.fairyDefeat();
		} else if (hunt instanceof Human) {
			Human human = (Human) hunt;
			human.humanAttack();
			human.humanDefeat();
		}
	}

	public void huntFailed(Hunt hunt) {
		System.out.println("전투를 시작합니다.");
		if (hunt instanceof Oak && hp == 0) {
			Oak oak = (Oak) hunt;
			System.out.println("체력이 0이 되어 패배하였습니다.");
			oak.oakFail();
		} else if (hunt instanceof Fairy && hp == 0) {
			Fairy fairy = (Fairy) hunt;
			System.out.println("체력이 0이 되어 패배하였습니다.");
			fairy.fairyFail();
		} else if (hunt instanceof Human && hp == 0) {
			Human human = (Human) hunt;
			System.out.println("체력이 0이 되어 패배하였습니다.");
			human.humanFail();
		}
	}
}

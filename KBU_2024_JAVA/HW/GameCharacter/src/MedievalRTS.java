abstract class Character {
    String name;
    int x, y;

    Character(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    abstract void move(int x, int y);

    abstract void attack(Character target);
}

class Knight extends Character {

    Knight(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    void move(int x, int y) {
        System.out.println(name + "이(가) 말을 타고 (" + x + ", " + y + ")로 이동합니다.");
        this.x = x;
        this.y = y;
    }

    @Override
    void attack(Character target) {
        if (target instanceof Griffin || target instanceof Shuttle) {
            System.out.println(name + "가 " + target.name + "를 공격할 수 없습니다. (공중 유닛)");
        } else {
            System.out.println(name + "가 " + target.name + "를 창으로 찌릅니다.");
        }
    }
}

class Archer extends Character {

    Archer(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    void move(int x, int y) {
        System.out.println(name + "가 걸어서 (" + x + ", " + y + ")로 이동합니다.");
        this.x = x;
        this.y = y;
    }

    @Override
    void attack(Character target) {
        System.out.println(name + "가 " + target.name + "에게 화살을 쏩니다.");
    }
}

class Griffin extends Character {

    Griffin(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    void move(int x, int y) {
        System.out.println(name + "가 날아서 (" + x + ", " + y + ")로 이동합니다.");
        this.x = x;
        this.y = y;
    }

    @Override
    void attack(Character target) {
        if (target instanceof Griffin || target instanceof Shuttle) {
            System.out.println(name + "가" + target.name + "를 공격할 수 없습니다. (공중 유닛)");
        } else {
            System.out.println(name + "가 " + target.name + "에게 번개를 내리칩니다.");
        }
    }
}

class Shuttle extends Character {
    Character[] passengers;
    int passengerCount;

    Shuttle(String name, int x, int y) {
        super(name, x, y);
        this.passengers = new Character[8];
        this.passengerCount = 0;
    }

    @Override
    void move(int x, int y) {
        System.out.println(name + "가 날아서 (" + x + ", " + y + ")로 이동합니다.");
        this.x = x;
        this.y = y;
    }

    void board(Character character) {
        if (passengerCount < 8) {
            passengers[passengerCount++] = character;
            System.out.println(character.name + "가 " + name + "에 탑승합니다.");
        }
    }

    void unloadAll() {
        System.out.println(name + "가 모든 승객을 내립니다.");
        for (int i = 0; i < passengerCount; i++) {
            System.out.println(passengers[i].name + "가 내립니다.");
        }
        passengerCount = 0;
    }

    @Override
    void attack(Character target) {
        System.out.println(name + "은 공격할 수 없습니다.");
    }
}

public class MedievalRTS {
    public static void main(String[] args) {
        // 캐릭터 생성
        Knight[] knights = new Knight[16];
        Archer[] archers = new Archer[16];
        Shuttle[] shuttles = new Shuttle[4];
        Griffin[] griffins = new Griffin[5];

        for (int i = 0; i < 16; i++) {
            knights[i] = new Knight("Knight" + (i + 1), 0, 0);
            archers[i] = new Archer("Archer" + (i + 1), 0, 0);
        }

        for (int i = 0; i < 4; i++) {
            shuttles[i] = new Shuttle("Shuttle" + (i + 1), 0, 0);
        }

        for (int i = 0; i < 5; i++) {
            griffins[i] = new Griffin("Griffin" + (i + 1), 0, 0);
        }

        // 셔틀에 Knight와 Archer 탑승
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                shuttles[i].board(knights[i * 4 + j]);
                shuttles[i].board(archers[i * 4 + j]);
            }
        }

        // 이동
        for (Shuttle shuttle : shuttles) {
            shuttle.move(10, 10);
        }
        for (Griffin griffin : griffins) {
            griffin.move(10, 10);
        }

        // 셔틀에서 내리기
        for (Shuttle shuttle : shuttles) {
            shuttle.unloadAll();
        }

        // 공격 행동 수행
        knights[0].attack(knights[1]);
        knights[0].attack(archers[0]);
        knights[0].attack(griffins[0]);
        knights[0].attack(shuttles[0]);

        archers[0].attack(knights[0]);
        archers[0].attack(archers[1]);
        archers[0].attack(griffins[0]);
        archers[0].attack(shuttles[0]);

        griffins[0].attack(knights[0]);
        griffins[0].attack(archers[0]);
        griffins[0].attack(griffins[1]);
        griffins[0].attack(shuttles[0]);
    }
}

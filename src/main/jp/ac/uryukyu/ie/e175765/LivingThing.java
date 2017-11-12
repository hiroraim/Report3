package jp.ac.uryukyu.ie.e175765;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    //コンストラクタ
    public LivingThing(String name, int hitPoint, int attack) {
        this.name = name;
        hitPoint = hitPoint;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, hitPoint, attack);
    }

    public boolean isDead() {
        return dead;
    }

    public String getName() {
        return name;
    }

    public void attack(LivingThing bio){
        if(!this.dead){
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, bio.getName(), damage);


            bio.wounded(damage);
        }

    }

    public void wounded(int damage) {
        hitPoint -= damage;
        if(hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }



}
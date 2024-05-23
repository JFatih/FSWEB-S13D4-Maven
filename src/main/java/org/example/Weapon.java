package org.example;

public enum Weapon {
    SWORD(50,1.2),
    AX(80,0.6),
    ROBUST(90,0.2),
    ARROW(30,2);

    private final int damage;
    private final double attackSpeed;

    Weapon(int damage, double attackSpeed) {
        this.damage = damage;
        this.attackSpeed = attackSpeed;
    }

    public int getDamage() {
        return damage;
    }
    public double getAttackSpeed() {
        return attackSpeed;
    }
}

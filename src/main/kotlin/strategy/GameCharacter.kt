package strategy

class GameCharacter {

    // 접근점
    private var weapon: Weapon? = null

    // 교환 가능
    fun setWeapon(weapon: Weapon) {
        this.weapon = weapon
    }

    fun attack() {
        val currentWeapon = weapon

        if (currentWeapon == null) {
            println("맨손 공격")
        } else {
            // 델리게이트
            currentWeapon.attack()
        }
    }
}
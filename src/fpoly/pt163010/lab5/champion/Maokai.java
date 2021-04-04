/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5.champion;

import fpoly.pt163010.lab5.IPhysicalAttack;
import fpoly.pt163010.lab5.LOLChampion;

/**
 *
 * @author Admin
 */
public class Maokai  extends LOLChampion // Đối tượng là tướng LOL
        implements IPhysicalAttack { // Đối tượng là tướng vật lý

    @Override
    public LOLChampion Build() {
        return new Maokai()
                .setName("Maokai")
                .setCreator("Thanhncph17576")
                .setArmor(39.0)
                .setAttack(64)
                .setHealth(565)
                .setMoveSpeed(335);
                //.setReleaseDate(18-02-2002);
    }

    @Override
    public void CastPhysicSkill() {
        System.out.println("World Ender");
    }

}

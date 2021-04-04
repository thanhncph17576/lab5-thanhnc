/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fpoly.pt163010.lab5;

import java.util.List;

public class Program {
    
    public static void main(String[] args) {
        // Lấy tất cả các tướng được khai báo trong package Champion
        List<LOLChampion> champions;
        champions = ChampionFactory.getAllChampions();
        
        // In thông tin các tướng và thực hiện kỹ năng
        champions.forEach(champion -> {
            System.out.println(champion);
            CastSkill(champion);
        });
    }
    
  
    
    private static void CastSkill(LOLChampion champion) {
        if (champion instanceof IMagicAttack) { // kỹ năng phép
            ((IMagicAttack) champion).CastMagicSkill();
        }
        if (champion instanceof IPhysicalAttack) { // kỹ năng vật lý
            ((IPhysicalAttack) champion).CastPhysicSkill();
        }
    }
}


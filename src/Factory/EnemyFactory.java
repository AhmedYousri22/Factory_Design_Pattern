package Factory;

import Enemys.Bird;
import Enemys.Enemy;
import Enemys.Turtle;


public class EnemyFactory
{
public final int turtle=1;
public final int bird=2;

    public static Enemy createEnemy(int id){
        switch (id)
        {
            case 1 : return new Turtle();
            case 2: return new Bird();
            default: return null;
        }


    }
}


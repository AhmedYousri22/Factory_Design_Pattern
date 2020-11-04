import Enemys.Enemy;
import Factory.EnemyFactory;

//import java.util.Random;

public class Test {
    //static Random random = new Random();
    public static void main(String[] args) {

            Enemy enemyFactory= EnemyFactory.createEnemy(1);
            enemyFactory.show();



    }
   /* public static int  getRandom(int id1, int id2){

        return random.nextInt( (id2 -id1) +1) + id1;
    }*/
    
}

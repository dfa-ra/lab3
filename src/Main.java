
import People.Characters.Female;
import People.Characters.Kid;
import Scene.Scene;
import TypeEnum.Hairstyle.FemaleHairstyle;
import TypeEnum.Gender;
import TypeEnum.Hairstyle.KidsHairstyle;
import TypeEnum.Positions;
import TypeEnum.Rank;

public class Main {
    public static void main(String[] args) {
        Kid alisa = new Kid("Alisa", Gender.FEMALE, Rank.NORMAL, KidsHairstyle.ANY, Positions.CASTLE);
        Female duchess = new Female("Duchess", Gender.FEMALE, Rank.DUCHEES, FemaleHairstyle.BUCCULA, Positions.CASTLE);
        Female queen = new Female("Queen", Gender.FEMALE, Rank.QUEEN, FemaleHairstyle.BUCCULA, Positions.CASTLE);
        Scene scene = new Scene();
        scene.addPerson(alisa.getName(), alisa);
        scene.addPerson(duchess.getName(), duchess);
        scene.addPerson(queen.getName(), queen);
        scene.startScene();
    }
}


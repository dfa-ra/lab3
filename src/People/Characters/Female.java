package People.Characters;

import INTERFACEs.InfoPers;
import People.Person;
import TypeEnum.Gender;
import TypeEnum.Hairstyle.FemaleHairstyle;
import TypeEnum.Positions;
import TypeEnum.Rank;

import java.util.Objects;

public class Female extends Person implements InfoPers<FemaleHairstyle> {

    protected FemaleHairstyle Hairstyle;
    public Female(String name, Gender gender, Rank rank, FemaleHairstyle hairstyle, Positions position) {
        super(name, rank, position, gender);
        Hairstyle = hairstyle;
    }
    @Override
    public FemaleHairstyle getHairstyle() {
        return Hairstyle;
    }

    @Override
    public String toString() {
        return "Female{" +
                "Hairstyle=" + Hairstyle +
                "name='" + name + '\'' +
                ", rank=" + rank +
                ", invite=" + invite +
                ", position=" + position +
                ", gender=" + gender +
                ", bow=" + bow +
                ", emotions=" + emotions +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Female female = (Female) o;
        return Hairstyle == female.Hairstyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Hairstyle);
    }
}

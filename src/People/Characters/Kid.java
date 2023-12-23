package People.Characters;

import INTERFACEs.InfoPers;
import People.Person;
import TypeEnum.Gender;
import TypeEnum.Hairstyle.KidsHairstyle;
import TypeEnum.Positions;
import TypeEnum.Rank;

import java.util.Objects;

public class Kid extends Person implements InfoPers<KidsHairstyle> {


    protected KidsHairstyle Hairstyle;
    public Kid(String name, Gender gender, Rank rank, KidsHairstyle hairstyle, Positions position) {
        super(name, rank, position, gender);
        Hairstyle = hairstyle;
    }
    @Override
    public KidsHairstyle getHairstyle() {
        return Hairstyle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kid kid = (Kid) o;
        return Hairstyle == kid.Hairstyle;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), Hairstyle);
    }

    @Override
    public String toString() {
        return "KID{" +
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
}
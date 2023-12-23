package People;

import Feelings.Emotion;
import TypeEnum.*;

import java.util.Objects;

public abstract class Person implements Emotion{
    protected String name;
    protected Rank rank;
    protected InvitationsToAction invite;
    protected Positions position;
    protected ActionRightNow action = ActionRightNow.STAY;
    protected Gender gender;
    protected boolean bow = false;
    protected Emotions emotions;

    public Person(String name, Rank rank, Positions position, Gender gender){
        this.gender=gender;
        this.name = name;
        this.rank = rank;
        this.position = position;
    }

    public void setInvite(InvitationsToAction invite) {
        this.invite = invite;
    }

    public String getName(){
        return name;
    }
    public Rank getRank(){
        return rank;
    }


    public void setPosition(Positions position){
        System.out.println(name + ": присвоено позиция - " + position);
        this.position = position;
    }

    public void setAction(ActionRightNow action){
        System.out.println(name + ": присвоено состояни - " + action);
        this.action=action;
    }

    public ActionRightNow getAction() {
        return action;
    }

    public Positions getPosition(){
        return position;
    }

    public Emotions getEmotions() {
        return emotions;
    }

    public Gender getGender(){
        return gender;
    }
    @Override
    public void setEmotion(Emotions emotion){
        emotions = emotion;
        System.out.println("Добавленна эмоция персонажу " + name + ": " + emotion);
    }

    @Override
    public String toString() {
        return "Person{" +
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
        Person person = (Person) o;
        return bow == person.bow && Objects.equals(name, person.name) && rank == person.rank && invite == person.invite && position == person.position && gender == person.gender && emotions == person.emotions;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rank, invite, position, gender, bow, emotions);
    }
}


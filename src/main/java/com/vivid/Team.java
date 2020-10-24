package com.vivid;

import java.util.List;
import java.util.Optional;

public class Team {

    private List<Person> members;

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    Person celebrity;

    public Person getCelebrity() {
        return celebrity;
    }

    public void setCelebrity(Person newCelebrity) {
        Optional<Person> currentCelebrity = Optional.ofNullable(this.celebrity);

        if(currentCelebrity.isPresent()){
            members.add(currentCelebrity.get());
        }
        members.remove(newCelebrity);
        this.celebrity = newCelebrity;
    }

    @Override
    public String toString() {
        return "Team{" +
                "members=" + members +
                ", celebrity=" + celebrity +
                '}';
    }
}

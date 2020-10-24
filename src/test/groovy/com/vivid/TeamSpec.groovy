package com.vivid

import spock.lang.Specification

class TeamSpec extends Specification {

    def "when a celebrity is seated in a team of People this must appear as celebrity in the team"(){

        given:
        Person nelson = new Person("nelson")
        Person john = new Person("john")
        Person tom = new Person("tom")
        Person brian = new Person("brian")
        List<Person> persons
        persons.add(nelson)
        persons.add(john)
        persons.add(tom)
        persons.add(brian)

        Team team = new Team()
        team.setMembers(persons)

        when:

        team.setCelebrity(tom)

        then:
        team.getCelebrity().is(tom)
    }

}

package com.example.demo;

import com.example.demo.repository.Member;
import com.example.demo.repository.Team;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class MemberRequest {
    private String name;
    private TeamRequest team;

    public Member toEntity(){
        return new Member(name, team.toEntity());

    }
    @Getter
    @NoArgsConstructor
    static class TeamRequest {
        private Long id;
        private String name;

        public Team toEntity(){
           return new Team(id, name);
        }
    }
}

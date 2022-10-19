package com.company.team.service;

import com.company.team.domain.Architect;
import com.company.team.domain.Designer;
import com.company.team.domain.Employee;
import com.company.team.domain.Programmer;

public class TeamService {
    private static int counter = 1; // 给memberId赋值用
    private final int MAX_MEMBER = 5;
    private Programmer[] team = new Programmer[MAX_MEMBER];
    private int total;

    public TeamService() {
        super();
    }

    // 获取开发团队中的所有成员
    public Programmer[] getTeam() {
        Programmer[] team = new Programmer[total];
        for (int i = 0; i < team.length; i++) {
            team[i] = this.team[i];
        }
        return team;
    }

    // 将指定的员工添加到团队中
    public void addMember(Employee e) throws TeamException {
        // 成员已满，无法添加
        if (total >= MAX_MEMBER) {
            throw new TeamException("成员已满，无法添加");
        }
        // 该成员不是开发人员，无法添加
        if (!(e instanceof Programmer)) {
            throw new TeamException("该成员不是开发人员，无法添加");
        }
//        该员工已在本开发团队中
        if (isExist(e)) {
            throw new TeamException("该员工已在本开发团队中");
        }
//        该员工已是某团队成员
//        该员正在休假，无法添加
        Programmer p = (Programmer) e;  // 已经进行过过滤，
        if (p.getStatus().getNAME().equals("BUSY")) {
            throw new TeamException("该员工已是某团队成员");
        } else if ("VOCATION".equals(p.getStatus().getNAME())) {
            throw new TeamException("该员正在休假，无法添加");
        }

//        团队中至多只能有一名架构师
//        团队中至多只能有两名设计师
//        团队中至多只能有三名程序员

        // 获取team中已有成员中的架构师，设计师，程序员的人数
        int numOfArch = 0, numOfDes = 0, numOfPro = 0;
        for (int i = 0; i < total; i++) {
            if (team[i] instanceof Architect) {
                numOfArch++;
            } else if (team[i] instanceof Designer) {
                numOfDes++;
            } else if (team[i] instanceof Programmer) {
                numOfPro++;
            }
        }
        if (p instanceof Architect) {
            if (numOfArch >= 1) {
                throw new TeamException("团队中至多只能有一名架构师");
            }
        } else if (p instanceof Designer) {
            if (numOfDes >= 2) {
                throw new TeamException("团队中至多只能有两名设计师");
            }
        } else if (p instanceof Programmer) {
            if (numOfPro >= 3) {
                throw new TeamException("团队中至多只能有三名程序员");
            }
            // 将p添加到team中
            p.setStatus(Status.BUSY);
            p.setMemberId(counter++);

            team[total++] = p;
            // p的属性赋值
        }
    }

    // 判断指定的员工是否存在于现有的开发团队中
    private boolean isExist(Employee e) {
        for (int i = 0; i < total; i++) {
            if (team[i].getId() == e.getId()) {
                return true;
            }
        }
        return false;
    }

    // 从团队中删除成员
    public void removeMember(int menberId) throws TeamException {
        int i = 0;
        for (; i < total; i++) {
            if (team[i].getMemberId() == menberId) {
                team[i].setStatus(Status.FREE);
                break;
            }
        }
        // 未找到指定的memberId的情况
        if(i == total){
            throw new TeamException("找不到指定的memberID的员工，删除失败");
        }
        for (int j = i + 1; j < total; j++) {
            team[j - 1] = team[j];
        }
        team[--total] = null;
    }

}

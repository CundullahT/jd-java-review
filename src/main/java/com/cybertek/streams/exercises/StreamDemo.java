package com.cybertek.streams.exercises;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

    //Task-1
    public static List<Project> getListOfProject(){
        return DataGenerator.getProjects();
    }


    //Task-2
    public static List<Project> getListOfProject(Status status){
        return DataGenerator.getProjects().stream().filter(project -> project.getProjectStatus().equals(status)).collect(Collectors.toList());
    }


    //Task-3
    public static List<Project> getListOfProject(User manager){
        return DataGenerator.getProjects().stream().filter(project -> project.getAssignedManager().equals(manager)).collect(Collectors.toList());
    }


    //Task-4
    public static List<Project> getProjectByProjectCode(String projectCode){
        return DataGenerator.getProjects().stream().filter(project -> project.getProjectCode().equals(projectCode)).collect(Collectors.toList());
    }


    //Task-5
    public static List<User> getListUsers(){
        return DataGenerator.getUsers();
    }


    //Task-6
    public static User getUserByFirstName(String firstName) throws Exception {
        return DataGenerator.getUsers().stream().filter(user -> user.getFirstName().equals(firstName)).findAny().orElseThrow(() -> new Exception("No User Found With This Name!"));
    }


    //Task-7
    public static String getUserByUserId(Long id) throws Exception {
        return DataGenerator.getUsers().stream().filter(user -> user.getId() == id).findAny().orElseThrow(() -> new Exception("No User Found With This Name!")).getFirstName();
    }


    //Task-8
    public static List<User> deleteUser(String firstName){
        return DataGenerator.getUsers().stream().filter(user -> !(user.getFirstName().equals(firstName))).collect(Collectors.toList());
    }


    //Task-9
    public static List<Project> updateProjectStatus(Status oldStatus,Status newStatus){
        return DataGenerator.getProjects().stream().filter(project -> project.getProjectStatus().equals(oldStatus)).map(project -> {
            project.setProjectStatus(newStatus);
            return project;
        }).collect(Collectors.toList());
    }


    //Task-10
    public static List<Project> findProjectByManager(User manager){
        return DataGenerator.getProjects().stream().filter(project -> project.getAssignedManager().equals(manager)).collect(Collectors.toList());
    }


    //Task-11 - Period
    public static Integer totalProjectDurationForManager(User manager) {
        return DataGenerator.getProjects().stream().filter(project -> project.getAssignedManager().equals(manager))
                            .map(project -> {
                                return project.getStartDate().compareTo(project.getEndDate());
                            }).reduce((x, y) -> x + y).get();
    }


    //Task-12
    public static long findTotalMaleInCompany(){
        return DataGenerator.getUsers().stream().filter(user -> user.getGender().equals(Gender.MALE)).count();
    }





}

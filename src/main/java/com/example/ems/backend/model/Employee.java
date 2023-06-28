package com.example.ems.backend.model;
import javax.persistence.*;
import java.sql.Date;

@Entity

@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "first_name")
    private String first_name;

    @Column(name = "last_name")
    private String last_name;

    @Column(name = "date_of_birth")
    private Date date_of_birth;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "email")
    private String email;

    @Column(name = "position")
    private String position;

    @Column(name = "department")
    private String department;

    @Column(name = "hire_date")
    private Date hire_date;

    @Column(name = "salary")
    private double salary;

    @Column(name = "work_schedule")
    private String work_schedule;

    @Column(name = "supervisor")
    private String supervisor;

    @Column(name = "performance_evaluation")
    private String performance_evaluation;

    @Column(name = "leaves")
    private String leaves;

    @Column(name = "trainings")
    private String trainings;

    @Column(name = "bank_details")
    private String bank_details;

    @Column(name = "benefits")
    private String benefits;

    @Column(name = "notes")
    private String notes;

    @Column(name = "gender")
    private String gender;

    public Employee(Long id, String first_name, String last_name, Date date_of_birth, String address, String phone_number, String email, String position, String department, java.util.Date hire_date, double salary, String work_schedule, String supervisor, String performance_evaluation, String leaves, String trainings, String bank_details, String benefits, String notes, String gender) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.phone_number = phone_number;
        this.email = email;
        this.position = position;
        this.department = department;
        this.hire_date = (Date) hire_date;
        this.salary = salary;
        this.work_schedule = work_schedule;
        this.supervisor = supervisor;
        this.performance_evaluation = performance_evaluation;
        this.leaves = leaves;
        this.trainings = trainings;
        this.bank_details = bank_details;
        this.benefits = benefits;
        this.notes = notes;
        this.gender = gender;
    }
    public Employee() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getHire_date() {
        return hire_date;
    }

    public void setHire_date(Date hire_date) {
        this.hire_date = hire_date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWork_schedule() {
        return work_schedule;
    }

    public void setWork_schedule(String work_schedule) {
        this.work_schedule = work_schedule;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getPerformance_evaluation() {
        return performance_evaluation;
    }

    public void setPerformance_evaluation(String performance_evaluation) {
        this.performance_evaluation = performance_evaluation;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public String getTrainings() {
        return trainings;
    }

    public void setTrainings(String trainings) {
        this.trainings = trainings;
    }

    public String getBank_details() {
        return bank_details;
    }

    public void setBank_details(String bank_details) {
        this.bank_details = bank_details;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}

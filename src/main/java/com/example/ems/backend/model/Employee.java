package com.example.ems.backend.model;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.sql.Date;

@Entity
@Valid
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue
    private long id;

    @NotBlank(message = "first name is required" )
    @NotNull(message = " first name cannot be null")
    @Size(min= 3, max = 20, message = "please enter from 3 to 20 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Please enter only letters. if you don't do this I will fuck you in the ass")
    @Column(name = "first_name")
    private String first_name;

    @NotBlank(message = "last name is required" )
    @NotNull(message = " last name cannot be null")
    @Size(min = 3, max = 20, message = "please enter from 3 to 20 characters")
    @Pattern(regexp = "^[A-Za-z]+$", message = "Please enter only letters. if you don't do this I will fuck you in the ass")
    @Column(name = "last_name")
    private String last_name;



    @NotNull(message = " last name cannot be null")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "Date of birth must be in the past.")
    @Column(name = "date_of_birth")
    private Date date_of_birth;


    @NotBlank(message = "address is required")
    @NotNull(message = "address cannot be null")
    @Size(max = 100, message = "The address must be a maximum of 100 characters.")
    @Column(name = "address")
    private String address;


    @NotBlank(message = "phone is required" )
    @NotNull(message = "phone number cannot be null")
    @Pattern(regexp = "\\d{10}", message = "The phone number must contain 10 digits.")
    @Column(name = "phone_number")
    private String phone_number;

    @NotBlank(message = "email is required" )
    @NotNull(message = "email cannot be null")
    @Email(message = "email is not valid.")
    @Column(name = "email")
    private String email;

    @NotBlank(message = "position is required" )
    @Column(name = "position")
    private String position;

    @NotBlank(message = "department is required" )
    @NotNull(message = "department is required")
    @Column(name = "department")
    private String department;

  //  @NotBlank(message = "hire date is required" )
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @Past(message = "The hire date must be in the past.")
    @Column(name = "hire_date")
    private Date hire_date;


    @NotNull(message = "Salary is required")
    @Min(value = 0, message = "The salary cannot be less than 0.")
    @Max(value = 1000000, message = "Salary cannot exceed 100000.")
    @Column(name = "salary")
    private double salary;

    @NotNull(message = "work schedule cannot be null.")
    @NotBlank(message = "Salary is required")
    @Column(name = "work_schedule")
    private String work_schedule;

    @NotNull(message = "supervisor cannot be null.")
    @NotBlank(message = "supervisor is required")
    @Column(name = "supervisor")
    private String supervisor;


    @NotNull(message = "performance evaluation cannot be null")
    @Column(name = "performance_evaluation")
    private double performance_evaluation;

    @NotNull(message = "leave cannot be null")
    @Column(name = "leaves")
    private String leaves;

    @NotEmpty(message = "tranings cannot be empty")
    @Column(name = "trainings")
    private String trainings;

    @Column(name = "bank_details")
    private String bank_details;

    @Column(name = "benefits")
    private String benefits;

    @Column(name = "notes")
    private String notes;

    @NotEmpty(message = "gender cannot be empty")
    @Column(name = "gender")
    private String gender;

    public Employee(Long id, String first_name, String last_name, Date date_of_birth, String address, String phone_number, String email, String position, String department, java.util.Date hire_date, double salary, String work_schedule, String supervisor, double performance_evaluation, String leaves, String trainings, String bank_details, String benefits, String notes, String gender) {
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

    public String getFirst_name() {
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

    public double getPerformance_evaluation() {
        return performance_evaluation;
    }

    public void setPerformance_evaluation(double performance_evaluation) {
        this.performance_evaluation = performance_evaluation;
    }

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leave) {
        this.leaves = leave;
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

package am.logiclab.calorieguard.model.user;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Short age;
    private Float weight;
    private Float height;

    @Enumerated(EnumType.STRING) // Պահպանում է որպես տեքստ PostgreSQL-ում
    private Goal goal;

    public User() {
    }

    public User(Long id, String name, String email, Short age, Float weight, Float height, Goal goal) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goal = goal;
    }

    public User(String name, String email, Short age, Float weight, Float height, Goal goal) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.goal = goal;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }
}

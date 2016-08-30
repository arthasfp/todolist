package todos.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String login;

    @OneToMany(mappedBy = "user")
    private Set<Todo> todos = new HashSet<>();
}

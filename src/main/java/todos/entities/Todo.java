package todos.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "todo")
public class Todo {

    @Id
    @GeneratedValue
    private Integer id;

    private String text;

    @Column(nullable = false)
    private Boolean closed = false;

    @JsonIgnore
    @ManyToOne
    private User user;
}

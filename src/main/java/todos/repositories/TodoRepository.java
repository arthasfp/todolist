package todos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todos.entities.Todo;

import java.util.Collection;


@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer> {
    Collection<Todo> findByUserLogin(String login);
}

package LoginSpring.Repository;

import LoginSpring.Model.Task;
import LoginSpring.Model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task,String> {
    Page<Task> findAllByTitleContain(String title, Pageable pageable);

    Page<Task> findAllByContainAndActionContain (String title, String action, Pageable pageable);
}

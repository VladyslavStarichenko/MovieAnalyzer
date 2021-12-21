package nure.ua.MovieAnalyzer.repository.role;



import nure.ua.MovieAnalyzer.models.user.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends PagingAndSortingRepository<Role,Long> {
    Role findByName(String name);
}

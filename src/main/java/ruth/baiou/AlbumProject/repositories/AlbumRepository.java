package ruth.baiou.AlbumProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ruth.baiou.AlbumProject.entities.Album;

public interface AlbumRepository extends JpaRepository<Album, Long> {

}


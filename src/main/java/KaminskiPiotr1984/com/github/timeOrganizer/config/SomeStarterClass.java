package KaminskiPiotr1984.com.github.timeOrganizer.config;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Role;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.RoleRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component @Profile("heroku")
public class SomeStarterClass implements ApplicationRunner {

    private final RoleRepository roleRepository;

    public SomeStarterClass(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }


    @Override @Transactional
    public void run(ApplicationArguments args) throws Exception {

        Role userRole = new Role();
        userRole.setName("ROLE_USER");
        roleRepository.save(userRole);

    }
}

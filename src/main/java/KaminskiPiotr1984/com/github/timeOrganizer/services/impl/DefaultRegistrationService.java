package KaminskiPiotr1984.com.github.timeOrganizer.services.impl;

import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.Role;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.entities.User;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.RoleRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.domain.repositories.UserRepository;
import KaminskiPiotr1984.com.github.timeOrganizer.dtos.RegistrationDataDTO;
import KaminskiPiotr1984.com.github.timeOrganizer.services.RegistrationService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DefaultRegistrationService implements RegistrationService {

    private final PasswordEncoder passwordEncoder;
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public DefaultRegistrationService(PasswordEncoder passwordEncoder, UserRepository userRepository, RoleRepository roleRepository) {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public void register(RegistrationDataDTO registrationData) {
        ModelMapper mapper = new ModelMapper();
        User user = mapper.map(registrationData, User.class);
        user.setActive(Boolean.TRUE);
        String encodedPassword = passwordEncoder.encode(registrationData.getPassword());
        user.setPassword(encodedPassword);
        Role roleUser = roleRepository.getByName("ROLE_USER");
        user.getRoles().add(roleUser);
        userRepository.save(user);

    }
}
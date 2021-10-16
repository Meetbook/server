package murari.besocial.utils.entitiesSeed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import murari.besocial.domain.entities.UserRole;
import murari.besocial.repositories.RoleRepository;

import javax.annotation.PostConstruct;

@Component
public class EntitiesSeedExecutor {
    private final RoleRepository roleRepository;

    @Autowired
    public EntitiesSeedExecutor(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void insertEntities() {

        // Role initialisation
        if(roleRepository.count() == 0L ){
            UserRole role1 = new UserRole();
            UserRole role2 = new UserRole();
            UserRole role3 = new UserRole();
            role1.setAuthority("ADMIN");
            role2.setAuthority("USER");
            role3.setAuthority("ROOT");
            this.roleRepository.save(role1);
            this.roleRepository.save(role2);
            this.roleRepository.save(role3);
        }
    }
}

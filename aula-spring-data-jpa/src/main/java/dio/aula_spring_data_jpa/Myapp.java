package dio.aula_spring_data_jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula_spring_data_jpa.Model.User;
import dio.aula_spring_data_jpa.Repository.UserRepository;



@Component
public class Myapp implements CommandLineRunner {
    @Autowired
    private UserRepository  repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("João");
        user.setUsername("may");
        user.setPassword("dio123");

        repository.save(user);

        for(User u:repository.findAll()){
            System.out.println(u);

        }

    }

}

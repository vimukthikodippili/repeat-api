package lk.ijse.conflic;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse")
public class WebAppConflic {
    @Bean
    public ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}

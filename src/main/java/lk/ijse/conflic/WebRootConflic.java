package lk.ijse.conflic;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({JPAConflic.class})
public class WebRootConflic {
}

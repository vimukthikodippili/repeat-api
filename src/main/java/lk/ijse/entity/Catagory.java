package lk.ijse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Catagory {
    @Id
    private String CatagoryID;
    private String CatagoryName;


    @OneToMany(mappedBy = "catagories",cascade = CascadeType.ALL)
    private List<Product> products=new ArrayList<>();


}

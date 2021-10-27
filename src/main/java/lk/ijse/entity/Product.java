package lk.ijse.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product {
    @Id
    private String productID;
    private String name;
    private String description;
    private String price;
    private String img;
    @ManyToOne(optional = false)
    private Catagory catagories;

    public Catagory getCatagories() {
        return catagories;
    }

    public void setCatagories(Catagory catagories) {
        this.catagories = catagories;
    }
}

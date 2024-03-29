package mobiLeLe.domain.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
//import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class BaseEntity {
    @Id
    //@GeneratedValue(generator = "uuid-string")
    //@GenericGenerator(name = "uuid-string", strategy = "ogr.hibernate.id.UUIDGenerator")
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    public BaseEntity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

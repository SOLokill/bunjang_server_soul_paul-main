package Sessac.ThunderMarket.src.market.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.AllArgsConstructor;
import javax.persistence.*;
import java.sql.Date;

import static javax.persistence.GenerationType.SEQUENCE;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Entity
@Table(name = "market")
public class Market {
    @Id
    @GeneratedValue(strategy=SEQUENCE, generator="ID_SEQ")
    @Column(name = "marketId")
    private int marketId;
    private String marketName;
    private String phone;
    private String myName;
    private String marketDetail;
    private String marketPicture;
    private int bungaePoint;
    private Date createdDate;
    private Date updateDate;
    private int status;
}
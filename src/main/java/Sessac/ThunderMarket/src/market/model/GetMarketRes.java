package Sessac.ThunderMarket.src.market.model;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import java.sql.Date;

@Getter
@Setter
@AllArgsConstructor
public class GetMarketRes {
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

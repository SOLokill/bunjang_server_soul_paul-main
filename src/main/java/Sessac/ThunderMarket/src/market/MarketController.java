package Sessac.ThunderMarket.src.market;

import Sessac.ThunderMarket.src.market.model.GetMarketRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.sql.DataSource;
import java.util.List;

public class MarketController {
    final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private final MarketProvider marketProvider;
    @Autowired
    private final MarketService marketService;
    @Autowired
    private final JwtService jwtService;

}

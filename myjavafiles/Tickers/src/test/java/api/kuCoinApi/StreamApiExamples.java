package api.kuCoinApi;
import io.restassured.http.ContentType;
import io.restassured.internal.common.assertion.Assertion;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

public class StreamApiExamples {
    public List<TickerData> getTickers(){
        return given()
                .contentType(ContentType.JSON)
                .when()
                .get("https://api.kucoin.com/api/v1/market/allTickers")
                .then().log().body()
                .extract().jsonPath().getList("data.ticker", TickerData.class);
    }

    @Test
    public void checkCripto(){
        List<TickerData> usdTickers = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).collect(Collectors.toList());
        assertTrue(usdTickers.stream().allMatch(x->x.getSymbol().endsWith("USDT")));
        int i = 0;
    }

    @Test //run as debug
    public void sortHighToLow(){
        List<TickerData> hightoLow = getTickers().stream().filter(x -> x.getSymbol().endsWith("USDT")).sorted(new Comparator<TickerData>() {
            @Override
            public int compare(TickerData o1, TickerData o2) {
                return o2.getChangeRate().compareTo(o1.getChangeRate());
            }
        }).collect(Collectors.toList());
        List<TickerData> top10 = hightoLow.stream().limit(10).collect(Collectors.toList());
        Assert.assertEquals(top10.get(0).getSymbol(), "GAME-USDT");
        int a = 0;
    }

    @Test //run as debug
    public void sortLowToHigh(){
        List<TickerData> lowToHigh = getTickers().stream().filter(x -> x.getSymbol().endsWith("USDT")).sorted(new TickerComporatorLow())
                .limit(10).collect(Collectors.toList());
        int a = 0;
    }

    @Test
    public void map(){
        //Map<String, Float> usd = new HashMap<>(); //пример с хэш-картой
        //List<TickerData> lowToHigh = getTickers().stream().filter(x->x.getSymbol().endsWith("USDT")).sorted(new TickerComporatorLow())
        //         .limit(10).collect(Collectors.toList());
        //getTickers().stream().limit(10).forEach(x -> usd.put(x.getSymbol(), Float.parseFloat(x.getChangeRate())));
        List<TickerShort> shortTicker = new ArrayList<>();
        getTickers().forEach(x -> shortTicker.add(new TickerShort(x.getSymbol(), Float.parseFloat(x.getChangeRate()))));
        int a = 0;
    }
}
